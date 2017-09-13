package obs.observer1.observer;

import obs.observer1.subject.Subject;

/**
 * Created by 梁峻磊 on 2017/9/13.
 * 显示最小、平均和最大的温度观测值
 */
public class StatisticsDisplay implements Observer,DisplayElement{

    private float maxTemp = 0;
    private float minTemp = 100;
    private float tempSum = 0;
    private int nums = 0;//记录被观测次数
    private Subject weatherData;

    //构造器需要weatherData对象，作为注册使用
    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        //注册为观察者
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float perssure) {
        tempSum += temp;
        nums++;

        if (temp > maxTemp)
            maxTemp = temp;

        if (temp < minTemp)
            minTemp = temp;

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / nums)
                + "/" + maxTemp + "/" + minTemp);
    }
}
