package classAndObject;

public class Person {
	
 String name ;
 int age ;
 String address;
 static String company="baghdad";
  
 public Person (String name , int age) {
	this. name = name ;
	this. age = age ;
 }
 public Person (String name , int age, String address) {
		this( name, age);
		this.address = address;
	 }
 public Person(Person obj) {
//	 name = obj.name;
//	 age  = obj.age;
//	 company= obj.company;
	 this(obj.name , obj.age , obj.address);

}
 public Person(String name , int age, String address,String company) {
	 this(name , age , address); 
	 Person.company = company ;
 }
public static String getCompany() {
	return company;
}
public static void setCompany(String company) {

	Person.company = company;     // we can use the className.variable name here cause company is static , we can not use this here

}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	
}
public static void display() {
	
	Person p = new Person("teim",20);     // can we create an object outside the main method ???
	if(p.age< 40)
	System.out.println("hi "+p.name+" your age is "+p.age+ " your co name is: "+company);      // we can use access the non static variable by create an object
}
public void display1() {
		System.out.println("hi "+this.name+" your age is "+this.age+ " your co name is: "+company);     
}





}