package Tcs;

public class Array_Task1 {
	public static void main(String[] args) {
		int a [] = new int[] {23,32,10,9,88};
		int b;
		 for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i]<a[j]) {
				b=a[i];
				a[i]=a[j];
				a[j]= b;
				}
			}
		
		}
		
		for (int i : a) {
			System.out.println(i);
			
		}
	}

}
