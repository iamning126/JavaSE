package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("s");
		list.add("cd");
		list.add("s");
		list.add("uz");
		list.add("d");
		list.add("s");
		System.out.println(Collections.frequency(list, "s"));//返回指定集合中指定元素的出现次数
		Collections.replaceAll(list, "a", "aa");
		System.out.println(list);
		
//		System.out.println(list);
//		Collections.reverse(list);//反转list中的元素顺序
//		System.out.println(list);
//		Collections.shuffle(list);//对 list 集合元素进行随机排序
//		System.out.println(list);
//		Collections.sort(list);//对list集合进行字典升序排列
//		System.out.println(list);
//		Collections.swap(list, 0, 4);//将指定 list 集合中的 i 处元素和 j 处元素进行交换
//		System.out.println(list);
//		System.out.println(Collections.max(list));
//		System.out.println(Collections.min(list));
//		Student s1=new Student(14,"张三");
//		Student s2=new Student(15,"李四");
//		Student s3=new Student(8,"王五");
//		Student s4=new Student(13,"周六");
//		Student s5=new Student(32,"苏七");
//		Student s6=new Student(28,"一七");
//		List<Student> strus=new ArrayList<Student>();
//		strus.add(s1);
//		strus.add(s2);
//		strus.add(s3);
//		strus.add(s4);
//		strus.add(s5);
//		strus.add(s6);
//		Student s=Collections.max(strus,new Student());
//		System.out.println(s.name+" "+s.age);
//		Student sm=Collections.min(strus,new Student());
//		System.out.println(sm.name+" "+sm.age);
//		for(Student stu:strus) {
//			System.out.println(stu.age+","+stu.name);
//		}
//		System.out.println("===================");
//		Collections.sort(strus,new Student());
//		for(Student stu:strus) {
//			System.out.println(stu.age+","+stu.name);
//		}
	}

}
class Student implements Comparator<Student>{
	int age;
	String name;
	public Student() {
		
	}
	public Student(int age,String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public int compare(Student o1, Student o2) {
		// TODO 自动生成的方法存根
		if (o1.age > o2.age) {//根据年龄升序排列对象
			return 1;
		}
		else if (o1.age < o2.age) {
			return-1;
		}else {
			return 0;
		}
		
	}
	
}
