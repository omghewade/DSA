package Array;

public class LargeAndSmall {
    
 static  int Smallest = Integer.MAX_VALUE;
  static int largest = Integer.MIN_VALUE;

  public static void findInArray(int arr[])
  {
      for(int i =0; i< arr.length;i++)
      {
        if(arr[i] > largest)
          {
              largest = arr[i];
          }

        if (Smallest > arr[i])
        {

            Smallest = arr[i];
        }
        
        }
          System.out.println("the smallest element in array"+Smallest+"\n the largest element in array is"+largest);

    }


    public static void main(String[] args) {
        int arr []={11,22,33,43,52,3,1,0,1};
        
        findInArray(arr);
    }
}
