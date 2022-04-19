package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo05 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
//			Demo05.testBufferedInputStream();
//			Demo05.testBufferOutputStream();
			Demo05.copyFile();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	/**
	 * 缓冲字节输入流
	 *BufferedInputStream
	 */
	public static void testBufferedInputStream()throws Exception {
		//文件字节输入流对象
		FileInputStream in=new FileInputStream("F:\\eclipse-workspace\\IO\\src\\io\\tt.txt");
		//缓冲字节输入流对象
		BufferedInputStream br=new BufferedInputStream(in);
		byte[] b =new byte[10];
		int len = 0;
		while((len=br.read(b))!=-1) {
			System.out.println(new String(b, 0, len));
		}
		
		//关闭流的时候，本着一个晚开的最早关，依次关
		br.close();
		in.close();
	}
	/**
	 * 缓冲字节输出流
	 * @throws Exception 
	 */
	public static void testBufferOutputStream() throws Exception {
		//创建字节输出流对象
		FileOutputStream out = new FileOutputStream("F:\\eclipse-workspace\\IO\\src\\io\\tt1.txt");
		
		BufferedOutputStream bo = new BufferedOutputStream(out);
		
		String s="hello world";
		
		bo.write(s.getBytes());//写到内存中
		
		bo.flush();
		//关闭流的时候，本着一个晚开的最早关，依次关
		bo.close();
		out.close();
	}
	/**
	 * 缓冲流实现文件的复制
	 */
	public static void copyFile() throws Exception{
		//缓冲输入流
		BufferedInputStream br=new BufferedInputStream(new FileInputStream("F:\\eclipse-workspace\\IO\\src\\io\\tt1.txt"));
		//缓冲输出流
		BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("F:\\eclipse-workspace\\IO\\src\\io\\tt2.txt"));
		
		byte[] b = new byte[1024];
		
		int len = 0;//设置一个每次读取到的数据长度，直到br.read方法执行到最后
		//（比如说文件中只有hello world，所谓的执行到最后一个d的后面，这个时候的返回值就是-1）
		
		while((len = br.read(b))!=-1) {
			bo.write(b, 0, len);//写到内存中
		}
		bo.flush();
		bo.close();
		br.close();		
	}
}

