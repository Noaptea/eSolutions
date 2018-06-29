package p13observer;

import com.google.common.collect.Lists;
import lombok.val;

import java.util.Iterator;
import java.util.List;

public class Weather {

private final List<WeatherObserver> observers;

private Iterator<WeatherType> currentWeather;

    public Weather() {

        observers = Lists.newArrayList();
        currentWeather = WeatherType.SUNNY.iterator();

    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
        observer.observerAdded();
    }

    public void notifyObservers(WeatherType currentWeather){
        observers.forEach(observer -> observer.update(currentWeather));
    }

    public void timePasses(){

        WeatherType currentWeather = this.currentWeather.next();
        System.out.println(String.format("Weather changed to: %s",currentWeather.toString()));

        notifyObservers(currentWeather);

    }
}
