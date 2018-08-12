package com.fexo.lamdba;


/**
 * 定义一个函数式接口，人吃的行为
 */
public interface Peapen {

    /**
     *  人的名字
     */
    String name =null;

    /**
     * 【函数式接口有且只有一个抽象方法】
     *  吃的抽象方法
     */
    void eat();
}
