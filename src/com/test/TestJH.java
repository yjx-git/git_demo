package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestJH {

	/**
	 * List	以特定次序来持有元素，可有重复元素；
	 * Set	无法拥有重复元素,内部排序（无序）；
	 * Map	保存key-value值，value可多值。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//---------------------------------
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("d");
		list.add("b");
		list.add("b");
		list.add("e");
		list.add("b");
		list.add("c");
		for (String str : list) {
			System.out.println(str);
		}
		
		System.out.println("---------------------");
		
		Set<String> s = new HashSet<String>();
		s.add("a");
		s.add("b");
		s.add("d");
		s.add("e");
		s.add("c");
		s.add(null);
		s.add(null);
		s.add("d");
		for (Iterator<String> iterator = s.iterator(); iterator.hasNext();) {
			String str = (String) iterator.next();
			System.out.println(str);
		}
		
		System.out.println("---------------------");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("a", "a");
		map.put("b", "b");
		map.put("e", "e");
		map.put("b", "b");
		map.put("c", "c");
		map.put(null, "c");
		map.put(null, "c");
		map.put("d", "d");
		Set<Entry<String, Object>> entry = map.entrySet();
		for (Entry<String, Object> ent : entry) {
			System.out.println(ent.getKey());
		}
		

	}

}
