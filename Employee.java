package classAndObject;

public class Employee {
	String nameEmployee;
	static int no_Employee;
	
	public Employee(String nameEmployee) {
	//	this.nameEmployee= nameEmployee;  // if we code like this so we dont need
						// setnameEmployee 
		setnameEmployee(nameEmployee);    // we can code without this
		Employee.no_Employee++;	
	}

	public String getnameEmployee() {
		return nameEmployee;
	}

	public void setnameEmployee(String nameEmployee) {
		if(nameEmployee.length() >= 4) {
		this.nameEmployee = nameEmployee;
		System.out.println("Employee no: "+(no_Employee+1));  
		}else 
			System.out.println("invalid data");
	}
	public static void display() {
		System.out.println("you have "+no_Employee+" friends.");  // or without class name
	}
	public static int getNo_Employee() {
		
		return Employee.no_Employee;
	}
	

}
