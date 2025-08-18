package Sorting;

public class Bubble_Sort {


    public static void sort(int arr[])
    {
       int temp;
       for (int turn = 0;turn<arr.length-1;turn++)
       {
        for (int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
               temp = arr[i+1];
               arr[i+1]=arr[i];
               arr[i]=temp;
            }
        }
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {22,5,33,2,11,3};

        sort(arr);

        for(int num : arr)
        {
            System.out.print(" "+num);
        }
    }
    
}
