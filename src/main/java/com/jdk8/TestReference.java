package com.jdk8;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Date 2019��07��09��_19:48
 * @Detail
 */
public class TestReference {

	public String sayHello(String name) {
		System.out.println(name);
		return name + "say hi";
	}

	public void test1() {
		//ʵ���������� ����
		TestReference test = new TestReference();
		Function<String, String> f2 = test::sayHello;
		f2.apply("dog");//��ʱ�ſ�ʼִ�з���
	}

	public interface Sheep {
		String getLove();
	}

	//���췽������
	public void test2() {
		Sheep sheep = String::new;
		sheep.getLove();

		Supplier s = TestReference::new;//��������
	}

	//3����ʵ������
	public interface Compare {//�Ƚ�

		int doCompare(String name1, String name2);
//String.compareTo()
	}

	public void test3() {
		Compare c = String::compareTo;
		int i = c.doCompare("a", "b");
		System.out.println(i);

	}

	//4
	public interface Compare2{
		int doCompare(Integer name1,Integer name2);
	}

	@Test
	public void test4(){
		Compare2 c2=Integer::compareTo;
		int m = c2.doCompare(3, 4);
		System.out.println(m);
	}

	//5 ��̬��������
	public interface  Compare3{
		int toMyInt(String str);
	}

	@Test
	public void test5(){
		Compare3 c3=Integer::valueOf;//���ǲο���Compare��
		int n = c3.toMyInt("55");
		System.out.println(n);
	}

}
