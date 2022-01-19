package javaTraining001;

public class whileLoop {
	public static void main(String args[])
	{
		//Initialize values
		String a = "";
		int i = 1;
		
		//While i is less than 101
		while (i <= 100) {
			
			// append String a with String *
			a = a + "*";
			
			//println() = print and go to next line
			//print() = print and stay in same line
			System.out.println(i + a);
			
			// add 
			if (i == 100) {
				i=0;
				break;
			} else {
				i++;
			}
		}	
		
		System.out.println(i);
		
		for (int i1 = 0; i1<=100; i1++) {
			System.out.print("*");
		}
		
		for (int i2 = 0; i2<=20; i2++) {
			
			for (int j = 0; j<5; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
		
	}

}
