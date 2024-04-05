package Ass1;

public class Department {
	int departmentID;
	String departmentName;
	@Override
	public String toString() {
		return "\n Department [departmentID=" + departmentID + ", departmentName=" + departmentName + "]";
	}
	public Department(int departmentID, String departmentName) {
		
		this.departmentID = departmentID;
		this.departmentName = departmentName;
	}
	public Department() {
		
	}
}

