package Tactics.quack_behavior;

/**
 * Created by 梁峻磊 on 2017/9/12.\
 * 实现鸭子呱呱叫
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
