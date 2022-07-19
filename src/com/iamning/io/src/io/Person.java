package io;

import java.io.Serializable;

/**
 * 可以序列化与反序列化的对象
 * @author Administrator
 *
 */
public class Person implements Serializable{

	/**
	 * 一个表示序列化版本的标识符的静态变量
	 * 用来表明类的不同版本的兼容性
	 */
	private static final long serialVersionUID = -6751093704284833019L;
	
	String name;
	int age;
	
	
	
}
