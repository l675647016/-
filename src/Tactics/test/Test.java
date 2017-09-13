package Tactics.test;

import Tactics.duck.Duck;
import Tactics.duck.MallardDuck;
import Tactics.duck.ModelDuck;
import Tactics.fly_behavior.FlyRocketPowered;

/**
 * Created by 梁峻磊 on 2017/9/12.
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        //创建绿头鸭
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("-----------------------");

        //创建模型鸭
        Duck modelDuck = new ModelDuck();
        //开始不具有飞行能力
        modelDuck.performFly();
        //添加火箭系统
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        //具有飞行能力
        modelDuck.performFly();;
    }
}
