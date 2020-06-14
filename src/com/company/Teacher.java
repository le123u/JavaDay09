package com.company;

public class Teacher {
    // 属性： 姓名
    private String name;

    // 无参构造方法
    public Teacher() {

    }
    // 有参构造方法


    public Teacher(String name) {
        this.name = name;
    }

    // get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 成员方法：点名方法 设置每一名同学的出勤情况 假设小明今日未出勤
    public void order(){
        System.out.println(name+"今日未出勤");
    }
}
