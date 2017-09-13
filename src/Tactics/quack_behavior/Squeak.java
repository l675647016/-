package Tactics.quack_behavior;

import Tactics.quack_behavior.QuackBehavior;

/**
 * Created by 梁峻磊 on 2017/9/12.
 * 实现鸭子吱吱叫
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
