package io;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class Demo01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File f=new File("D:\\test\\abc\\tt.txt");
//		File f1=new File("D:\\test","abc\\tt.txt");
		File f2=new File("D:/test/abc");
//		File f4=new File("D:"+File.separator+"test/abc/tt.txt");
		//这个时候对象就能够得到tt.txt文件

		//这个f1也是tt.txt文件，这种使用相对比较少
		//注意：这个斜杠\在文件中是路径的分隔符，但是在java编程中一个\的意思是转义符
		//在java中\\或者/才是文件的分隔符
		//也可以File.separator作为分割符
		System.out.println(f.getName());//获取文件名
		System.out.println(f2.getName());//获取当前的文件名称
		
		File f5=new File("src/io/Demo01.java");//使用相对路径创建File对象
		
		System.out.println(f5.getPath());//获取当前文件或者文件夹的相对路径
		//就是new File时候写的路径
		System.out.println(f5.getAbsolutePath());
		//获取文件的相对路径
		//是绝对路径，它会给你补齐盘符
		
		System.out.println(f5);
		System.out.println(f5.getAbsoluteFile());
		//返回一个当前的文件的绝对路径构建的file对象
		System.out.println(f.getParentFile());
		//返回当前文件或者文件夹的父级路径
		
		f.renameTo(new File("D:\\test\\abc\\tt1.txt"));
		//给文件或文件夹重命名
		
		File f6=new File("D:\\test\\abc1");
		System.out.println(f6.exists());
		//判断文件或者文件夹是否存在
		File f7=new File("D:\\test\\abc\\tt1.txt");
		System.out.println(f7.canRead());//判断文件是否可读
		System.out.println(f7.canWrite());//判断文件是否可写
		System.out.println(f7.isFile());//判断当前的File对象是不是文件
		System.out.println(f7.isDirectory());//判断当前对线是不是文件夹或者目录
		System.out.println(f7.lastModified());//获取文件的最后修改时间，返回一个毫秒数
		System.out.println(f7.length());//返回文件的长度，单位是字节数
		File f8=new File("D:\\test\\abc\\tt2.txt");
		System.out.println(f8.exists());
		if (!f8.exists()) {//判断文件是否存在
			try {
				f8.createNewFile();//创建新的文件
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
//		f8.delete();//删除文件
		File f9=new File("D:\\test\\abc\\cc\\dd");
		
		f9.mkdir();//创建单层目录，
		//如果使用这样的方法来创建多层目录，就得一层一层的执行mkdir（）
		File f10=new File("D:\\test\\abc\\a\\b\\c");
		f10.mkdirs();//这个方法是直接用来创建多层目录
		
		File f11=new File("D:\\test");
		String[] f1=f11.list();//返回当前文件夹的子集名称（String），包括目录和文件
	
		for(String s:f1) {
			System.out.println(s);
		}
		File[] fs=f11.listFiles();//返回当前文件夹的子集对象（File），包括目录和文件
		for (File s : fs) {
			System.out.println(s);
		}
	}
	

}
