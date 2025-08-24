package Sorting;

public class insersionSort {

    public static void sort(int arr[]) {

        for (int i = 1; i <= arr.length - 1; i++) {
            int current = arr[i];
            int previous = i - 1;

            while (previous >= 0 && arr[previous] > current) {

                arr[previous + 1] = arr[previous];
                previous--;

            }

            arr[previous + 1] = current;
        }

    }

    public static void main(String[] args) {

        int arr[] = { 4, 8, 5, 3, 9, 1 };
        sort(arr);

        for (int num : arr) {
            System.out.print(" " + num);
        }

    }

}
