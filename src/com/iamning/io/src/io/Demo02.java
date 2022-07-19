package io;

import java.io.File;

public class Demo02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//遍历d盘下的test文件夹，把test文件夹下的所有目录和文件全部遍历出来
		//无论层级有多深要全部遍历出来
		//使用递归的方法
		File f=new File("D:\\test");
		new Demo02().test(f);
		
	}
	/*
	 * 递归遍历文件
	 */
	public void test(File file) {
		if(file.isFile()) {
			System.out.println(file.getAbsolutePath()+"是文件");
		}else {
			System.out.println(file.getAbsolutePath()+"是文件夹");
			//如果是文件夹，这个文件夹可能有子文件夹
		
			File[] fs=file.listFiles();//获取当前文件下的子文件夹或者文件的File对象
			if(fs!=null||fs.length > 0) 
			//如果子集非空或者长度大于0进行遍历集合fs
				{
				for(File f : fs) {
					
					test(f);//递归
					
//					if(file.isFile()) {
//						System.out.println(f.getAbsolutePath()+"是文件");
//					}else {
//				System.out.println(file.getAbsolutePath()+"是文件夹");
//				//如果是文件夹，这个文件夹可能有子文件夹
//			
//				File[] fs1=file.listFiles();//获取当前文件下的子文件夹或者文件的File对象
//				if(fs!=null||fs.length > 0) {
//					for(File f1 : fs1) {
//						System.out.println(f1.getAbsolutePath()+"是文件");
//				}
//			}
//		}
					
					}
				}
		}
	}
}

