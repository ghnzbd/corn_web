package com.jdk8;

import java.util.function.Function;

/**
 * @Date 2019年07月09日_10:56
 * @Detail  替代内部方法。将方法当做参数传递给其他方法。
 */
public class SimpleLambda {
	public static void main(String[] args) {
		new Thread(() -> System.out.println("simmple"));
		new Thread(() -> System.out.println("test lambda")).start();
			//内部类简写，第1个括号是形参。箭头右面是方法体内容。

		getAge(a->Integer.parseInt(a),"16");
	}

	//String转Int
	public static Integer getAge(Function<String,Integer> function,String s){
		return function.apply(s);
	}
}
