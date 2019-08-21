package com.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * �ο�  https://www.cnblogs.com/junjiang3/p/8998509.html
 * �ô������ٴ������࣬�磺�ڲ��ࡢ������
 * @Date 2019��07��07��_17:06
 * @Detail
 */
public class T1 {
	public static void main(String[] args) {
		//һ���������ڲ���
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("this is run()");
			}
		});
		//����ʹ��lambda���ʽ-��д

		Thread th2=new Thread(()-> System.out.println("this is run()"));
		th2.start();
		//��������������
		List<String> list = Arrays.asList(new String[]{"a", "b", "d"});

		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		// ��lambda
		Collections.sort(list, (str1,str2)->str1.compareTo(str2));

	}

}
