package obs.observer1.subject;

import obs.observer1.observer.Observer;

import java.util.ArrayList;

/**
 * Created by 梁峻磊 on 2017/9/13.
 */
public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float perssure;
    private ArrayList observers;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i=0;i<observers.size();i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature,humidity,perssure);
        }
    }

    public void setMeasurements(float temperature,float humidity,float perssure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.perssure = perssure;
        measurementsChanged();
    }

    private void measurementsChanged() {
        notifyObservers();
    }
}
