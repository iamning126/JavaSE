package demo;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<String> list=new ArrayList<String>();
		list.add("b");//第一个，索引下标是0
		list.add("a");//第二个，索引下标是1
		list.add("c");//依次类推
		list.add("a");//允许使用重复元素
		System.out.println(list);
		System.out.println(list.get(2));
		//List 集合里添加了一些根据索引来操作集合元素的方法
		list.add(1,"F");//在指定索引的下标插入数据
		List<String> l=new ArrayList<String>();
		l.add("123");
		l.add("456");
		list.addAll(2, l);
		System.out.println(list);//在指定索引的下标插入集合
		System.out.println(list.indexOf("a"));//获取指定元素在集合中第一次出现的下标
		System.out.println(list.lastIndexOf("a"));//获取指定元素在集合中最后一次出现的下标
		list.remove(2);//根据指定的索引移除元素
		System.out.println(list);
		list.set(1, "ff");//根据指定的索引下标去修改元素
		System.out.println(list);
		List<String> subList=list.subList(2, 4);
		System.out.println(subList);
		//根据索引下标的起止位置，截取一段元素形成一个新集合
		//截取时的包含开始的索引，不包含结束索引
		//2~4（不包含4）（2<=i<4）
		System.out.println(list.size());
		//输出集合长度
	}

}
