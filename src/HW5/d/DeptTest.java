package HW5.d;

import java.util.Arrays;
import java.util.Comparator;

public class DeptTest {
    static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();
        System.out.println("Before sort: "+Arrays.toString(data));
        Arrays.sort(data, new Comparator<DeptEmployee>() {
            @Override
            public int compare(DeptEmployee o1, DeptEmployee o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        System.out.println("After sort: "+Arrays.toString(data));
    }

}
