package io;

import java.io.RandomAccessFile;

/**
 * 文件的随机读写
 * 程序可以直接跳到文件的任意 地方来读、写文件
 * @author Administrator
 *
 */
public class Demo11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
//			Demo11.testRandomAccessFileRead();
			Demo11.testRandomAcessFileWrite();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	/**
	 * 随机读文件
	 * 
	 */
	public static void testRandomAccessFileRead() throws Exception{
		//RandomAcessFile的构造有两个路径，参数1是读写文件的路径，
		//参数二是指定RandomAcessFile的访问模式
		/*
		 *   **r:** **以只读方式打开**

		   **rw****：打开以便读取和写入**

		   **rwd****:****打开以便读取和写入；同步文件内容的更新**

		   **rws****:****打开以便读取和写入；同步文件内容和元数据的更新**
		 */
		//最常用的是r和rw
		RandomAccessFile ra=new RandomAccessFile("F:\\eclipse-workspace\\IO\\src\\io\\tt10.txt","r");
		ra.seek(5);//通过设置读取文件内容的起始点，来达到从文件的任意位置读取

		byte[] b=new byte[1024];
		
		int len=0;
		while ((len=ra.read(b))!=-1) {
			System.out.println(new String(b, 0, len));
		}
		ra.close();
	}
	public static void testRandomAcessFileWrite() throws Exception{
		RandomAccessFile ra= new RandomAccessFile("F:\\eclipse-workspace\\IO\\src\\io\\tt10.txt","rw");
//		ra.seek(6);//设置写的起始点
		//注意：如果是在中间的某个位置开始写的话，就会用写的内容覆盖掉原内容
		//0代表从开头开始写
		ra.seek(ra.length());
		//ra.length代表从文件的追加开始写
		ra.write("你好".getBytes());
		ra.close();
	}
}
