package demo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		// TODO 自动生成的方法存根
			Person p1 = new Person("张三",12);
			Person p2 = new Person("李四",8);
			Person p3 = new Person("王五",81);
			Person p4 = new Person("露西",26);
			Person p5 = new Person("马云",29);
			
			Set<Person> set= new TreeSet<Person>(new Person());
			set.add(p1);
			set.add(p2);
			set.add(p3);
			set.add(p4);
			set.add(p5);
			for (Person p : set) {
				System.out.println(p.name+"   "+p.age);
				
			}
	}
}
class Person implements Comparator<Person>{
	//把Person对象存到Treeset中并且按照年龄排序
	int age;
	String name;
	public Person() {
		// TODO 自动生成的构造函数存根
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	@Override
	public int compare(Person o1, Person o2) {//年龄正序排列
		
		if (o1.age > o2.age) {
			
			return 1;
		}else if (o1.age < o2.age) {
			return -1;
		}else {
			return 0;
		}
//		public int compare(Person o1, Person o2) {//年龄倒序排列
//			
//			if (o1.age < o2.age) {
//				
//				return 1;
//			}else if (o1.age > o2.age) {
//				return -1;
//			}else {
//				return 0;
//			}
	}
}
