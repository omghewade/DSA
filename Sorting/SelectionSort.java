package Sorting;

public class SelectionSort {

    public static void sort(int arr[])
    {
          int min =0;
          for(int i=0; i<arr.length-1;i++)
          {
             min =i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                
                }
            }

            // swap now
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
          }

    }
    
    public static void main(String[] args) {
        
        int arr[]={5,4,3,2,1};

        sort(arr);
        for (int num : arr)
        {
            System.out.println("  "+num);
        }

    }
    
}
