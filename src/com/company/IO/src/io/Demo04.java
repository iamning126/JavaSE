package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo04 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		Demo04.testFileReader("D:\\test\\abc\\tt6.txt");
//		Demo04.testFileWriter("hello", "D:\\test\\abc\\tt5.txt");
		//在写入一个文件时，如果目录下有同名文件将被覆盖
//		Demo04.testFileWriter("!!!!!!", "D:\\test\\abc\\tt5.txt");
		Demo04.copyFile("D:\\test\\abc\\tt5.txt","D:\\test\\abc\\cc\\tt5.txt" );
	}
	/*
	 * 文件字符输入流FileReader
	 *  在读取文件时，必须保证该文件已存在，否则出异常
	 */
	public static void testFileReader(String inPath) {
		try {
			FileReader fr = new FileReader(inPath);//创建字符输入流的对象
			
			char[] c=new char[10];//创建临时存数据的字符数组
			
			int len=0;//定义一个输入流的读取长度
			while ((len=fr.read(c))!=-1) {
				System.out.println(new String(c,0,len));
			}
		fr.close();//关闭流
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	/*
	 *文件字符输出流FileWriter
	 *text输出的内容
	 *outpath输出的文件
	 */
	public static void testFileWriter(String text,String outPath) {
		try {
			FileWriter fw=new FileWriter(outPath);
			fw.write(text);//把text写到内存中
			fw.flush();//把内存中的字符串刷到硬盘上
			fw.close();//关闭流
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
	/*
	 * 字符流完成拷贝文件,字符流只适合操作内容是字符的文件
	 * 
	 */
	public static void copyFile(String inPath,String outPath) {
		try {
			FileReader fr=new FileReader(inPath);
			FileWriter fw=new FileWriter(outPath);
			char[] c= new char[100];
			int len = 0;
			while ((len = fr.read(c))!=-1) {
			fw.write(c,0,len);
			}
			fw.flush();
			fw.close();
			fr.close();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
