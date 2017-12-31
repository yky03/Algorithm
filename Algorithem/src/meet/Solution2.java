package meet;

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
class Solution2 {
	static int Answer;

	public static void main(String args[]) throws Exception	{
		
		String checkWord[] = {
		   "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al",
		   "Si", "P", "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe",
		   "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr",
		   "Y","Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb",
		   "Te", "I", "Xe", "Cs", "Ba", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au",
		   "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Rf", "Db", "Sg",
		   "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Fl", "Lv", "La", "Ce", "Pr", "Nd",
		   "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Ac",
		   "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md",
		   "No", "Lr"  } ;
		
		//System.out.println(checkWord.length); 배열크기114
		
	
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = 0;
		
		while(T<1 || T>10215) {
			T = sc.nextInt();
		}
		
		String[] word = new String[T];
		
		for(int test_case = 0; test_case < T; test_case++) {
			for(int i=0; i<word.length; i++) {
					word[i] = sc.nextLine();
				while(word[i].length()<1 || word[i].length()>50000) {
					word[i] = sc.nextLine();
				}
			}
			
			for(int i=0; i<word.length;i++) {
				for(int j=0; j<checkWord.length; j++) {
					if(word[i].contains(checkWord[j].toLowerCase())) {
						System.out.println(checkWord[j].toLowerCase());
						word[i] = word[i].replace(checkWord[j].toLowerCase(), "");
					}
				}
			}
			
			//System.out.println("Case #"+(test_case+1));
			for(int i=0; i<word.length; i++) {
				if(word[i].equals("")) { //check안에있는 단어의 조합으로만 이루어져있음
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
			
		}
		
		
		//긴문자의 배열부터 검사하고
		//짧은 문자 배열 검사해야함 o 빼버리면 mo조합이 안나옴
		
		
	}
}