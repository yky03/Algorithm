package week5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Quiz_4673 {

	public static void main(String[] args) {
		
		int[] a = new int[10000];
		for(int n=0; n<10000; n++) {
			String nums = String.valueOf(n);
	
			//System.out.println("nums : "+nums);
			
			int sum = 0;
			for(int i=0; i<nums.length(); i++) {
				sum += Integer.parseInt(String.valueOf(nums.charAt(i)));
			}
			
				a[n] = n+sum;
		}
		
		
		Arrays.sort(a);
		int d=0;
		while(true) {
			int c = Arrays.binarySearch(a, d);
			if(c<0) {
				System.out.println(d);
			}
			d++;
			if(d==10000) {
				return;
			}
		}
		
		
	}

}
