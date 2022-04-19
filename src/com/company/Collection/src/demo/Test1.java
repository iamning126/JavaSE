package demo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Set<Integer> set= new TreeSet<Integer>();
		set.add(1);
		set.add(5);
		set.add(2);
		set.add(8);
		System.out.println(set);
		set.remove(2);
		System.out.println(set.contains(2));
		//set.clear();清空集合
		System.out.println(set);
		//使用迭代器遍历集合
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		//for each迭代集合，推荐使用这个
		for(Integer i: set) {
			System.out.print(i+" ");
		}
	}

}
