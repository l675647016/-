package Tactics.duck;

import Tactics.fly_behavior.FlyWithWings;
import Tactics.quack_behavior.Quack;

/**
 * Created by 梁峻磊 on 2017/9/12.
 * 绿头鸭子，会飞，呱呱叫
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I`m a really MallardDuck");
    }
}
