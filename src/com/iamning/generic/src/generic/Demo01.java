package generic;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {



	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List list=new ArrayList();
		list.add(111);
		list.add("ss");
		list.add(true);
		//需求：只能在集合中存字符串
		List<String> l = new ArrayList<String>();
		l.add("s");
		//l.add(1);//这是编译发现的问题 
		A<String> a1= new A<String>();
		//在new A的对象指定泛型的类型是String
		a1.setkey("xxxx");//对象使用setkey（T key）方法，中的key形参就是String
		String s =a1.getkey();//T getKey(),返回值就有new对象确定返回值是String
		 
		A<Integer> a2= new A<Integer>();//指定泛型为Interger
		a2.setkey(1);
		Integer i=a2.getkey();
		
		A a3  = new A();
//		A<Object> a3=new A<Object>();//不指定对象指定泛型类型,就是默认的Object类
		a3.setkey(new Object());
		a3.getkey();
		//同样的类，但是在new对象是泛型指定不同的数据类型
		//a2=a1;不同的数据类型之间不能互相赋值
	}

}
/*
 * 此处的泛型T可以任意取名，
 * 尽量用大写字母去命名
 * 一般使用T，意思是Type
 */
class A<T>{
	private T key;
	public void setkey(T key) {
		this.key=key;
	}
	public T getkey() {
		return this.key;
	}
}
