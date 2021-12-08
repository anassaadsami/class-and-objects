package classAndObject;

public class Car implements Comparable<Car> {
	String name;
	private int model = 1990;
	private boolean auto ;
	
	public Car(String name , int model , boolean auto) {
		setName(name);
		setModel(model);
		this.auto = auto;
	}
	
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		if (model>2000)
		this.model = model;
		else 
			System.out.println("dont accept it ");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()>=4) 
			this.name = name.toUpperCase();
		else
			System.out.println("invalid name");
	}
	
	public void displayInfo() {
		System.out.printf("hi %s,the model is %d and its %b\n",this.name,this.model,this.auto);
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", auto=" + auto + "]";
	}

	public int compareTo(Car c) {
//		if(this.name == c.name && this.auto == c.auto && this.model == c.model) 
//			return 0;
		 if (this.name != c.name || ((Car)this).auto != c.auto || ((Car)this).model != c.model)
			return 1 ;
		 else
		 return 0;
	}

	
	

}
