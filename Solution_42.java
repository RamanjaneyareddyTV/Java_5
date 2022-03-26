public class Solution_42 {
    public static void main(String[] args) {
     int num = 3;
     int matrix[][] = {
      {2,5,3},
      {3,2,1},
      {1,3,5}
     };
     int r = matrix.length;
     int c = matrix[0].length - 1;
     int m = 0, n = 0;
     Boolean flag = false;
     while (m < r) {
      while (n <= c) {
       if (matrix[m][n] == num) {
        System.out.print("\n(" + m + "," + n + ")\n");
        flag = true;
       }
       n++;
      }
      m++;
      n = 0;
     }
     if (flag == false)
      System.out.print("Number not found!");
    }
   }
   
