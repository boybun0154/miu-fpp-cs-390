package HW11.Prob2.prob2;

import java.util.*;

public class EmployeeAdmin {
	
	/**
		
	Your method prepareReport should return a list of all Employees in the input table 
	whose social security number is in the input list socSecNums and whose salary is greater than $80,000. 
	In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		if (table==null||table.isEmpty()||socSecNums==null||socSecNums.isEmpty())
			return new ArrayList<>();
		List<Employee> employees = new ArrayList<>();
		socSecNums.forEach(socSec->{
			if (table.containsKey(socSec) && table.get(socSec)!=null
					&& table.get(socSec).getSalary()>80000)
				employees.add(table.get(socSec));
		});
		Collections.sort(employees, Comparator.comparing(Employee::getSsn));
		return employees;
	}
	
}
