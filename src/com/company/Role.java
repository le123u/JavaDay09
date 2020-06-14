package com.company;

public class Role {

    private int id; //角色id
    private int blood; //生命值
    private String name;//角色名

    // 添加武器属性
    private Weapon wp;

    // 添加盔甲属性
    private Armour ar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWp() {
        return wp;
    }

    public void setWp(Weapon wp) {
        this.wp = wp;
    }

    public Armour getAr() {
        return ar;
    }

    public void setAr(Armour ar) {
        this.ar = ar;
    }
    // 添加攻击方法
    public void attack (){
        System.out.println("使用"+wp.getHurt()+",造成"+wp.getHurt()+"点伤害");
    }
    // 穿戴盔甲方法
    public void wear(){
        // 增加血量
        this.blood += ar.getProtect();
        System.out.println("穿上"+ar.getName()+",生命值增加"+ar.getProtect());
    }
}
