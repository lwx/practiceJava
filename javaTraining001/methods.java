/**
 * 
 */
package javaTraining001;

/**
 * @author enigm
 *
 */

class MethodMain{
	int a,b;
	
	void noInputNoOutput() {
		a=3; 
		b=4;
		int c=a+b;
		System.out.println(c);
	}
	
	int noInputWithOutput() {
		a=20;
		b=4;
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
	void withInputNoOutput(int a,int b) {
		int c = a-b;
		System.out.println(c);
	}
	
	int withInputWithOutput(int a,int b) {
		int c = a*b;
		System.out.println(c);
		return c;
	}
}
public class methods {

	/**
	 * @param args                                                               
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodMain method = new MethodMain();
		
		method.noInputNoOutput();
		
		method.noInputWithOutput();
		
		method.withInputNoOutput(5, 6);
		method.withInputWithOutput(2, 9);
		System.out.println();
		
		method.withInputNoOutput(method.noInputWithOutput(), method.withInputWithOutput(method.noInputWithOutput(), method.noInputWithOutput()));
		

	}

}
