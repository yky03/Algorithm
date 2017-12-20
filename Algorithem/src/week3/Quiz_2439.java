package week3;

import java.util.Scanner;

public class Quiz_2439 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		while(n<1 || n>100) {
			n = scan.nextInt();
		}
		
		
		//5-4만큼 공백찍고 별한개찍음
		//5-3만큼 공백찍고 별두개찍음
		//5-2만금 공백찍고 별한개찍음
		for(int i=1; i<=n; i++) {
			for(int j=n; 0<j-i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
