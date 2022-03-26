import java.util.*;
public class Solution_27 {
 public static void main(String[] args) {
  int[] nums = {9,9,9,9};
  System.out.println("Original array: " + Arrays.toString(nums));
  System.out.println("Array of digits: " + Arrays.toString(plus_One_digit(nums)));
 }
 public static int[] plus_One_digit(int[] digits_nums) {
  for (int i = digits_nums.length - 1; i > -1; --i) {
   if (digits_nums[i] != 9) {
    digits_nums[i] += 1;
    for (int j = i + 1; j < digits_nums.length; ++j) {
     digits_nums[j] = 0;
    }
    return digits_nums;
   }
  }
  int[] result = new int[digits_nums.length + 1];
  result[0] = 1;
  return result;
 }
}

