package Array;

public class prefixSubArraySum {

    

    public static void findSubArrayMax (int arr[])
    {
          int max[]=new int[arr.length]; // use to store the sum of sub array
          int maxx = Integer.MIN_VALUE;
          int current = 0;

          max[0]=arr[0];
          for(int i=1;i<max.length;i++)
          {
              max[i]= max[i-1]+arr[i]; 
          }


          for (int i=0;i<arr.length;i++)
          {
            int start = i;
            for(int j=i;j<arr.length;j++)
            {
                  int end = j;
                  current = start==0 ? max[end] : max[end] - max[start-1];
                  if(maxx<current)
                  {
                    maxx = current;
                  }
            }
             
          }
         System.out.println("the max output is "+maxx);

    }
    
    public static void main (String [] args)
    {

        int arr[] = {1,-2,6,-1,3};
        findSubArrayMax(arr);  
     
    }
}
