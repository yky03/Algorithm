package week3;

import java.util.Scanner;

public class Quiz_11720 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		while(n<1 || n>100) {
			n = scan.nextInt();
		}

		char[] a = new char[n];
		String n2 = scan.next();
		while (n2.length()>n) {
			n2 = scan.next();
		}
		
		for(int i=0; i<n2.length(); i++) {
			a[i] = n2.charAt(i);
		}
		
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += Integer.parseInt(String.valueOf(a[i]));
		}
		
		System.out.println(sum);
		

		
			
		
		
	}

}
