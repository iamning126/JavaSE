package generic;

public class Demo04 {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//Season.SPRING就是获取一个Season对象
		Season spring=Season.SPRING;
		spring.showinfo();
		Season summer=Season.SUMMER;
		summer.showinfo();
		Season spring1=Season.SPRING;
		System.out.println(spring1.equals(spring));
		//每次执行的Season.SPRING获得的是相同的对象，枚举中的每个枚举都是单例模式
		spring1.test();
	}
}
enum Season implements ITest{
	SPRING("春天","春暖花开"),//此处相当于在调用有参的私有构造
	SUMMER("夏天","炎炎酷暑"),
	AUTUMN("秋天","秋高气爽"),
	WINTER("冬天","白雪皑皑");
	private final String name;
	private final String desc;
	private Season(String name,String desc) {
		this.name = name;
		this.desc = desc;
	}
	public void showinfo() 
	{
		System.out.println(this.name+":"+this.desc);
	}
	@Override
	public void test() {
		// TODO 自动生成的方法存根
		System.out.println("这是实现的ITest接口的方法");
	}
}
interface ITest{
	void test() ;
}
