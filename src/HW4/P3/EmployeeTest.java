package HW4.P3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
    static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new SalariedEmployee("John","Snow","123456",100),
                new HourlyEmployee("Grey","Rat","234567",20,40),
                new CommissionEmployee("Jane","Doe","345678",50,0.3),
                new BasePlusCommisionEmployee("Pikachu","Elik","456789",60,0.1,65),
                new SalariedEmployee("Clark","Ken","567890",200),
        };
        System.out.println(Arrays.toString(findSalaryList(employees,300)));
    }

    public static Employee[] findSalaryList (Employee[] col, double salary) {
        if(col==null||col.length==0) return new Employee[0];
        List<Employee> list = new ArrayList<Employee>();
        for (Employee employee : col) {
            if (employee==null) continue;
            if (employee.getPayment() < salary) {
                list.add(employee);
            }
        }
        return list.toArray(new Employee[list.size()]);
    }
}
