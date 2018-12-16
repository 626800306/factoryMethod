package com.baizhi.factory;
//工厂的实现类
public class HumanFactory implements AbstractHumanFactory {
//    抽象方法的实现  参数为类对象 注意
    @Override
    public <T extends AbstractHuman> T createHuman(Class<T> clazz) {
        T o = null;
        try {
//            根据反射创建出对象然后强转为某个具体的实体
            o = (T)Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }
}
