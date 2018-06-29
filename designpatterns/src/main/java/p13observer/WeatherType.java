package p13observer;

import lombok.val;

import java.util.Iterator;

public enum WeatherType implements Iterable {

    SUNNY, RAINY, WINDY, COLD;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }

    @Override
    public Iterator<WeatherType> iterator() {

        final WeatherType initialWeather = this;

        return new Iterator<WeatherType>() {
            WeatherType currentWeather;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public WeatherType next() {
                if(currentWeather==null){
                    currentWeather = initialWeather;
                    return currentWeather;
                }
                val enumValues = WeatherType.values();

                val currentWheatherPosition = currentWeather.ordinal();
                val nextWeatherposition = (currentWheatherPosition +1)% enumValues.length;

                currentWeather = enumValues[nextWeatherposition];
                return currentWeather;
            }
        };
    }
}
