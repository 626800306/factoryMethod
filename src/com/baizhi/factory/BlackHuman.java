package com.baizhi.factory;
//具体某中人种的类
public class BlackHuman implements AbstractHuman {
    @Override
    public void getColor() {
        System.out.println("我是黑色人种,所以皮肤是黑色的！！！！");
    }

    @Override
    public void talk() {
        System.out.println("英语,是我们的母语！！！");
    }
}
