import java.util.*;
import java.lang.*;
public class Solution_40 {
 static final int MAX_CHAR = 20;

 public static void main(String args[]) {
  String str1 = "AND456HSE8";
  System.out.println(arrange_String_nums(str1));
 }
 static String arrange_String_nums(String str1) {
  int char_count[] = new int[MAX_CHAR];
  int sum_num = 0;
  for (int i = 0; i < str1.length(); i++) {
   if (Character.isUpperCase(str1.charAt(i)))
    char_count[str1.charAt(i) - 'A']++;
   else
    sum_num = sum_num + (str1.charAt(i) - '0');
  }

  String rarr_part = "";

  for (int i = 0; i < MAX_CHAR; i++) {
   char ch = (char)('A' + i);
   while (char_count[i]-- != 0)
    rarr_part = rarr_part + ch;
  }

  if (sum_num > 0)
   rarr_part = rarr_part + sum_num;
  return rarr_part;
 }
}
