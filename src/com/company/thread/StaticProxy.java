package com.company.thread;

/**
 * 静态代理模式总结
 * 真实对象都要实现同一个接口
 * 代理对象要代理真实角色
 * 好处：
 *  代理对象可以做很多真实对象做不了的事情
 *  真实对象专注做自己的事情
 * @author Administrator
 */
public class StaticProxy {
    public static void main(String[] args) {
        new Thread(()->System.out.println("i love you")).start();

        new WeddingCompany(new Person()).happyMarry();
//        WeddingCompany weddingCompany=new WeddingCompany(new Person());
//        weddingCompany.happyMarry();
    }
}
interface Marry{
    /**
     * happyMarry
     * 结婚的方法
     */
    void happyMarry();
}

/**
 * 真实角色Person
 */
class Person implements Marry{
    /**
     * happyMarry
     * 幸福结婚的方法
     */
    @Override
    public void happyMarry() {
        System.out.println("你要结婚了，新郎不是我");
    }
}

/**
 * 代理角色WeddingCompany
 * 帮助Person结婚
 */
class WeddingCompany implements Marry{
    /**创建target目标
     *代理谁-->真实目标角色
     */
    private final Marry target;

    public WeddingCompany(final Marry target) {
        this.target = target;
    }

    /**
     * happyMarry
     * 幸福结婚的方法
     */
    @Override
    public void happyMarry() {
        before();
        this.target.happyMarry();
        after();
    }

    private void after() {
        System.out.println("结婚之后，收尾款");
    }

    private void before() {
        System.out.println("结婚之前，布置现场");
    }
}