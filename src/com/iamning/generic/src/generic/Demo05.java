package generic;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class Demo05 {

	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new TestB().test1();//调用过时方法

		//抑制编译警告
		@SuppressWarnings({ "rawtypes", "unused" })
		List list=new ArrayList();
	}

}
class TestA{
	public void test() {
		
	}
}
class TestB extends TestA{
	@TestAnn(id=100,desc = "姓名")
	String name;
	//重写
	@Override
	public void test() {
		// TODO 自动生成的方法存根
		super.test();
	}
	//过时的方法
	@Deprecated
	public void test1() {
		System.out.println();
	}
}
//自定义 Annotation

@Target(ElementType.FIELD)//这个注解类是给其他类的属性做注解
@Retention(RetentionPolicy.RUNTIME)//定义注解的声明的周期
@interface TestAnn{
	public int id() default 0;
	public String desc() default "";
}