package com.vic.practice.jvm.classloader;

/**
 * 源程序名称：MyTest22 <br>
 * 源程序包名：com.vic.practice.jvm.classloader <br>
 * 系统名称：practice <br>
 * 开发时间：2020/10/12 10:15 下午 <br>
 * 功能描述：
 *
 * @author baojiong20176 <br>
 * <br>
 */
public class MyTest22 {

    static {
        System.out.println("MyTest22 initializer");
    }

    public static void main(String[] args) {
        System.out.println(MyTest22.class.getClassLoader());

        System.out.println(MyTest1.class.getClassLoader());
    }
}
