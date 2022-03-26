import java.util.*;
public class Solution_46 {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Input a prime number: ");
  int n = in .nextInt();
  System.out.print("Position of the said Prime number: " + kth_Prime(n));
 }
 public static int kth_Prime(int n) {
  int[] prime_num = new int[10000];
  int num = 3;
  int i = 0, index = 0;
  prime_num[0] = 2;
  while (num <= n) {
   for (i = 0; i <= index; i++) {
    if (num % prime_num[i] == 0) {
     break;
    }
   }
   if (i > index) {
    prime_num[++index] = num;
   }
   num++;
  }
  return index + 1;
 }
}

