package com.jdk8;

import java.util.stream.Stream;

/**
 * @Date 2019Äê07ÔÂ10ÈÕ_22:28
 * @Detail
 */
public class TestStream {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 6, 3, 0);
		Integer reduce = stream.reduce(0, (a1, a2) -> a1 + a2);
		System.out.println(reduce);


	}
}
