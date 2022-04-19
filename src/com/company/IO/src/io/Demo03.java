package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		Demo03.testFileInputStream();
//		Demo03.testFileoutputStream();
//		Demo03.copyFile("D:\\test\\abc\\tt1.txt","D:\\test\\abc\\cc\\tt1.txt");
		Demo03.copyFile("D:\\test\\abc\\s.png","D:\\test\\abc\\cc\\s.png");
	}
	/*
	 *文件字节输入流 FileInputStream
	 */
	public static void testFileInputStream() {
		try {
			FileInputStream in =new FileInputStream("D:\\test\\abc\\tt1.txt");
			
			byte[] b = new byte[10];//设置一个byte数组去接收in里的文件内容
			int len=0;//设置一个读取的长度
			
			//in.read(b);//in.read方法有一个返回值，
			//返回值是读取的数据长度，如果读取到最后一个，
			//还会向后再读一个，返回值就是-1
			//当返回值为-1时，结束读取
			while ((len=in.read(b)) != -1) {
				System.out.println(new String(b, 0, len));
				//一共三个参数
				//new String(b, 0, len)
				//b是缓冲数据数组，0从数组的哪个位置开始转化字符串，总共转化了几个字节
			}
			//System.out.println(new String(b));
			
			in.close();//注意：流在使用完之后一定要关闭
			
			
			
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} 
	}
	/*
	 * 文件字节输出流
	 */
	public static void testFileoutputStream() {
		try {
			FileOutputStream out = new FileOutputStream("D:\\test\\abc\\tt4.txt");
			//指定向tt4输出数据
			String str ="i am no.1";
			out.write(str.getBytes());//把数据写到内存当中
			out.flush();//再把内存中的数据写到硬盘上
			out.close();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	/*
	 * 复制文件到指定路径
	 * inpath 源文件路径
	 * outpath 复制到的文件夹位置
	 */
	public static void copyFile(String inpath,String outpath) {
			try {
				FileInputStream in =new FileInputStream(inpath);//读取源文件路径
				//读取的源文件
				FileOutputStream out = new FileOutputStream(outpath);//复制到哪里
				//复制到路径
				byte[] b= new byte[100];
				int len = 0;
				while((len=in.read(b))!=-1) {
					out.write(b, 0, len);
					//参数1是写的缓冲数组，参数2是数组的起始位置，参数3获取数组的总长度
				}
				out.flush();
				//把写到内存上的数据，传入到硬盘上
				out.close();
				in.close();
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
	}
}
