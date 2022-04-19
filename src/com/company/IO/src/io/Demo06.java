package io;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
/**
 * 缓冲字符流
 * @author Administrator
 *
 */
import java.io.FileWriter;

import sun.net.www.content.text.plain;
public class Demo06 {
	public static void main(String[] args) {
		try {
//			Demo06.testBufferReader();
//			Demo06.testBufferWritter();
			Demo06.testCopy();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	/**
	 * 缓冲字符输入流
	 * BufferReader
	 */
	public static void testBufferReader() throws Exception{
		FileReader r =new FileReader("F:\\eclipse-workspace\\IO\\src\\io\\tt.txt");
		BufferedReader br = new BufferedReader(r);
		char[] c =new char[100];
		int len=0;
		while ((len = br.read(c))!=-1) {
			System.out.println(new String(c, 0, len));
			
		}
		br.close();
		r.close();
	}
	/**
	 * 缓冲字符输出流
	 * BufferWriter
	 */
	public static void testBufferWritter()throws Exception {
		FileWriter fw=new FileWriter("F:\\eclipse-workspace\\IO\\src\\io\\tt3.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		
		String s="hello World!!!";
		
		bw.write(s);
		
		bw.flush();
		
		bw.close();
		
		fw.close();
		
		
		
		
	}
	/**
	 * 缓冲字符复制文件
	 */
	public static void testCopy() throws Exception {
		BufferedWriter bw =new BufferedWriter(new FileWriter("F:\\eclipse-workspace\\IO\\src\\io\\tt4.txt"));
		BufferedReader br = new BufferedReader(new FileReader("F:\\eclipse-workspace\\IO\\src\\io\\tt3.txt"));
		char[] c=new char[100];
		int len=0;
		while ((len=br.read(c))!=-1) {
			bw.write(c, 0, len);
			
		}
		bw.flush();
		
		bw.close();
		
		br.close();
	}
}
