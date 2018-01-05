package week4;

import java.util.Scanner;

public class Quiz_10871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		
		int num[] = new int[n];
		
		for(int i=0; i<num.length; i++) {
			num[i] = scan.nextInt();
			
			if(num[i] < x)
				System.out.print(num[i]+" ");
		}
		
		
	}

}
