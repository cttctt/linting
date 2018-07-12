package com.summersoft.ctt.yycx.util;

public class Test {
    public  static void main(String[] args)
    {
        //随机生成身份证
        IdCardGenerator g = new IdCardGenerator();
        System.out.println("身份证号为："+g.generate());
    }
}
