package HW5.e;

import java.util.Arrays;
import java.util.Comparator;

public class DeptTest {
    static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();
        System.out.println("Before sort: "+Arrays.toString(data));
        Arrays.sort(data, (o1, o2) -> {return o1.getHireDate().compareTo(o2.getHireDate());});
        System.out.println("After sort: "+Arrays.toString(data));
    }

}
