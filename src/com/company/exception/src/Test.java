
public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int i=0;
//		try {//用try{}来括住一段有可能出现异常的代码段
//			System.out.println(1);
//			System.out.println(3/i);//由于通过异常处理机制防止程序中断
//			System.out.println(2);
//		} catch (Exception e) {
//			//当不知道捕获的是什么类型的异常时
//			//可以选择所有的异常父类Exception
//			// TODO: handle exception
//			System.out.println(3);
//		}finally {//finally可以写也可以不写
//			//它是捕获异常的体系中最终一段会执行的部分
//			//未来学习IO操作和JDBC都会接触
//			System.out.println(4);
//		}
//		System.out.println("ok");
		String[] strs= new String[] {"a","b"};
		A a=null;
		//try catch 是为了防止程序可能出现的异常
		//在捕获异常的代码块中try{}，
		//如果前面的代码有异常了，就不会执行后面的异常
		try {
			System.out.println(strs[2]);
			System.out.println(a.i);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			//捕获数组异常
			e.printStackTrace();
		}
		catch (NullPointerException e1) {
			// TODO: handle exception
			System.out.println(e1.getMessage());
			//捕获空指针异常
			e1.printStackTrace();
		}
		System.out.println("===================");
		
	}

}
