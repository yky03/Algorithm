package meet;

import java.io.FileInputStream;

/*
You should use the statndard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful. 
*/

import java.util.Scanner;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class Solution {
	
	static int Answer; //최대값 K개 합

	public static void main(String args[]) throws Exception	{
		
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt")); 제출시 주석 해제?
		
		//테스트케이스 자연수 1<=T<=20
		int T = 0;
		while(T<1 || T>20) { 
			T = sc.nextInt();
		}
		
		for(int test_case = 0; test_case < T; test_case++) {

			Answer = 0; //테스트 케이스마다 초기화
			
			//20만 초과시 재입력
			int N = 200001;
			while(N > 200000) {
				N = sc.nextInt();
			}
			
			//공부할 수 있는 과목의 수
			int K = sc.nextInt(); 
			while(K>N) { //뽑을수가 주어진수보다 클수는 없음
				K = sc.nextInt(); 
			}
			
			//100이하의 음이 아닌 정수 N개만큼 입력받음 , 정수 유효성검사 아직 미처리.
			int[] point = new int[N];
			for(int i=0; i<point.length; i++) { 
				point[i] = sc.nextInt(); 
			}
			
			//받은수 N개중 최대값순으로 내림차순 정렬
			
			int temp = 0; 
	        for (int i = 0; i < point.length; i++) {
	            for (int j = i + 1; j < point.length; j++) {
	                if (point[i] < point[j]) {
	                    temp = point[i];
	                    point[i] = point[j];
	                    point[j] = temp;
	                }
	            }
	        }
			
			
			//내림차순 정렬되있는 배열중 K개만큼 뽑아서 합(Answer)을 구함
	        for(int i=0; i<K; i++) {
	        	Answer += point[i];
	        }
			

			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}