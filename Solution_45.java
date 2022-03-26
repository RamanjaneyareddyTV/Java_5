import java.util.*;
public class Solution_45 {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Input a positive integer: ");
  int n = in .nextInt();
  System.out.print("Is the said number perfect square? " + is_Perfect_Square(n));
 }

 public static boolean is_Perfect_Square(int n) {
  int x = n % 10;
  if (x == 2 || x == 3 || x == 7 || x == 8) {
   return false;
  }
  for (int i = 0; i <= n / 2 + 1; i++) {
   if ((long) i * i == n) {
    return true;
   }
  }
  return false;
 }
}
