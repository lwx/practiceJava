package javaTraining001;

class Tester{
	
//	Default constructor is a zero parameter provided by compiler whenever constructor is not inittialised
//	Super method calls parent class contructor (Contructor of Object called)
//	
//	class Tester extends Object
//	
//	Tester(){
//	super();
//	}
	
	
	public Tester(int i) {
		// TODO Auto-generated constructor stub
	}

	void fun()
	{
		System.out.println("I'm the fun method.");
	}
}

public class Test002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tester t01 = new Tester(20);
		t01.fun();

	}

}
