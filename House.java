package classAndObject;

public class House {
	static String area="sollentuna";
	int house_no ;
	
	
	public House(int house_no) {   // if we don't have constructor so we can not 
		this.house_no= house_no;   // create an object down 
	}
	
	static {    // static block which execute before constructor
		House h1 = new House(40);
		System.out.println(h1.house_no);    // in static method or block we can use non_static variables 
		System.out.println("hi from "+area); // by create an object 
	}
	
	
	
	public void print() { // this is the only way to access non_static variable 
//		House h1 = new House(40);		//in static method
		System.out.println("your house no is "+ this.house_no + "in the "+ area);
		// house_no variable is instance variable so we must create an object to reach it 
	}
	public void display(String area) {
		House.area = area;       // because the area is static so we can code without this or by className.variableName
//		House.area = area ;
		System.out.println("this is from "+ House.area );   // in non_static method we can use static variables
	}														// by the name of class (House.area)

	@Override
	public String toString() {
		return "House [house_no=" + house_no + "]";
	}
}
