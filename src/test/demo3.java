package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class demo3 {

	@Test
	public void test1() {

		int arr[] = { 1, 2, 3 };
		for (int num : arr) {
			System.out.println(num);
		}
	}

	@Test
	public void test2() {

		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);

		for (Object obj : list) {
			int i = (Integer) obj;
			System.out.println(i);
		}

	}

	@Test
	public void test3() {

		Map map = new LinkedHashMap();
		map.put("1", "aaa");
		map.put("2", "bbb");
		map.put("3", "ccc");

		// 传统方法
		Set set = map.keySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			String value = (String) map.get(key);
			System.out.println(key + "-" + value);
		}

	}

	@Test
	public void test4() {

		Map map = new LinkedHashMap();
		map.put("1", "aaa");
		map.put("2", "bbb");
		map.put("3", "ccc");

		// 传统方法1
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			String key = (String) entry.getKey();
			String value = (String) entry.getValue();

			System.out.println(key + "-" + value);
		}

	}

	@Test
	public void test5() {

		Map map = new LinkedHashMap();
		map.put("1", "aaa");
		map.put("2", "bbb");
		map.put("3", "ccc");

		// 增强for取map的第一种方法
		for (Object obj : map.keySet()) {
			String key = (String) obj;
			String value = (String) map.get(key);
			System.out.println(key + "-" + value);
		}

	}
	

}
