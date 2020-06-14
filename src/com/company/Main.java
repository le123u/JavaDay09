package com.company;

public class Main {
    // 格式
//    class B {
//        class A{
//
//        }
//    }

    // 成员内部类访问特点
    // 1.内部类可以直接访问外部类成员包括私有成员
    // 2.外部类要想访问内部类的成员必须要建立内部类的对象
    //格式：外部类名.内部类名 对象名 = new 外部类型（）.new 内部类型（）;
    public static void main(String[] args) {
        Person person1 = new Person("皮皮虾",14);
        Person person2 = new Person("皮皮虾",14);
        System.out.println(person1.equals(person2));
    }



}

