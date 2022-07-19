package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Demo08 {
/**
 * 标准输入和输出流
 * @param args
 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
//			Demo08.testSystemIn();
			Demo08.write2TXT();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	public static void testSystemIn() throws Exception{
		//获取一个接收键盘输入数据的输入流
		InputStreamReader is= new InputStreamReader(System.in);
		//把输入流放到缓冲流里
		BufferedReader br = new BufferedReader(is); 
		
		String str ="";//定义一个接收临时数据的字符串
		
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		br.close();
		is.close();
	}
	/**
	 * 把控制台写的内容写到指定的txt文件中，当接受到字符串over，就结束程序的运行
	 */
	public static void write2TXT() throws Exception{
		InputStreamReader is = new InputStreamReader(System.in);
		//创建对象去接收键盘的输入
		BufferedReader br = new BufferedReader(is);
		//把输入流缓冲到内存中
		BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\eclipse-workspace\\IO\\src\\io\\tt7.txt"));
		String str = "";
		
		while((str = br.readLine()) != null) {
			//读取每一行都写到指定的TXT文件中
			if (str.equals("over")) {
				break;
			}
			bw.write(str);
		}
		bw.flush();
		bw.close();
		br.close();
		is.close();
	}
}
