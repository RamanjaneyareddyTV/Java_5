import java.util.*;
public class Solution_37 {
 public static void main(String[] args) {
  String n1 = "123";
  String n2 = "456";
  System.out.println("'" + n1 + "'" + " + " + "'" + n2 + "'" + " = " + addStrings(n1, n2));
 }
 public static String addStrings(String n1, String n2) {
  int[] x = str_num(n1);
  int[] y = str_num(n2);
  int[] sum = new int[Math.max(x.length, y.length) + 1];
  int z = 0;
  int index = sum.length - 1;
  int i = 0;
  int j = 0;
  while (index >= 0) {
   if (i < x.length) {
    z += x[i++];
   }
   if (j < y.length) {
    z += y[j++];
   }
   sum[index--] = z % 10;
   z /= 10;
  }
  StringBuilder sb = new StringBuilder(sum.length);
  for (i = (sum[0] == 0 ? 1 : 0); i < sum.length; ++i) {
   sb.append(sum[i]);
  }
  return sb.toString();
 }

 private static int[] str_num(String num) {
  char[] digits = num.toCharArray();
  int[] number = new int[digits.length];
  int index = number.length - 1;
  for (char digit: digits) {
   number[index--] = digit - '0';
  }
  return number;
 }
}

