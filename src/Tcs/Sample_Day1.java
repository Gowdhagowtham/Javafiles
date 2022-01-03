package Tcs;

import java.util.ArrayList;
import java.util.List;

public class Sample_Day1 {
	public static void main(String[] args) {
		
		List<Object> l1 = new ArrayList<Object>();
		
		l1.add("Simple");
		l1.add("High");
		l1.add(234);
		l1.add(890);
		l1.add("A");
		
		int size = l1.size();
		System.out.println(size);
		
		Object object = l1.get(2);
		System.out.println(object);
		
		Object set = l1.set(234,456);
		System.out.println(set);
		System.out.println(l1);
	}

}
