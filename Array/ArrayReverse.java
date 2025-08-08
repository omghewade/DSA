
package Array;

public class ArrayReverse {

    public static void ArrayReversee(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;

        }

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };

        ArrayReversee(arr);
    }
}