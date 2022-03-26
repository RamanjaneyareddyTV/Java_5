import java.util.Scanner;
public class Solution_4 {
	public static void main(String[] args) {
		int[][] twodm = {
				{10, 20, 30},
				{40, 50, 60}
		};
		System.out.print("Original Array:\n");
		print_array(twodm);
		System.out.print("After changing the rows and columns of the said array:");
		transpose(twodm);
		}
	
	private static void transpose(int[][] twodm) {
		
		int[][] newtwodm = new int[twodm[0].length][twodm.length];
		
		for (int i = 0; i < twodm.length; i++) {
			for (int j = 0; j < twodm[0].length; j++) {
				newtwodm[j][i] = twodm[i][j];
			}
		}
		
		print_array(newtwodm);
	}
	private static void print_array(int[][] twodm) {
		for (int i = 0; i < twodm.length; i++) {
			for (int j = 0; j < twodm[0].length; j++) {
				System.out.print(twodm[i][j] + " ");
			}
			System.out.println();
		}
	
	}
}

