package obs.observer1.observer;

import obs.observer1.subject.Subject;

/**
 * Created by 梁峻磊 on 2017/9/13.
 * 天气预报
 */
public class ForecastDisplay implements Observer,DisplayElement{

    private float currentPressure = 29.9f;
    private float lastPerssure;
    private Subject weatherData;

    //构造器需要weatherData对象，作为注册使用
    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        //注册为观察者
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float perssure) {
        lastPerssure = currentPressure;
        currentPressure = perssure;
        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPerssure){
            System.out.println("Improving weather on the way!");
        }else if (currentPressure == lastPerssure){
            System.out.println("More of the same");
        }else if(currentPressure < lastPerssure){
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
