package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化和反序列化
 * 注意：对象的序列化和反序列化使用的类型要严格一致，包名，类名，类结构等等所有都要一致
 * @author Administrator
 *
 */
public class Demo10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
//			Demo10.testSerialize();
			Demo10.testDeSerialize();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	/**
	 * 对象的序列化
	 */
	public static void testSerialize() throws Exception{
		//定义对象的输出流，把对象的序列化之后的流放到指定的文件中
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("F:\\eclipse-workspace\\IO\\src\\io\\tt9.txt"));
		//如果序列化和反序列化不是同一个类
		//反序列化就会有异常
		Person person = new Person();
		person.name="张三";
		person.age=11;
		
		out.writeObject(person);
		out.flush();//刷写数据到硬盘
		out.close();
		
	}
	public static void testDeSerialize()throws Exception {
		//创建对象输入流，从指定的文件中把序列化的流读取出来
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("F:\\eclipse-workspace\\IO\\src\\io\\tt9.txt"));
		
		Object object=in.readObject();
		Person p = (Person)object;
		System.out.println(p.name);
		System.out.println(p.age);
	}
}
