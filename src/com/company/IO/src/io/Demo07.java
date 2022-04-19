package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/**
 * 转换流
 * 可以把字节流转换为字符流
 * 当字节流的数据都是字符的时候，当字节流的数据都是字符时，转换成字符效率更高
 * @author Administrator
 *
 */
public class Demo07 {
	public static void main(String[] args) {
		//所有文件都是有编码格式的
		//对于我们来说，txt和java文件一般来讲有三种编码的模式、
		//ISO8859-1，西欧编码，纯粹的英文编码，不适应汉字
		//GBK和UTF-8，这两种编码适用于中英文
		//一般使用UTF-8编码
		try {
//			Demo07.testInputStreamReader();
			Demo07.testOutputStreamWriter();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	/**
	 * 转换输入流
	 * 注意：在转换字符流的时候设置的字符集编码要与读取文件的数据编码一致
	 * 不然就会出现乱码
	 * @throws Exception
	 */
	public static void testInputStreamReader() throws Exception{
		FileInputStream fs=new FileInputStream("F:\\eclipse-workspace\\IO\\src\\io\\tt5.txt");
		//把字节流转换为字符流
		InputStreamReader in=new InputStreamReader(fs, "UTF-8");//参数1是字节流，参数2是编码
		
		char[] c=new char[100];
		
		int len=0;
		while ((len=in.read(c))!=-1) {
			System.out.println(new String(c,0,len));
		}
		in.close();
		fs.close();
	}
	/**
	 * 转换字节输出流为字符输出流
	 * OutputStreamWriter
	 * 注意：在转换字符流的时候设置的字符集编码要与读取文件的数据编码一致
	 * 不然就会出现乱码
	 */
	public static void testOutputStreamWriter() throws Exception{
		FileOutputStream out=new FileOutputStream("F:\\eclipse-workspace\\IO\\src\\io\\tt6.txt");
		
		OutputStreamWriter os=new OutputStreamWriter(out,"UTF-8");
		
		os.write("你好你好");
		
		os.flush();
		
		os.close();
		
		out.close();
	}
}
