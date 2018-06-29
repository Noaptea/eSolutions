package p13observer;

public interface WeatherObserver {

    void update(WeatherType currentWeather);

    default void observerAdded(){
        System.out.println("Observer added: "+ this);
    }
}
