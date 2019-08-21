package com.jdk8;

import java.util.function.Function;
import org.junit.Test;
/**
 * @Date 2019��07��09��_19:30
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
		void sayHello(String name,String color);//ֻ��һ�����󷽷�

	}
	@Test
	public void test2(){
		Tiger tig=(name,color)-> System.out.println(name+color);
		tig.sayHello("С��", "��ɫ");

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
		d.sayHello("��", "green");
	}
}
