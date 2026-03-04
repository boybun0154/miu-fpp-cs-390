package HW5.b;

import HW5.a.DeptComparator;

import java.util.Arrays;
import java.util.Comparator;

public class DeptTest {
    static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();
        DeptTest test = new DeptTest();
        System.out.println("Before sort: "+Arrays.toString(data));
        Arrays.sort(data, test.new DeptComp());
        System.out.println("After sort: "+Arrays.toString(data));
    }

    private class DeptComp implements Comparator<DeptEmployee> {
        @Override
        public int compare(DeptEmployee o1, DeptEmployee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    private DeptComp getDeptComp() {
        return new DeptComp();
    }
}
