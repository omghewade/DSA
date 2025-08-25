package Array;

import java.util.*;
public class MultiDImantionalArray {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the size of matrix");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int  arr [][] = new int[row][col];

        System.out.println("enter the values of the array");

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
      for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
               if(max <arr[i][j])
               {
                  max = arr[i][j];
               }

               if(min > arr[i][j])
               {
                 min = arr[i][j];
               }
               System.out.print( arr[i][j]+" ");
            }

            System.out.println();
        }
    System.out.println("the maximum number in the matrix is"+ max);
    
    System.out.println("the min value in matrix is"+min);
    }


    
    
}
