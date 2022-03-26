import java.util.*;
public class Solution_36 {
 public static void main(String[] args) {
  String str1 = "zyxwyxyxzwxyz";
  String str2 = "xyz";
  System.out.println("Original String: " + str1);
  System.out.println("Starting anagram indices of " + str2 + ": " + find_Anagrams(str1, str2));
 }

 public static List < Integer > find_Anagrams(String str1, String str2) {
  List < Integer > list = new ArrayList < Integer > ();
  if (str1.length() < str2.length() || str2.length() < 1) {
   return list;
  }
  if (str1.equals(str2)) {
   list.add(0);
   return list;
  }

  HashMap < Character, Integer > map = new HashMap < > ();
  for (char c: str2.toCharArray()) {
   if (map.containsKey(c)) {
    map.put(c, map.get(c) + 1);
   } else {
    map.put(c, 1);
   }
  }
  int str2_length = str2.length();
  int current_length = 0;
  int correct_chars = 0;

  for (int i = 0; i < str1.length(); ++i) {
   current_length++;
   if (map.containsKey(str1.charAt(i))) {
    int ctr = map.get(str1.charAt(i));
    if (ctr > 0) {
     correct_chars++;
    }
    map.put(str1.charAt(i), ctr - 1);
   }

   if (current_length == str2_length) {
    int begin_pos = i - str2_length + 1;
    if (correct_chars == str2_length) {
     list.add(begin_pos);
    }
    if (map.containsKey(str1.charAt(begin_pos))) {
     int ctr = map.get(str1.charAt(begin_pos));
     if (ctr >= 0) {
      correct_chars--;
     }
     map.put(str1.charAt(begin_pos), ctr + 1);
    }
    current_length--;
   }
  }
  return list;
 }
}

