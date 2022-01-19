package javaTraining001;

public class patterntest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 5;
		int i,j;
		
		//Normal Triangle
//		for (i=0;i<=input;i++) {
//			for (j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//Descending Number in each line
//		for (i=0;i<=input;i++) {
//			for (j=input;j>=i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//Same Spaces
//		for (i=0;i<=input;i++) {
//			for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line
//				System.out.print(" ");
//			}	
//			System.out.println();
//		}
		
		
		// Layer 1
		for (i=1;i<input;i++) { // This part controls no. of rows
			
			for (j=input;j>i;j--) {   //Print Spaces with Descending Amounts in each Line Controls no. in each column
				System.out.print(" ");
			}
			
			for (j=0;j<i;j++) {       //Print Stars with Ascending Amounts in each Line
				System.out.print("*");
			}
			
			for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line
				System.out.print(" ");
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
		
		//Layer 2	
		for (i=1;i<input;i++) {
			
			for (j=input;j>i;j--) {   //Print Stars with Descending Amounts in each Line
				System.out.print("*");
			}
			
			for (j=0;j<i;j++) {       //Print Spaces with Ascending Amounts in each Line
				System.out.print(" ");
			}
			
			for (j=0;j<input;j++) {   //Print Stars with Same Amounts in each Line
				System.out.print("*");
			}
			
			for (j=0;j<input;j++) {   //Print Stars with Same Amounts in each Line
				System.out.print("*");
			}
			
			for (j=0;j<i;j++) {      //Print Spaces with Descending Amounts in each Line
				System.out.print(" ");
			}
			
			for (j=input;j>i;j--) {   //Print Stars with Descending Amounts in each Line
				System.out.print("*");
			}
		
			System.out.println();
		}
		
		
		//Layer 3
		for (i=1;i<input;i++) {
			for (j=0;j<i;j++) {       //Print Stars with Ascending Amounts in each Line
				System.out.print("*");
			}
			
			for (j=input;j>i;j--) {   //Print Spaces with Descending Amounts in each Line
				System.out.print(" ");
			}
			
			for (j=0;j<i;j++) {      //Print Spaces with Descending Amounts in each Line
				System.out.print(" ");
			}
			
			for (j=input;j>i;j--) {   //Print Stars with Descending Amounts in each Line
				System.out.print("*");
			}
			
			for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line
				System.out.print(" ");
			}
			
			for (j=input;j>i;j--) {   //Print Spaces with Descending Amounts in each Line
				System.out.print(" ");
			}
			
			for (j=0;j<i;j++) {       //Print Stars with Ascending Amounts in each Line
				System.out.print("*");
			}
		
			System.out.println();
		}
		
		
		//Layer 4
		for (i=1;i<input;i++) { 
			for (j=0;j<input;j++) {   //Print Stars with Same Amounts in each Line
				System.out.print("*");
			}
			
			for (j=0;j<i;j++) {       //Print Stars with Ascending Amounts in each Line
				System.out.print("*");
			}
			
			for (j=input;j>i;j--) {   //Print Spaces with Descending Amounts in each Line
				System.out.print(" ");
			}
			
			for (j=input;j>i;j--) {   //Print Spaces with Descending Amounts in each Line
				System.out.print(" ");
			}
			
			for (j=0;j<i;j++) {       //Print Stars with Ascending Amounts in each Line
				System.out.print("*");
			}
			
			for (j=0;j<input;j++) {   //Print Stars with Same Amounts in each Line
				System.out.print("*");
			}
			

		
			System.out.println();
		}
	

	}

}
