package week3;

import java.util.Scanner;

public class Quiz_2438 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		while(n<1 || n>100) {
			n = scan.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
