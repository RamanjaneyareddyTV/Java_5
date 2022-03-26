import java.util.*;
public class Solution_43 {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Input side1: ");
  int s1 = in .nextInt();
  System.out.print("Input side2: ");
  int s2 = in .nextInt();
  System.out.print("Input side3: ");
  int s3 = in .nextInt();

  System.out.print("Is the said sides form a triangle: " + isValidTriangle(s1, s2, s3));
 }
 public static boolean isValidTriangle(int a, int b, int c) {
  return (a + b > c && b + c > a && c + a > b);
 }
}

