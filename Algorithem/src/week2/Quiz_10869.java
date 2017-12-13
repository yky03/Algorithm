package week2;

import java.util.Scanner;

public class Quiz_10869 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
			while(a<1 || b>10000) {
				a = scan.nextInt();
				b = scan.nextInt();
			}
		
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
	}

}
