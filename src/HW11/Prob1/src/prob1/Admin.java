package HW11.Prob1.src.prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		if (students==null|| students.isEmpty()) return new HashMap<>();
		else {
			HashMap<Key, Student> map = new HashMap<>();
			students.forEach(student -> {
				Key key = new Key(student.getFirstName(), student.getLastName());
				map.put(key, student);
			});
			return map;
		}
	}
}
