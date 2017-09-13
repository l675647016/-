package Tactics.fly_behavior;

import Tactics.fly_behavior.FlyBehavior;

/**
 * Created by 梁峻磊 on 2017/9/12.
 * 火箭动力飞行行为，帮助不会飞的鸭子飞行
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I`m flying with a rocket");
    }
}
