package com.baizhi.factory;
//具体某中人种的类
public class WhiteHuman implements AbstractHuman{
    @Override
    public void getColor() {
        System.out.println("我是白种人,所以皮肤是白色的！！！");
    }

    @Override
    public void talk() {
        System.out.println("我们是用拉丁语交流的！！！");
    }
}
