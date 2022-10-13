package udemyPractices;

public class MatrixProblem {
	/*
	 * A 2 3 4 5 6
	 * 1 B 3 4 5 6
	 * 1 2 C 4 5 6
	 * 1 2 3 D 5 6
	 * 1 2 3 4 E 6
	 * 1 2 3 4 5 F
	 */

	public static void main(String[] args) {
		int Max = 6;
		int k = 65;
		boolean flag = false;
		for (int i = 1; i < Max+1; i++) {
			for (int j = 1; j < Max+1; j++) {
				if (i == j) {
					System.out.print( (char)k);			
				}				
			else {
				System.out.print(j);
				}
			System.out.print(" ");
			}
		System.out.println();
		k++;
		}
	   }
	}


