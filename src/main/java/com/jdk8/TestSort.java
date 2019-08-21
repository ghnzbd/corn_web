package com.jdk8;

import sun.applet.AppletIllegalArgumentException;

import java.lang.reflect.Proxy;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Date 2019��07��10��_19:10
 * @Detail ��ƻ������
 */
public class TestSort {
	public static void main(String[] args) {
//ԭ
		ArrayList<Apple> appleList = new ArrayList<>();
		Collections.sort(appleList, new Comparator<Apple>() {
			@Override
			public int compare(Apple o1, Apple o2) {
				return o1.getWeight() - o2.getWeight();
			}
		});
		//�Ľ�2  ��ͳ����
		Collections.sort(appleList, (p1, p2) -> p1.getWeight() - p2.getWeight());
//�Ľ�3  ������
		appleList.stream().sorted((p1, p2) -> p1.getWeight() - p2.getWeight()).collect(Collectors.toList());


		//�������򡢣����Լ������ݿ�ڵ㣬����ҵ���߼�����JavaӦ�ýڵ�
		Map<String, List<Apple>> map = appleList.stream()
				.filter(a -> !a.getColor().equals("red"))
				.sorted((p1, p2) -> p1.getWeight() - p2.getWeight())
				//.collect(Collectors.toList());
				.collect(Collectors.groupingBy(a -> a.getColor()));


		//--------��̬����
		Function f = (Function) Proxy.newProxyInstance(TestSort.class.getClassLoader(),
				new Class[]{Function.class}, (p, m, a) -> {
					return "³��";
				});
		f.apply("add");


		//-------------���,jdk�Դ���һЩ����ʽ �ӿ�
		for (Apple a : appleList) {
			System.out.println(a);
		}

		appleList.stream().forEach(System.out::println);
		appleList.stream().forEach(a -> System.out.println(a.getColor()));

		//���  ���ˣ�ͳ�ƣ���ӡ
		//���Ǵ�ͳ��ʽ
		for (Apple a : appleList) {
			System.out.println(a);
		}
		Collections.sort(appleList, new Comparator<Apple>() {
			@Override
			public int compare(Apple o1, Apple o2) {
				return o1.getWeight() - o2.getWeight();
			}
		});

		Collections.sort(appleList, (o1, o2) -> o1.getWeight() - o2.getWeight());
		//������ ʹ���˺���ʽ���

//����ʹ��stream����һ�������ɡ�
		appleList.stream().filter(a -> a.getColor().equals("red")).forEach(System.out::println);//����ִ�и��죬��Ϊ��ֻ������һ�Ρ�

		appleList.stream().filter(a -> a.getColor().equals("red"))
				.sorted(Comparator.comparingInt(Apple::getWeight))
				.forEach(System.out::println);

	}

	//
}
