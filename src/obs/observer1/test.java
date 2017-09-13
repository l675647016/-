package obs.observer1;

import obs.observer1.observer.CurrentConditionsDisplay;
import obs.observer1.observer.ForecastDisplay;
import obs.observer1.observer.HeatIndexDisplay;
import obs.observer1.observer.StatisticsDisplay;
import obs.observer1.subject.WeatherData;

/**
 * Created by 梁峻磊 on 2017/9/13.
 */
public class test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);


        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,29.2f);
        weatherData.setMeasurements(85,82,35.2f);
    }
}
