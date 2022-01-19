package javaTraining001;

public class patterntest002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 5;
		int i,j;
		
		//Every Block has a j loop with i loop nested within 
		
		// Block 1
		for (i=1;i<input;i++) {
			
			for (j=input;j>i;j--) {   //Print Spaces with Descending Amounts in each Line
				System.out.print(" ");
				}
			
			for (j=0;j<i;j++) {       //Print Stars with Ascending Amounts in each Line
				System.out.print("*");
				}
			
			for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line
				System.out.print(" ");
				}
			

			
			for (j=0;j<i;j++) {      //Print Stars with Descending Amounts in each Line
				System.out.print("*");
				}
			
			for (j=input;j>i;j--) {   //Print Spaces with Descending Amounts in each Line
				System.out.print(" ");
				}
		
			System.out.println();
		}
		
		//Block 2
		for (i=0;i<input;i++) {
			for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line
				System.out.print(" ");
			}	
			
			for (j=0;j<input;j++) {   //Print Stars with Same Amounts in each Line
				System.out.print("*");
			}
			
			for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line
				System.out.print(" ");
			}
			
			System.out.println();
			
			
		}
		
		// Block 3
		for (i=1;i<input;i++) {
			
			for (j=0;j<i;j++) {       //Print Stars with Ascending Amounts in each Line
				System.out.print(" ");
				}
			for (j=input;j>i;j--) {   //Print Spaces with Descending Amounts in each Line
				System.out.print("*");
				}
			
			for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line
				System.out.print(" ");
				}
			
			for (j=input;j>i;j--) {   //Print Spaces with Descending Amounts in each Line
				System.out.print("*");
				}
			
			for (j=0;j<i;j++) {      //Print Stars with Descending Amounts in each Line
				System.out.print(" ");
				}
			System.out.println();
		}

	}

}
