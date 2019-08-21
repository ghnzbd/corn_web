package com.jdk8;

/**
 * @Date 2019年07月09日_18:55
 * @Detail 函数式编程。
 */
//@FunctionalInterface
public interface BirdFunction {
	void birdHello();//接口中只有一个抽象方法，这个接口类就会被默认当成一个 函数式接口。
	default  void birdEat(){

	}//default为了兼容jdk 1.7

	@Override
	String toString();// 这是object中方法，不影响。
	String toString2();
}
