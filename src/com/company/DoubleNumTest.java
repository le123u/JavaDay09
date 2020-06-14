package com.company;

import java.util.ArrayList;
import java.util.List;

public class DoubleNumTest {
    public static void main(String[] args) {

        // 创建一个样本数据
        ArrayList<Integer> srcList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            srcList.add(i);
        }

        // 调用获取所有偶数的方法
        List<Integer> list = getEvenNum(srcList);
        System.out.println(list);

    }
    // 获取某集合中所有的偶数

    // 此时List<Integer> list 作为了getEvenNum方法的参数
    public static List<Integer> getEvenNum(List<Integer> list){
        // 1. 创建偶数集合
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            if (integer % 2 == 0){
                arrayList.add(integer);
            }
        }
        // 因为getEvenNum方法返回值类型是List<Integer>，arrayList是List的子类 所以arrayList是可以返回的
        //接口对应的类型作为返回值类型
        return arrayList;

    }
}
