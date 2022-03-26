import java.util.*;
public class Solution_20 {	
 public static boolean is_str_contains(String str1, String str2) {
    if (str1 == null || str2 == null) {
      throw new IllegalArgumentException("You can't pass null strings as input.");
    }
     boolean ans = false;
     for (int i = 0; i < str2.length() - 1; i++) {
       if (str2.charAt(i) == str1.charAt(0)) {
         for (int j = 0; j < str1.length(); j++) {
           if ((i + j) < str2.length() && str1.charAt(j) == str2.charAt(i + j) && j == str1.length() - 1) {
             ans = true;
             break;
           }
        }
      }
    }
    return ans;
  }

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first string: ");
		String str1 = scanner.nextLine();
		System.out.print("Input second string: ");
		String str2 = scanner.nextLine();
		System.out.println("If the second string contains the first one? "+is_str_contains(str1, str2));		
		}
}

