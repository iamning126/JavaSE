import java.util.ArrayList;

public class Demo02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//正确示例：A a=new A();
		A a = null;//在这里指向，引用变量a没有指向任何对象，指向的是null
		System.out.println(a.i);
		//什么都没有指向i的值
		//这里就会空指针异常
		class A{
			int i;
		}
	}
	

}
