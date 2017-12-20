package week3;

import java.util.Scanner;

public class Quiz_2739 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		while(n<1 || n>9) {
			n = scan.nextInt();
		}
		
		for(int i=1; i<=9; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}

}
