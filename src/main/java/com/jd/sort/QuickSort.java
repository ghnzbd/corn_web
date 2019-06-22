package com.jd.sort;

/**
 * @Date 2019年06月13日_0:50
 * @Detail 再做下
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
			str[left] = str[right];//这一步别写错了。 不是str[left]=key;
			while (left < right && str[left] <=key) {
				left++;
			}
			str[right] = str[left];
		}
		str[left] = key;
		sort(str, start, left - 1);//这一步别写错了。不是 key-1.而是left-1.(key并没有改变，而left变化。)
		sort(str, left + 1, end);
	}
}
