package p13observer;

import lombok.ToString;

@ToString
public class OptimisticObserver implements WeatherObserver {
    @Override
    public void update(WeatherType currentWeather) {
        System.out.println(String.format("Yeeei it's %s again !!!", currentWeather));
    }
}
