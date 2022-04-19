package com.company.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//练习Thread，实现多线程同步下载图片
public class TestThread2 implements Runnable{
    private String url;//网络图片的地址
    private String name;//保存的文件名
    //构造器
    public TestThread2(String url,String name){
        this.url=url;
        this.name=name;
    }

    @Override
    //下载图片线程的执行体
    public void run() {
        WebDownloader webDownloader=new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载的文件名为："+name);

    }

    //主线程
    public static void main(String[] args) {
        TestThread2 t1=new TestThread2("https://gitee.com/iamning/img/raw/master/blog/202204032208600.png","1.jpg");
        TestThread2 t2=new TestThread2("https://gitee.com/iamning/img/raw/master/blog/202204081250649.png","2.jpg");
        TestThread2 t3=new TestThread2("https://gitee.com/iamning/img/raw/master/blog/202204041559233.png","3.jpg");
        //理想情况下是1,2，3逐个下载
        //但是实际是没有按照顺序，每次执行顺序都不一致
//        t1.start();
//        t2.start();
//        t3.start();
        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
    }
}
//下载器
class WebDownloader{
    //下载方法
    public void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }

    }
}