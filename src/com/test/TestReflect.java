package com.test;

/**
 * @author john
 *
 */
public class TestReflect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "abc";
		Class cls1 = str.getClass();
		Class cls2 = String.class;
		Class cls3 = null;
		
		try {
			cls3 = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(cls1==cls2);//true
		System.out.println(cls1==cls3);//true
		
		System.out.println(cls1.isPrimitive());//false
		System.out.println(int.class.isPrimitive());//true
		
		System.out.println(int.class == Integer.class);//false
		System.out.println(int.class == Integer.TYPE);//true
		
		System.out.println(int[].class.isPrimitive());//false
		System.out.println(int[].class.isArray());//true
	}

}
