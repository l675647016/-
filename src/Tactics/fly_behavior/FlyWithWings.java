package Tactics.fly_behavior;

import Tactics.fly_behavior.FlyBehavior;

/**
 * Created by 梁峻磊 on 2017/9/12.
 * 飞行行为实现，给会飞的鸭子用
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I`m flying!");
    }
}
