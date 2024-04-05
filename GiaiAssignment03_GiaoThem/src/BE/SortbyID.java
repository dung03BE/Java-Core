package BE;

import java.util.Comparator;

public class SortbyID implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getMaNV()-o2.getMaNV();
	}
	
}
