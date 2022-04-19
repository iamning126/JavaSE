
public class Test1 {
	public static void main(String[] args) throws MyException  {
		//可以在main方法抛出异常
		//main方法抛出异常直接抛到虚拟机上去了，在程序中无法进行处理
//		B b = new B();
//		try {
//			b.test();
//			//throws在方法块抛出异常，
//			//在调用部分进行捕获处理
//		} catch (Exception e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}
		B b = new B();
		try {
//			b.test1(-100);
			b.test2(-100);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}

}
class B{
	int i;
	int age;
	//NullPointerException的父类是Exception
	public void test() throws NullPointerException{//可以使用throws在代码这抛出异常，在调用方捕获处理
		B b=null;
		System.out.println(b.i);
	}
	public void test1(int age) throws Exception{
		if (age>=0 && age<=180) {
			this.age=age;
			System.out.println("年龄是："+this.age);
		}else {
			throw new Exception("这个年龄不在0-150之间");
		}	
	}
	public void test2(int age) throws MyException {
		if (age>=0 && age<=180) {
			this.age=age;
			System.out.println("年龄是："+this.age);
		}else {
			throw new MyException("这个年龄不在0-150之间");
		}	
	}
}
class C extends B{

	@Override
	public void test() throws NullPointerException {
		//重写方法不能抛出比被重写更大的异常类型
		// TODO 自动生成的方法存根
		super.test();
	}
}
class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}
