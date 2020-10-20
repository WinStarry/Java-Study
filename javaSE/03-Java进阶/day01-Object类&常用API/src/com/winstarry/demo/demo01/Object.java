package com.winstarry.demo.demo01;


import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 java.lang.Object
    类 Object 是类层次结构的根(父)类。
    每个类(Person,Student...)都使用 Object 作为超(父)类。
    所有对象（包括数组）都实现这个类的方法。
 */
public class Object {
    public static void main(String[] args) {
        /*
        Person类默认继承了Object类,所以可以使用Object类中的toString()方法。
        String toString() 返回该对象的字符串表示。
*/
        Person p = new Person("zahngsan",18);
        String s = p.toString();
        System.out.println(s);//com.winstarry.demo.demo01.Person@282ba1e

        //直接打印对象的名字,其实就是调用对象的toString  p=p.toString();
        System.out.println(p);//com.winstarry.demo.demo01.Person@1c53fd30

        //看一个类是否重写了toString()方法,直接打印这个类的对象即可,如果没有重写toString方法那么打印的是对象的地址值
        Random r = new Random();
        System.out.println(r);//java.util.Random@13b6d03

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);//重写了toString()方法

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);//[1, 2, 3]   重写了toString()方法

    }
}
