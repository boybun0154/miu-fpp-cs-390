package HW3.P2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main main;

    @Test
    void reverse() {
        int[] input = {1, 3, 5, 7, 9, 13};
        assertArrayEquals(new int[]{13, 9, 7, 5, 3, 1},Main.reverse(input));
    }

    @Test
    void testReverse() {
        int[] input2 = {1, 3, 5, 60, 7, 9, 13};
        assertArrayEquals(new int[]{13, 9, 7, 60, 5, 3, 1},Main.reverse(input2));
    }
}