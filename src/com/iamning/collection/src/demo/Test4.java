package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


import com.sun.org.apache.bcel.internal.generic.GotoInstruction;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class Test4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("b",1);//添加数据,插入键值对
		map.put("c",2);
		map.put("s",8);
		System.out.println(map);
		map.put("b",3);//这里插入相同键值的不同数据，会直接更新输出
		System.out.println(map);
		System.out.println(map.get("c"));//根据key取值
		map.remove("c");
		//根据key移除键值对
		System.out.println(map);
		System.out.println(map.size());//集合的长度
		System.out.println(map.containsKey("a"));//判断当前的map集合是否包含指定键值
		System.out.println(map.containsValue(3));//判断当前的map集合是否包含指定value值
		//map.clear();
		//遍历Map集合
		Set<String> keys=map.keySet();//获取map集合的key集合
		map.values();//获取集合所有的value值
		for (String key:keys) {
			System.out.println("Key:"+key+" "+"Value:"+map.get(key));	
		}
		System.out.println("====================");
		//通过map.entrySet();进行遍历
		Set<Entry<String, Integer>> entries=map.entrySet();
		for (Entry<String, Integer> entry : entries) {
			System.out.println("Key:"+entry.getKey()+" "+"Value:"+entry.getValue());
		}
	}

}
