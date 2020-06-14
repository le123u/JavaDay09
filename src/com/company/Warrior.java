package com.company;

public class Warrior implements FightAble {
    // 实现FightAble接口 重写方法中打印“普通打击”
    @Override
    public void specialFight() {

        System.out.println("普通打击");
    }

    @Override
    public void commonFight() {


    }



}
