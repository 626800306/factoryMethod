package com.baizhi.factory;
//创建人类的工厂接口
public interface AbstractHumanFactory {
//     工厂创建人类的方法
     <T extends AbstractHuman> T createHuman(Class<T> clazz);
}
