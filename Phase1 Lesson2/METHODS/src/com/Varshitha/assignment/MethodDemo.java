package com.Varshitha.assignment;

public class MethodDemo {
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
		}
		public static void main(String[] args) {
		MethodDemo b=new MethodDemo();
		int ans= b.multipynumbers(10,4);
		System.out.println("Multipilcation is :"+ans);
		}

}
