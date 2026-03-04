package HW5.a;

import java.util.Arrays;

public class DeptTest {
    static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();
        System.out.println("Before sort: "+Arrays.toString(data));
        Arrays.sort(data, new DeptComparator());
        System.out.println("After sort: "+Arrays.toString(data));
    }
}
