package javaTraining001;

class Test{
	
	// has a return value
	int demo() {
		return 1;
	}
}

class Dog{
//	Datatype
	String name;
	String breed;
	int cost;
	
//	Methods
//	void prefix for methods with no Return
	void display() {
		System.out.println(name);		
		System.out.println(breed);		
		System.out.println(cost);			

	}
	
	void eat(){
		System.out.println("Dog is eating.");		
	}
	
	void sleep(){
		System.out.println("Dog is sleeping.");
	}
	
	void bark(){
		System.out.println("Dog is barking.");
	}
	
	void play(){
		System.out.println("Dog is playing.");
	}

}


public class labradour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize d as a new Dog Class
		Dog d = new Dog();
		
		//Assign Data into Dog d
		d.name = "Brownie";
		d.breed = "Labradour";
		d.cost = 100;
		
		// Run Method
		d.sleep();
		d.eat();
		d.bark();
		d.play();
		d.display();
		
	}

}
