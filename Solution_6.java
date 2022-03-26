import java.util.Scanner;
public class Solution_6 {
	public static int euclid(int x, int y) {
		if (x == 0 || y == 0) {
			return 1;
		}
		if (x < y) {
			int t = x;
			x = y;
			y = t;
		}
		if (x % y == 0) {
			return y;
		} else {
			return euclid(y, x % y);
		}
	}

	public static void main(String[] args) {
		System.out.println("result: " + euclid(48, 24));
		System.out.println("result: " + euclid(125463, 9658));
	}
}
