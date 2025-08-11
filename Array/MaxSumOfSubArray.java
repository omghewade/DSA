package Array;

public class MaxSumOfSubArray {

    public static void maxOfSubArray(int arr[]) {
        int maxx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                System.out.println(sum);
                if (maxx < sum) {
                    maxx = sum;
                }

            }
        }

        System.out.println("the maximum of sub arrAY IS" + maxx);

    }

    public static void main(String[] args) {

        int arr[] = { 1, -2, 6, -1, 3 };

        maxOfSubArray(arr);

    }

}
