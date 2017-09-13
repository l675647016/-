package obs.observer1.observer;

import obs.observer1.subject.Subject;

/**
 * Created by 梁峻磊 on 2017/9/13.
 * 显示当前的温度、湿度
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    //构造器需要weatherData对象，作为注册使用
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        //注册为观察者
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float perssure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "& humidity");
    }
}
