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
	
	static int Answer; //�ִ밪 K�� ��

	public static void main(String args[]) throws Exception	{
		
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt")); ����� �ּ� ����?
		
		//�׽�Ʈ���̽� �ڿ��� 1<=T<=20
		int T = 0;
		while(T<1 || T>20) { 
			T = sc.nextInt();
		}
		
		for(int test_case = 0; test_case < T; test_case++) {

			Answer = 0; //�׽�Ʈ ���̽����� �ʱ�ȭ
			
			//20�� �ʰ��� ���Է�
			int N = 200001;
			while(N > 200000) {
				N = sc.nextInt();
			}
			
			//������ �� �ִ� ������ ��
			int K = sc.nextInt(); 
			while(K>N) { //�������� �־��������� Ŭ���� ����
				K = sc.nextInt(); 
			}
			
			//100������ ���� �ƴ� ���� N����ŭ �Է¹��� , ���� ��ȿ���˻� ���� ��ó��.
			int[] point = new int[N];
			for(int i=0; i<point.length; i++) { 
				point[i] = sc.nextInt(); 
			}
			
			//������ N���� �ִ밪������ �������� ����
			
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
			
			
			//�������� ���ĵ��ִ� �迭�� K����ŭ �̾Ƽ� ��(Answer)�� ����
	        for(int i=0; i<K; i++) {
	        	Answer += point[i];
	        }
			

			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}