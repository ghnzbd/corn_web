package com.jdk8;

/**
 * @Date 2019��07��09��_18:55
 * @Detail ����ʽ��̡�
 */
//@FunctionalInterface
public interface BirdFunction {
	void birdHello();//�ӿ���ֻ��һ�����󷽷�������ӿ���ͻᱻĬ�ϵ���һ�� ����ʽ�ӿڡ�
	default  void birdEat(){

	}//defaultΪ�˼���jdk 1.7

	@Override
	String toString();// ����object�з�������Ӱ�졣
	String toString2();
}
