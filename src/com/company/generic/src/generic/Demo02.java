package generic;

import sun.font.TrueTypeFont;

public class Demo02 {

	public static void main(String[] args) {
//		// TODO 自动生成的方法存根
//		B1<Object> b1=new B1<Object>();
//		B1<String> b2=new B1<String>();
//		//B1类必须传入指定的类型，而B2类在定义是就已经确定
//		B2 b3 = new B2();
		C<Object> c= new C<Object>();
		c.test("T");
		//泛型方法，在调用之前没有指定固定的参数
		//在调用时，根据传入的参数是什么类型，就会把泛型改成什么类型
		Integer i=c.test1(123);//传递的参数是Integer，
		//泛型T就固定成Integer，返回值也是Integer
		//泛型方法会在调用时确定类型
		Boolean b=c.test1(true);
		
	}

}
//定义泛型接口
interface IB<T>{
	T test(T t);
	
}
/*
 * 未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中
 */
//用泛型类去实现泛型接口
class B1<T> implements IB<T> {
	//重写接口内的方法
	@Override
	public T test(T t) {
		// TODO 自动生成的方法存根
		return t;
	}	
}
/*
 * 如果实现接口时，指定了接口泛型的具体数据类型
 * 这个类实现接口所有方法都要替换泛型替换实际的具体数据类型
 */
class B2 implements IB<String> {
	@Override
	public String test(String t) {
		// TODO 自动生成的方法存根
		return null;
	}
}
class C<E>{
	private E e;
	
	/*
	 * 静态方法的泛型方法
	 */
	public static<T> void test3(T t) {
		//System.out.println(this.e);
		//在静态方法中不能使用类定义的泛型
		//如果使用泛型，只能使用静态方法自己定义的泛型
		System.out.println(t);
	}
	
	
	public <T> void test(T s) {
		//无返回值的泛型方法
		//在类上定义的泛型，可以在普通的方法使用
		
		T t = s;
		System.out.println(t);
	}
	public <T> T  test1(T s) {
		//有返回值的泛型方法
		return s;
	}
	public <T> void test2(T... strs) {
		//可变参数类型的泛型方法
		for (T s:strs) {
			System.out.println(s);
		}
	}
}