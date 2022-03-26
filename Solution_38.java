import java.util.*;
public class Solution_38 {
 public static void main(String[] args) {
  String str1 = "Java Programming Exercises, Practice, Solution";
  String str2 = "Java Programming Exercises, Practice,";
  System.out.println("Missing string: " + Arrays.toString(missing_Words(str1, str2)));
 }

 public static String[] missing_Words(String t, String s) {

  String[] s1 = t.split(" ");
  String[] s2 = s.split(" ");
  int sz = s1.length - s2.length;
  String[] missing_str = new String[sz];
  int c = 0;
  for (int i = 0; i < s1.length; i++) {
   int flag = 0;
   for (int j = 0; j < s2.length; j++) {
    if (s1[i].equals(s2[j]))
     flag = 1;
   }
   if (flag == 0) {
    missing_str[c++] = s1[i];
   }
  }
  return missing_str;
 }
}

