package com.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 参考  https://www.cnblogs.com/junjiang3/p/8998509.html
 * 好处：减少代码冗余，如：内部类、匿名类
 * @Date 2019年07月07日_17:06
 * @Detail
 */
public class T1 {
	public static void main(String[] args) {
		//一、场景：内部类
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("this is run()");
			}
		});
		//以下使用lambda表达式-简写

		Thread th2=new Thread(()-> System.out.println("this is run()"));
		th2.start();
		//二、场景：排序
		List<String> list = Arrays.asList(new String[]{"a", "b", "d"});

		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		// 用lambda
		Collections.sort(list, (str1,str2)->str1.compareTo(str2));

	}

}
