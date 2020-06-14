package com.company;

public class Player {

    /**
     * 成员方法：FightAble select(String str)根据指令选择角色
     * 法力角色：选择法师
     * 武力角色：选择战士
     */
     public  FightAble select(String str){
         if ("法力角色".equals(str)) {
             return new Master();
         } else if ("武力角色".equals(str)) {
             return new Warrior();
         }else{

         return null;
         }
     }

     }

