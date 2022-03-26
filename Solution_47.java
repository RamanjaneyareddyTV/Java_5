import java.util.*;
import java.lang.*;
public class Solution_47 {
 public static void main(String[] args) {
  String str = "zxywooxz";
  System.out.print("Original string: " + str);
  System.out.print("\nAfter removing duplicate characters: " + remove_duplicate_letters(str));
 }
 public static String remove_duplicate_letters(String str1) {
  int[] ctr = new int[26];
  boolean[] in_stack = new boolean[26];
  char[] st_char = new char[str1.length()];
  int len = 0;

  for (char c: str1.toCharArray()) {
   ctr[c - 'a']++;
  }

  for (char c: str1.toCharArray()) {
   ctr[c - 'a']--;

   if (!in_stack[c - 'a']) {
    while (len > 0 && c < st_char[len - 1] && ctr[st_char[len - 1] - 'a'] > 0) {
     in_stack[st_char[--len] - 'a'] = false;
    }
    st_char[len++] = c;
    in_stack[c - 'a'] = true;
   }
  }
  return new String(st_char, 0, len);
 }
}

