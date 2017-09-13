package Tactics.fly_behavior;

import Tactics.fly_behavior.FlyBehavior;

/**
 * Created by 梁峻磊 on 2017/9/12.
 * 不会飞的鸭子用
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can`t fly");
    }
}