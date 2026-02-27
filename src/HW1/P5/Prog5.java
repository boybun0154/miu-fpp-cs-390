package HW1.P5;

public class Prog5 {
    public static void main(String[] args) {
        int[] nums = {1,0,3,4,5};
        secondMin(nums);
    }

    public static void secondMin(int[] arrayOfInts) {
        int min = arrayOfInts[0], min2 = arrayOfInts[1];
        for (int num : arrayOfInts) {
            if (num <= min2) {
                if (num < min) {
                    min2 = min;
                    min = num;
                } else if (num != min) {
                    min2 = num;
                }
            }
        }
        IO.println("2nd min: " + min2);
    }
}
