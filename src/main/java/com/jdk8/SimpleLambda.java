package com.jdk8;

import java.util.function.Function;

/**
 * @Date 2019��07��09��_10:56
 * @Detail  ����ڲ������������������������ݸ�����������
 */
public class SimpleLambda {
	public static void main(String[] args) {
		new Thread(() -> System.out.println("simmple"));
		new Thread(() -> System.out.println("test lambda")).start();
			//�ڲ����д����1���������βΡ���ͷ�����Ƿ��������ݡ�

		getAge(a->Integer.parseInt(a),"16");
	}

	//StringתInt
	public static Integer getAge(Function<String,Integer> function,String s){
		return function.apply(s);
	}
}
