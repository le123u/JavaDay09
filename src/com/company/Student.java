package com.company;

public class Student {
    // 属性：姓名 出勤
    private String name;
    private boolean chuQin = true;

    // 构造方法

    // 无参构造方法
    public Student() {

    }
    // 有参构造方法
    public Student(String name, boolean chuQin) {
        this.name = name;
        this.chuQin = chuQin;
    }

    // get set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChuQin() {
        return chuQin;
    }

    public void setChuQin(boolean chuQin) {
        this.chuQin = chuQin;
    }
}
