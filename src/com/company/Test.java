package com.company;

public class Test {
    public static void main(String[] args) {


        Student stu = new Student("小明", false);

        Teacher te = new Teacher("老刘");

        Class aClass = new Class();
        aClass.setKind("java");
        aClass.setStudent(stu);
        aClass.setTeacher(te);

        aClass.show();


    }
}
