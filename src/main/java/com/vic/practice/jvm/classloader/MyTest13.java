package com.vic.practice.jvm.classloader;

/**
 * 源程序名称：MyTest13 <br>
 * 源程序包名：com.vic.demo.jvm.classloader <br>
 * 系统名称：demo <br>
 * 开发时间：2020/9/6 11:20 下午 <br>
 *
 * @Author baojiong20176 <br>
 * <br>
 */
public class MyTest13 {

    public static void main(String[] args) {
        ClassLoader loader = ClassLoader.getSystemClassLoader();

        System.out.println(loader);

        while (null != loader) {
            loader = loader.getParent();
            System.out.println(loader);
        }
    }
}
