
package demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Set set = new HashSet();
		Set<Object> set2 = new HashSet();//与上面的等价
		//Set接口引用指向子类Hashset的对象
		//set对象代表的是一个集合{}
//		set.add(1);
//		//添加元素
//		set.add("a");
//		System.out.println(set);
//		set.remove(1);
//		System.out.println(set);
//		//移除元素
//		System.out.println(set.contains("1"));
//		//判断是否包含元素
//		set.clear();
//		//清空集合
//		System.out.println(set);
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		//set.add("d");//set集合存的值是不重复的
		set.add(null);
		set.add(1);
		set.add(false);
		System.out.println(set);
		System.out.println(set.size());	
		//使用迭代器遍历集合
//		Iterator it=set.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());		
//		}
//		//for each迭代集合
//		for (Object obj :set ) {
//			//这个的意思是把set的每一个值取出来，赋值给obj
//			//直到循环set的所有值
//			System.out.println(obj);
//		}
//		System.out.println(set.size());	
//		//获取集合元素的个数
		//如果想要让集合存同样的类型的对象，应该怎么做
		//使用泛型
		Set<String> set1 = new HashSet<String>();
		//比如指定String为集合的泛型，
		//那么这个集合就不能存String类型之外的数据
		set1.add("A");
		//set1.add(1);
	}
}
