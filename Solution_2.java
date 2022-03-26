import java.util.Scanner;
public class Solution_2 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.print("Input first number: ");
         double n1 = in.nextDouble();
         System.out.print("Input second number: ");
         double n2 = in.nextDouble();
		 System.out.println(n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1);
	}
}
