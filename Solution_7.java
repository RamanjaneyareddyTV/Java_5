import java.util.Scanner;
public class Solution_7 {
	public static int prime_cell(int a, int b) {
		if (a == 0 || b == 0) {
			return 1;
		}
		if (a < b) {
			int t = a;
			a = b;
			b = t;
		}
		if (a % b == 0) 
		{
			return b;
		} 
		else 
		{
			return prime_cell(b, a % b);
		}
	}

	public static void main(String[] args) {
		int n = 3;
		boolean[][] A = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = prime_cell(i, j) == 1;
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}
}

