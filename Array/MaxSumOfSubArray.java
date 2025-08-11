package Array;

public class MaxSumOfSubArray {


public static  void  maxOfSubArray(int arr[])
{   
    int maxx = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++)
    {       int sum =0;

        for(int j=i;j<arr.length;j++)
        {
            for(int k=i;k<j;k++)
            {
                sum = sum + k;
            }
            System.out.println(sum);
            if(maxx<sum)
            {
                maxx = sum;
            }
               
        }
    }

     System.out.println("the maximum of sub arrAY IS"+ maxx);
            
}
    
    public static void main(String[] args) {

        int arr[] = {-2,10,22,44,-5,-7};

        maxOfSubArray(arr);
        
    }
    
}
