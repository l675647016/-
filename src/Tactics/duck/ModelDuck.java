package Tactics.duck;

import Tactics.fly_behavior.FlyNoWay;
import Tactics.quack_behavior.Quack;

/**
 * Created by 梁峻磊 on 2017/9/12.
 * 模型鸭，不会飞
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I`m a model duck");
    }
}
