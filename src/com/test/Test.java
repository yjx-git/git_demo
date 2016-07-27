package com.test;

import java.lang.reflect.*;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//--------------------------------------------------
//		int a=0;
//		int c=0;
//		do{
//			System.out.println("--a" + a);
//			System.out.println("--c" + c);
//			--c;
//			System.out.println("--c" + c);
//			a=a-1;
//			System.out.println("--a" + a);
//		}while(a>0);
//
//		System.out.println(a);
		
//--------------------------------------------------
		try {
			Class c = Class.forName("java.util.Stack");
			Method m[] = c.getDeclaredMethods();
			for (int i = 0; i < m.length; i++) {
				System.out.println(m[i].toString());
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
//--------------------------------------------------
		
//--------------------------------------------------
		
	}

}
