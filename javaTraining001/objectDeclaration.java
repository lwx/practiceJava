/**
 * 
 */
package javaTraining001;

/**
 * @author enigm
 *
 */

class TestMain{
	//	declared inside a class - Instance Variables/Object Data
	// instance var initialized and declared inside  class
	
	
	//default value int a = 0, char b = 0"", float c = 0.0, boolean d = false 
	int a;
	char b;
	// float declaration needs f at the end of no. eg. 0.55f. double is normal decimal.
	float c;
	boolean d;
	
	// declared inside a method - Local Variable declared inside a method- applies only in methods and cannot be used outside it. 
	void test01(){
		int e=1;
		char f;
		float c;
		boolean h;
		
		// variable e not initialized
		//System.out.println(e);
	}
}


public class objectDeclaration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// use new keyword to create a new instance of a class
		// Memory is allocated to the new object on creation
		
		// new object t01 will be created with a pointer to the memory allocated for it's instance variable
		TestMain testOne = new TestMain();
		TestMain testTwo = new TestMain();
		
		//Instance var can be accessed from a class
		System.out.println(testOne.a);
		

	}

}
