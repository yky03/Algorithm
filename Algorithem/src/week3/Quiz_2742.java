package week3;

import java.util.Scanner;

public class Quiz_2742 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 100001;
		while(n>100000 ) {
			n = scan.nextInt();
		}
		
		for(int i=n;i>0; i--) {
			System.out.println(i);
		}
		
	}

}
