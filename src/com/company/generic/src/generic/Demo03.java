package generic;

import java.util.ArrayList;
import java.util.List;

public class Demo03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		D d = new D();
		List<String> l1=new ArrayList<String>();
		d.test(l1);
		
		List<Integer> l2 = new ArrayList<Integer>();
		d.test(l2);
		List<C1> lc =new ArrayList<C1>();
		d.test1(lc);
		
		List<D1> ld =new ArrayList<D1>();
		
		d.test1(ld);
		
		List<S1> ls =new ArrayList<S1>();
		d.test2(ls);
		d.test2(lc);
		List<A1> la =new ArrayList<A1>();
		d.test2(la);
//		d.test2(ld);
		
		List<IAimpl> lia =new ArrayList<IAimpl>();
		d.test3(lia);
//		d.test3(la);
	}
}
class D{
	public void test(List<?> list) {
		//test方法需要一个list集合的参数，不确定list到底存的数类型是什么
	}
	public void test1(List<? extends C1> list ) {//List参数的元素数据类型是C1及其子类
		
	}
	public void test2(List<? super C1> list ) {//List参数的元素数据类型是C1及其父类
		
	}
	public void test3(List<? extends IA> list) {//List参数的元素数据类型是IA的实现类
		
	}
}
class A1{
	
}
class S1 extends A1{
}
class C1 extends S1{
	
}
class D1 extends C1{
}
interface IA{}
class IAimpl implements IA{
	
}