package basics;
class Car {
	String model;//properties
	int year;
	
	Car(String model, int year){//constructor
		this.model = model;
		this.year = year;
	}
	
	void display() {
		System.out.println(model + " " + year);
	}
}
public class Geeks {
	public static void main(String[] args) {
		Car reference = new Car("Toyota",2020); //object creation
		reference.display();
		System.out.println(reference.year);
	}

}
