public class Solution {
	public static void main(String[] args) {
		int r1 = (101 + 0) / 3;
		double r2 = 3.0e-6 * 10000000.1;
		boolean r3 = true && true;
		boolean r4 = false && true;
		boolean r5 = (false && false) || (true && true);
		boolean r6 = (false || false) && (true && true);
		
		System.out.println("(101 + 0) / 3)-> " + r1);
		System.out.println("(3.0e-6 * 10000000.1)-> " + r2);
		System.out.println("(true && true)-> " + r3);
		System.out.println("(false && true)-> " + r4);
		System.out.println("((false && false) || (true && true))-> " + r5);
		System.out.println("(false || false) && (true && true)-> " + r6);
	}
}
