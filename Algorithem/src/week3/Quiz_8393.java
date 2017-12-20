package week3;

import java.util.Scanner;

public class Quiz_8393 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		while(n<1 || n>10000) {
			n = scan.nextInt();
		}
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
