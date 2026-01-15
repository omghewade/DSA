public class pair {

    public static void pair(int arr[]) {

          int tp=0 ;
        

        for( int i=0; i < arr.length-1;i++)
        {

            for(int j=i+1; j < arr.length; j++)
            {
                System.out.print("(" + arr[i] +"+"+ arr[j] +")");

                tp ++;
            }

            System.err.println();
        }


        System.out.println(tp);
        
    }


    public static void main(String[] args) {
        

        int arr[]= {1,2,3,4,5,6,7};

        pair(arr);

    }
    
}
