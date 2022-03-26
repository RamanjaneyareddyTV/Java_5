import java.util.*;
public class Solution_39 {  
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);	
        System.out.print("Input a positive integer: ");
        int n = in.nextInt(); 
		if (n>0)
		{
           System.out.print("Is "+n+" sum of two square numbers? "+sum_of_square_numbers(n));
		}  		
    }

 public static boolean sum_of_square_numbers(int n) {
        int left_num = 0, right_num = (int) Math.sqrt(n);
        while (left_num <= right_num) {
            if (left_num * left_num + right_num * right_num == n) {
                return true;
            } else if (left_num * left_num + right_num * right_num < n) {
                left_num++;
            } else {
                right_num--;
            }
        }
        return false;
    }
}

