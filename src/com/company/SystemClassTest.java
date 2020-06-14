package com.company;



public class SystemClassTest {
    public static void main(String[] args) throws InterruptedException {
        // 获取系统当前时间与1970年01月01日00：00之间毫秒差
        //System.out.println(System.currentTimeMillis());

//        long start = System.currentTimeMillis();
//        // 程序
//
//        for (int i = 0; i < 10000 ; i++) {
//            System.out.println(i);
//
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("共耗时："+ (end - start) + "毫秒");
        long start = System.currentTimeMillis();
        System.out.println(start);
        Thread.sleep(3000);
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println("共耗时："+ (end - start) + "毫秒");



    }
}
