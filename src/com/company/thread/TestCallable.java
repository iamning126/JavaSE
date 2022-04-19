package com.company.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

//线程创建方式三：实现Callable接口
/**
callable的好处
1、可以定义返回值
2、可以抛出异常
 * @author Administrator
 */
public class TestCallable implements Callable{
        private String url;
        //网络图片的地址
        private String name;
        //保存的文件名
        //构造器
        public TestCallable(String url,String name){
            this.url=url;
            this.name=name;
        }

        @Override
        //下载图片线程的执行体
        public Boolean call() {
            WebDownloader1 webDownloader=new WebDownloader1();
            webDownloader.downloader(url,name);
            System.out.println("下载的文件名为："+name);
            return true;
        }

        //主线程
        public static void main(String[] args) throws ExecutionException, InterruptedException {
            TestCallable t1=new TestCallable("https://gitee.com/iamning/img/raw/master/blog/202204032208600.png","1.jpg");
            TestCallable t2=new TestCallable("https://gitee.com/iamning/img/raw/master/blog/202204081250649.png","2.jpg");
            TestCallable t3=new TestCallable("https://gitee.com/iamning/img/raw/master/blog/202204041559233.png","3.jpg");
            //创建执行服务：
            ExecutorService ser= Executors.newFixedThreadPool(3);
            //提交执行
            Future<Boolean> result1= ser.submit(t1);
            Future<Boolean> result2= ser.submit(t2);
            Future<Boolean> result3= ser.submit(t3);

            //获取结果
            boolean rs1=result1.get();
            boolean rs2=result2.get();
            boolean rs3=result3.get();
            System.out.println(rs1);
            System.out.println(rs2);
            System.out.println(rs3);
            //关闭服务
            ser.shutdownNow();


        }
    }

/**
 * 下载器
 */
class WebDownloader1{
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

