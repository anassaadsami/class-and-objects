package classAndObject;

public class Teachers {
	private String name;
	private int age;
	static int num= 1;
	private static String school = "baghdad";
	
	public Teachers(String name , int age) { 
		setName(name);
		setAge(age);
		
		System.out.println(getName()+getNum()+"teacher.");
//		System.out.println("object no:"+getNum());
		
		
		
	
	}
	public int getNum() {
	return num++;
	}


//	public void setNum(int num) {
//		Teachers.num = num;    // we can not use this in static method so we use class name with static variable
//	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length()>= 4) {
//		char ch = Character.toUpperCase(name.charAt(0));
//		name.charAt(0)= ch ;
		this.name = name;
		}
		else
			System.out.println("try to enter the right name");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>40)
			this.age = age;
		else
		System.out.println("the age is under law");
	}

	@Override
	public String toString() {
		return "Teachers [name=" + name + ", age=" + age + "]";
	}
	public static String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		Teachers.school = school;     // we can not use this in static method so we use class name with static variable
	}
	
	
}
