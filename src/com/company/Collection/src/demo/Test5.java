package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//Treemap的自然排序指的是字典排序
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(4,"a");
		map.put(2,"a");
		map.put(3,"a");
		map.put(1,"a");
		System.out.println(map);
		Map<String, String> map1 = new TreeMap<String, String>();
		map1.put("b","a");
		map1.put("i","a");
		map1.put("z","a");
		
		map1.put("y","a");
		map1.put("ab","ba");
		map1.put("1","ba");
		map1.put("10","s");
		System.out.println(map1);
	}
	

}
