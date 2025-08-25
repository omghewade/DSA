package Array;
import java.util.Arrays;

import java.util.Collections;

public class inbuiltFunction {


    public static void main(String[] args) {
        
        Integer arr[] = {5,7,3,9,2,22};
        Arrays.sort(arr, 0, 4, Collections.reverseOrder());

        for(int num : arr)
        {
            System.out.print(" "+num);
        }    
    }
    
}
