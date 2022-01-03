package Tcs;

import java.util.List;
import java.util.Vector;

public class Sample_2 {
	public static void main(String[] args) {
		
		List<Object> a1 = new Vector<Object>();
		List<Object> a2 = new Vector<Object>();
		List<Object> a3 = new Vector<Object>();
		
		
		a1.add(34);
		a1.add(76);
		a1.add("Types");
		a1.add(88);
		a1.add(1000);
		System.out.println(a1);
		
		
		a2.add(99);
		a2.add(90);
		a2.add("Hello java");
		a2.add("Respect");
		a2.add(33);
		System.out.println(a2);
		
		int size = a1.size();
		System.out.println(size);
		
		Object object = a2.get(3);
		System.out.println(object);
		
	}

}
