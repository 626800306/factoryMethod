package com.baizhi.factory;
//具体某中人种的类
public class YellowHuman implements AbstractHuman {
    @Override
    public void getColor() {
        System.out.println("我是黄种人,皮肤是黄色的！！！！");
    }


    @Override
    public void talk() {
        System.out.println("我们用汉语交流！！！");
    }
}
