package com.baizhi.factory;

public class Test {
    public static void main(String[] args) {
        HumanFactory factory = new HumanFactory();
        BlackHuman human = factory.createHuman(BlackHuman.class);
        human.getColor();
        human.talk();
        WhiteHuman human1 = factory.createHuman(WhiteHuman.class);
        human1.getColor();
        human1.talk();
        YellowHuman human2 = factory.createHuman(YellowHuman.class);
        human2.getColor();
        human2.talk();
    }
}
