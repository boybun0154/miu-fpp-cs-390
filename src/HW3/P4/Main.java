package HW3.P4;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        int[] input = {5, -3, 6, 1, 9, 4 }; //could've used scanner but too lazy ~~
        maxNum(input);
    }

    static void maxNum(int[] arr) {
        if (arr == null || arr.length == 0) return;
        maxNum(arr,arr[0]);
    }

    static void maxNum(int[] arr, int max) {
        if (arr.length == 0) {
            System.out.println("Max num: "+max);
        } else maxNum(Arrays.copyOfRange(arr, 1, arr.length), Math.max(arr[0], max));
    }
}
