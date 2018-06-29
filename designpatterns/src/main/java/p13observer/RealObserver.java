package p13observer;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class RealObserver implements WeatherObserver {

    private String name;
    private String mood;

    @Override
    public void update(WeatherType currentWeather) {
        System.out.println(String.format("Weather changed to: %s, Observer %s is %s", currentWeather, name, mood));
    }
}
