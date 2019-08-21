package com.jdk8;

import java.util.function.Function;
import org.junit.Test;
/**
 * @Date 2019年07月09日_19:30
 * @Detail
 */
public class TestMyFunction {
	public static void main(String[] args) {

	}
	//-------------1
	@Test
	public void test1(){
		Function<Object, Object> f1 = Function.identity();
		//Function<Object, Object> f1 = t->(return t);
		//Function<Object, Object> f1 = t->t;
		Object result = f1.apply("luban");
		System.out.println(result);

	}
//--------------2
	public interface Tiger{
		void sayHello(String name,String color);//只有一个抽象方法

	}
	@Test
	public void test2(){
		Tiger tig=(name,color)-> System.out.println(name+color);
		tig.sayHello("小虎", "棕色");

	}
//----------3
	public interface  Dragon{
		String sayHello(String n,String color);
	}
	@Test
	public void test3(){
		Dragon d=(String n,String c)->{
			System.out.println(n);
			System.out.println(c);
			return n+c;//return String
		};
		d.sayHello("龙", "green");
	}
}
