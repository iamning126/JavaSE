package io;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 数据流，专门用来做基本数据类型的读写的
 * @author Administrator
 *
 */
public class Demo09 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			Demo09.testDataOutputStream();
			Demo09.testDataInputStream();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	/**
	 * 数据输出流
	 * 用数据输出流写到文件中的基本数据类型，是乱码的，不能直接辨认出
	 * 需要数据输入流来读取
	 * 用数据输入流读取数据输出流写到文件中的数据时，要保证使用和当时写的数据类型一致的类型来读取
	 * 也就是说，写的时候是Writedouble，读的时候就得是Readdouble
	 * DataOutputStream
	 */
	public static void testDataOutputStream() throws Exception{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("F:\\eclipse-workspace\\IO\\src\\io\\tt8.txt"));
		dos.writeBoolean(true);
//		dos.writeDouble(1.35);
//		dos.writeInt(100);
		dos.flush();
		dos.close();
	}
	/**
	 * 数据输入流
	 * DataInputStream
	 * 用数据输出流写到文件中的基本数据类型，是乱码的，不能直接辨认出
	 * 需要数据输入流来读取
	 */
	private static void testDataInputStream()throws Exception {
	DataInputStream ps = new DataInputStream(new FileInputStream("F:\\eclipse-workspace\\IO\\src\\io\\tt8.txt"));
	System.out.println(ps.readBoolean());
	
	ps.close();
	}
}
