package com.iamning.reflection;

public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取系统类加载器的父类加载器-->扩展加载器
        ClassLoader parent=systemClassLoader.getParent();
        System.out.println(parent);
        //java是得不到根加载器的
        //获取扩展类加载器的父类加载器-->根加载器（C++/C）
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
        //测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("com.iamning.reflection.Test07").getClassLoader();
        System.out.println(classLoader);
        //测试jdk内置的类是谁加载的
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);
        //如何获得系统类加载器可以加载的路径
        System.out.println( System.getProperty("java.class.path"));
        /*
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\charsets.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\deploy.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\access-bridge-64.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\cldrdata.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\dnsns.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\jaccess.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\jfxrt.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\localedata.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\nashorn.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\sunec.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\sunjce_provider.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\sunmscapi.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\sunpkcs11.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\zipfs.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\javaws.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\jce.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\jfr.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\jfxswt.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\jsse.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\management-agent.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\plugin.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\resources.jar;
        D:\Program Files\Java\jdk1.8.0_321\jre\lib\rt.jar;
        D:\IDEA workspace\Java SE\out\production\基础语法;
        D:\IDEA workspace\Java SE\src\com\lib\commons-io-2.11.0.jar;
        D:\IntelliJ IDEA 2021.3.2\lib\idea_rt.jar;
        C:\Users\Administrator\AppData\Local\JetBrains\IntelliJIdea2021.3\captureAgent\debugger-agent.jar
*/
        //双亲委派机制

    }
}
