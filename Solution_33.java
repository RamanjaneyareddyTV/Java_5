import java.util.*;
public class Solution_33 {  
   public static void main(String[] args) {
        String str1 = "abca";
		String str2 = "zbxz";
		System.out.println("Is "+str1 +" and "+str2 +" are Isomorphic? "+is_Isomorphic(str1, str2));
    }

  public static boolean is_Isomorphic(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length())
			return false;
        Map<Character, Character> map = new HashMap<>();
        
        for (int i = 0; i < str1.length(); i++) {
            char char_str1 = str1.charAt(i), char_str2 = str2.charAt(i);
            if (map.containsKey(char_str1)) 
			{
                if (map.get(char_str1) != char_str2)
					return false;
            }
			else 
			{
                if (map.containsValue(char_str2)) 
					return false;
             map.put(char_str1, char_str2);
            }
        }
        
        return true;
    }
}

