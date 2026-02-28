package HW3.P2;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        int[] input = {1, 3, 5, 7, 9, 13}; //TODO: do a readln() for this
        int[] reversed = reverse(input);
        System.out.println(Arrays.toString(reversed));
        int[] input2 = {1, 3, 5, 60, 7, 9, 13}; //have a middle (median?) element
        int[] reversed2 = reverse(input2);
        System.out.println(Arrays.toString(reversed2));
    }

    static int[] reverse(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Input array is null or empty");
        return reverse(arr, 0, arr.length - 1);
    }

    static int[] reverse(int[] arr, int start, int end) {
        if (start >= end)
            return arr;
        else {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            return reverse(arr, start + 1, end - 1);
        }
    }
}
