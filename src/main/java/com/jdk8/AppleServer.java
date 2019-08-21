package com.jdk8;

import com.sun.org.apache.regexp.internal.REUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Date 2019年07月09日_11:26
 * @Detail 基于stream进行过滤。
 */
public class AppleServer {

	private List<Apple> list = new ArrayList<Apple>();

	public List<Apple> getRedApple() {
		ArrayList result = new ArrayList<>();
		for (Apple a : list) {
			if (a.getColor().equals("red")) {
				result.add(a);
			}
		}
		return result;
	}

	public List<Apple> getRedAppleBy(Predicate<Apple> predicate) {
		ArrayList result = new ArrayList<>();
		for (Apple a : list) {
			if (a.getColor().equals("red")) {
				result.add(a);
			}
		}

		//或者这样写
		list.stream().filter(predicate).collect(Collectors.toList());
		list.stream().filter(predicate).collect(Collectors.toList());


		return result;
	}

	public static void main(String[] args) {
		AppleServer server = new AppleServer();
		server.getRedAppleBy(a->a.getColor().equals("red")&&a.getWeight()>50);
		server.getRedApple();

	}
}
