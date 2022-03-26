import java.util.*;
public class Solution_26 {
 public static void main(String[] args) {
  int[] nums = { 10, 11, 12, 13, 14, 7, 8, 9, 1, 2, 3 };
  System.out.println("Original array: " + Arrays.toString(nums));
  System.out.println("Size of longest increasing continuous subsequence: " + longest_seq(nums));
 }

 public static int longest_seq(int[] nums) {
  int max_sequ = 0;
  if (nums.length == 1) return 1;
  for (int i = 0; i < nums.length - 1; i++) {
   int ctr = 1;
   int j = i;
   if (nums[i + 1] > nums[i]) {
    while (j < nums.length - 1 && nums[j + 1] > nums[j]) {
     ctr++;
     j++;
    }
   } else if (nums[i + 1] < nums[i]) {
    while (j < nums.length - 1 && nums[j + 1] < nums[j]) {
     ctr++;
     j++;
    }
   }
   if (ctr > max_sequ) {
    max_sequ = ctr;
   }
   i += ctr - 2;
  }
  return max_sequ;
 }
}

