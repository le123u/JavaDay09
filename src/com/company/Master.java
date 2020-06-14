package com.company;

public class Master implements FightAble{
    // 实现FightAble接口 重写方法中打印“法术攻击”
    @Override
    public void specialFight() {

        System.out.println("法术攻击");
    }

    @Override
    public void commonFight() {


    }


}
