package com.winstarry.demo01;

/*
switch选择语句的简单使用
 */
public class switchDemo01 {
    public static void main(String[] args) {
        int n = 3;

        switch(n){
            case 1:
                System.out.println("第一种情况是成立的！");
                break;
            case 2:
                System.out.println("第二种情况是成立的！");
                break;
            case 3:
                System.out.println("第三种情况是成立的！");
                break;
            case 4:
                System.out.println("第四种情况是成立的！");
                break;
            default:
                System.out.println("没有匹配到正确的结果！");
        }
    }
}
