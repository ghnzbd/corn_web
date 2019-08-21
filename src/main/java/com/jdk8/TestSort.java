package com.jdk8;

import sun.applet.AppletIllegalArgumentException;

import java.lang.reflect.Proxy;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Date 2019年07月10日_19:10
 * @Detail 对苹果排序
 */
public class TestSort {
	public static void main(String[] args) {
//原
		ArrayList<Apple> appleList = new ArrayList<>();
		Collections.sort(appleList, new Comparator<Apple>() {
			@Override
			public int compare(Apple o1, Apple o2) {
				return o1.getWeight() - o2.getWeight();
			}
		});
		//改进2  传统排序
		Collections.sort(appleList, (p1, p2) -> p1.getWeight() - p2.getWeight());
//改进3  流排序
		appleList.stream().sorted((p1, p2) -> p1.getWeight() - p2.getWeight()).collect(Collectors.toList());


		//增加排序、（可以减少数据库节点，）把业务逻辑放在Java应用节点
		Map<String, List<Apple>> map = appleList.stream()
				.filter(a -> !a.getColor().equals("red"))
				.sorted((p1, p2) -> p1.getWeight() - p2.getWeight())
				//.collect(Collectors.toList());
				.collect(Collectors.groupingBy(a -> a.getColor()));


		//--------动态代理
		Function f = (Function) Proxy.newProxyInstance(TestSort.class.getClassLoader(),
				new Class[]{Function.class}, (p, m, a) -> {
					return "鲁班";
				});
		f.apply("add");


		//-------------最后,jdk自带的一些函数式 接口
		for (Apple a : appleList) {
			System.out.println(a);
		}

		appleList.stream().forEach(System.out::println);
		appleList.stream().forEach(a -> System.out.println(a.getColor()));

		//如果  过滤，统计，打印
		//先是传统方式
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
		//下面是 使用了函数式编程

//下面使用stream流，一条语句完成。
		appleList.stream().filter(a -> a.getColor().equals("red")).forEach(System.out::println);//这样执行更快，因为它只遍历了一次。

		appleList.stream().filter(a -> a.getColor().equals("red"))
				.sorted(Comparator.comparingInt(Apple::getWeight))
				.forEach(System.out::println);

	}

	//
}
