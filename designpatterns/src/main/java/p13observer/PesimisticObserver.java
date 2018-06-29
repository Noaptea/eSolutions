package p13observer;

import lombok.ToString;

@ToString
public class PesimisticObserver implements WeatherObserver {

    @Override
    public void update(WeatherType currentWeather) {
        System.out.println(String.format("OMFG is %s again !!!",currentWeather));
    }
}
