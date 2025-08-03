package Array;

public class linearSearch {


    public static int linearSearchh(int arr[],int key)
    {
         for(int i=0; i<=arr.length;i++)
         {
             if (arr[i] == key)
             {
                return i;
             }
         }


        return -1;
    }
    public static void main(String[] args) {

        int key = 54;

        int arr [] = {10,20,30,40,44,54,11};
       int index = linearSearchh(arr,key);

       if(index == -1)
       {
           System.err.println("element not found");
    }
    
    else
    {
           System.out.println("the index of the element is "+index);
       }
    }
}
