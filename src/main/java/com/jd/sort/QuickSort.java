package com.jd.sort;

/**
 * @Date 2019��06��13��_0:50
 * @Detail ������
 */
public class QuickSort {
	public static void main(String[] args) {
		int[] str = {5, 6, 3, 1, 2, 0, 3};
		for (int m : str) {
			System.out.print(m + ",");
		}
		System.out.println();
		sort(str, 0, str.length - 1);
		for (int m : str) {
			System.out.print(m + ",");
		}

	}

	public static void sort(int[] str, int start, int end) {
		if (start >= end) {
			return;
		}
		int left = start;
		int right = end;
		int key = str[start];
		while (left <right) {
			while (left < right && str[right] >=key) {
				right--;
			}
			str[left] = str[right];//��һ����д���ˡ� ����str[left]=key;
			while (left < right && str[left] <=key) {
				left++;
			}
			str[right] = str[left];
		}
		str[left] = key;
		sort(str, start, left - 1);//��һ����д���ˡ����� key-1.����left-1.(key��û�иı䣬��left�仯��)
		sort(str, left + 1, end);
	}
}
