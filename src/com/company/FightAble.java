package com.company;

public interface FightAble {

    // 抽象方法 specialFight
    public abstract void specialFight();

    // 默认方法 commonFight,方法中打印普通打击
    public default void commonFight(){
        System.out.println("普通打击");
    }
}
