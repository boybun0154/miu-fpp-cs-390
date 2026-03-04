package HW5.c;

import java.util.Arrays;
import java.util.Comparator;

public class DeptTest {
    static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();
        System.out.println("Before sort: "+Arrays.toString(data));
        class MyInnerSort implements Comparator<DeptEmployee>{
            @Override
            public int compare(DeptEmployee o1, DeptEmployee o2) {
                return Double.compare(o2.getSalary(), o1.getSalary());
            }
        }
        Arrays.sort(data, new MyInnerSort());
        System.out.println("After sort: "+Arrays.toString(data));
    }

}
