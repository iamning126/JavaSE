import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class Demo01 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] strs=new String[] { "a","b","c"};
		for(int i = 0; i < strs.length+1; i++) {//i=0,1,2,3
			//数组越界异常：java.lang.ArrayIndexOutOfBoundsException: 3
			//这里的3就是异常下标
			System.out.println(strs[i]);
			//数组只有三个元素数组下标为0,1,2
			//没有第四个元素，当输出strs[3]时没有
			//所以当取到3时会出现数组下标越界
		}
	}

}
class A{
	int i;
}