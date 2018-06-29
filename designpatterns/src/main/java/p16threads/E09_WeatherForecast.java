package p16threads;

import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;
import lombok.val;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonPointer;
import javax.json.JsonReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class E09_WeatherForecast {

    private static final String WEATHER_URL = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22bucharest%2C%20ro%22)%20and%20u%3D'c'&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys\n";

    public static void main(String[] args) {

        val pool = Executors.newFixedThreadPool(3);

        CompletableFuture<Optional<String>> step1 = CompletableFuture.supplyAsync(() ->{

            try (InputStream is = new URL(WEATHER_URL).openStream()){
                System.out.println("Downloading JSON inside thread" + Thread.currentThread().getName());
                return Optional.of(CharStreams.toString(new InputStreamReader(is, Charsets.UTF_8)));
            }
            catch (MalformedURLException e){
                e.printStackTrace();
            }
            catch (IOException e){
                e.printStackTrace();
            }

            return Optional.empty();
        }, pool);

        val step2 = step1.<Optional<JsonArray>>thenApplyAsync(result -> {

            if (result.isPresent()) {

                System.out.println("Parsing JSON in thread: " + Thread.currentThread().getName() + "\n");

                JsonReader reader = Json.createReader(new StringReader(result.get()));

                JsonPointer pointer = Json.createPointer("/query/results/channel/item/forecast");

                JsonArray forecastArray = pointer.getValue(reader.readObject()).asJsonArray();

                return Optional.of(forecastArray);

            }

            return Optional.empty();

        }, pool);

        step2.thenAcceptAsync(finalResult -> {

            if(finalResult.isPresent()){
                finalResult.get().forEach(jsonValue -> {
                    System.out.println(jsonValue.asJsonObject().getString("day")+" "+jsonValue.asJsonObject().getString("text")+ " " + jsonValue.asJsonObject().getString("date"));
                });
            }
            else{
                System.out.println("Something went wrong");
            }
        });

        new Scanner(System.in).nextLine();
        pool.shutdown();
    }

}
