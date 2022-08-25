package com.bridgelabz;

import java.util.Scanner;

public class Maximum<T extends Comparable<T>>

{
	T  x, y, z;

	public Maximum(T x, T y, T z) {

		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static <T extends Comparable<T>> T max(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public T max() {

		return max(x, y, z);
	}

	public static void main(String[] args) {

		Integer xx = 112, yy = 56, zz = 98;
		String xs = "apple", ys = "peach", zs = "banana";
		float xf = 6.6f, yf = 7.7f, zf = 8.8f;

		System.out.println("Maximum of values is " + max(xx, yy, zz));
		
		System.out.println("Maximum of values is " + max(xf, yf, zf));
		System.out.println("Maximum of values is " + max(xs, ys, zs));
		

	}

	
}
