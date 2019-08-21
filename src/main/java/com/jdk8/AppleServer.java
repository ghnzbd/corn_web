package com.jdk8;

import com.sun.org.apache.regexp.internal.REUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Date 2019��07��09��_11:26
 * @Detail ����stream���й��ˡ�
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

		//��������д
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
