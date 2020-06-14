package com.company;

public class Test02 {
    public static void main(String[] args) {
        Player player = new Player();

        String str  = "法力角色";
        System.out.println("选择:"+ str);
        FightAble fightAble1 = player.select(str);
        fightAble1.specialFight();
        fightAble1.commonFight();

        System.out.println("=================");

        str = "武力角色";
        System.out.println("选择:"+ str);
        FightAble fightAble2 = player.select(str);
        fightAble2.specialFight();
        fightAble2.commonFight();

    }
}
