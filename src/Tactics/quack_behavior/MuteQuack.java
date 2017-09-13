package Tactics.quack_behavior;

/**
 * Created by 梁峻磊 on 2017/9/12.
 * 实现鸭子不会叫
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence!");
    }
}
