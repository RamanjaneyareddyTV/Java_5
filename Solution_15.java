import java.util.*;
public class Solution_15 {	
 public static String transform_int_to_string(int n) {
    boolean is_negative = false;
    StringBuilder tsb = new StringBuilder();
    if (n == 0) {
      return "0";
    } else if (n < 0) {
      is_negative = true;
    }
    n = Math.abs(n);
    while (n > 0) {
      tsb.append(n % 10);
      n /= 10;
    }
    if (is_negative) {
      tsb.append("-");
    }
    return tsb.reverse().toString();
  }
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int n = in.nextInt();
 		System.out.println("String format of the said integer: " + transform_int_to_string(n));		
		}
}

