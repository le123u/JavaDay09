package com.company;

public class Class {
    // 属性 课程名称 讲师  学生集合
    private String kind;
    private Teacher teacher;
    private Student student;

    // 无参构造方法

    public Class() {
    }
    // 有参构造方法

    public Class(String kind, Teacher teacher, Student student) {
        this.kind = kind;
        this.teacher = teacher;
        this.student = student;
    }

    // get set 方法

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    // 成员方法 show方法 打印课程信息 老师姓名 学生上课情况
    public void show(){
        System.out.println("课程名称是："+kind+"\n"+"老师是"+teacher.getName()+"\n"+"旷课:"+student.getName());
    }
}
