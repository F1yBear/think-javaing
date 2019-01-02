package com.fexo.jvm;

/**
 * 学习理解栈的工作原理
 */
public class StackStudy {

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    /**
     * 斐波拉契数列
     * f(n)=f(n-1)+f(n-2)，f(0)=0，f(1)=1
     *
     * @param i
     * @return
     */
    private static int fibonacci(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
       int sub1=0,sub2=1;
       for(int index=2;i>=index;index++) {
           sub2 = sub1 + sub2;
           sub1 = sub2 - sub1;
       }
        return sub2;
    }
}
