package Array;

import java.util.*;

public class BinarySearch {

    public static void searchElement(int arr[], int element) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == element) {
                System.out.println("element found at index" + mid);
                return;
            }

            if (arr[mid] < element) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        System.out.println("element not found");

    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 5, 6, 8, 10, 24, 33, 56 };

        // Scanner sc = new Scanner(System.in);

        // System.out.println("enter the element to search in the array");
        // int a = sc.nextInt();
        searchElement(arr, 10);

    }
}
