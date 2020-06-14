package com.company;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private boolean live = true;

    public Person(String name, int age) {
    }

    // 创建内部类
    class Heart{
        public void jump(){
            // 直接访问外部成员
            if (live){
                System.out.println("心扑通扑通的在跳");
            }else {
                System.out.println("over");
            }
        }
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", live=" + live +
                '}';
    }

    @Override
    // 比较原则，name和age相同 就是同一个person
    public boolean equals(Object o) {
        // 如果对象地址一样 ，则认为相同
        if (this == o)
            return true;
        // 如果参数为空，或者类型不一样 则认为不同
        if (o == null || getClass() != o.getClass())
            return false;
        // 转换为当前类型
        Person person = (Person) o;
        // 应用类型比较相等使用 Java,util.Objects的equals静态方法取得结果
        return age == person.age && Objects.equals(name,(person.name));
    }


}
