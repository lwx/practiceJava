package javaTraining001;

public class hollowsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 21;
		int i,j;
		
//		//Hollow Square
//		for (i=0;i<input;i++) {
//				for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line Hollow
//					
//					if(i==0 || i==input-1 || j ==0 || j==input-1) {
//						System.out.print("*");
//					}
//					else {
//						System.out.print(" ");
//					}
//                 
//			}	
//			System.out.println();
//		}
		
//		//Hollow Square Diagonal
//		for (i=0;i<input;i++) {
//				for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line Hollow
//					
//					if(i==0 || i==input-1 || j ==0 || j==input-1 || i==j) {
//						System.out.print("*");
//					}
//					else {
//						System.out.print(" ");
//					}
//
//			}	
//			System.out.println();
//		}
		
//		//Hollow Square Cross
//		for (i=0;i<input;i++) {
//				for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line Hollow
//					
//					if(i==0 || i==input-1 || j ==0 || j==input-1 || i==j || i+j==input-1) {
//						System.out.print("*");
//					}
//					else {
//						System.out.print(" ");
//					}
//
//			}	
//			System.out.println();
//		}
		
		//Hollow Square Cross Middle Straight
		for (i=0;i<input;i++) {
				for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line Hollow
					
					if(i==0 || j==input/2 || i==input-1 || j ==0 || j==input-1 || i==j || i+j==input-1 || i==input/2 || i+j==input/2 || j-i==input/2 || i-j==input/2|| i+j==input*3/2-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}

			}	
			System.out.println();
		}
		
//		//Hollow Square Top Left Diagonal
//		for (i=0;i<input;i++) {     
//				for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line Hollow
//					
//					if(i==0 || i==input-1 || j ==0 || j==input-1 || i+j==input/2) { //Last Condition indicates the Diagonal Top Left - the sum of the Row and Col is the same                              
//						System.out.print("*");
//					}
//					else {
//						System.out.print(" ");
//					}
//                 
//			}	
//			System.out.println();
//		}
		
//		//Hollow Square Top Right Diagonal
//		for (i=0;i<input;i++) {     
//				for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line Hollow
//					
//					if(i==0 || i==input-1 || j ==0 || j==input-1 || j-i==input/2) { //Last Condition indicator the Diagonal Top Right - the Difference of Col - Row is the same                              
//						System.out.print("*");
//					}
//					else {
//						System.out.print(" ");
//					}
//                 
//			}	
//			System.out.println();
//		}
		
//		//Hollow Square Bottom Right Diagonal
//		for (i=0;i<input;i++) {     
//				for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line Hollow
//					
//					if(i+j==input/2+input-1) {   //Last Condition indicator the Diagonal Bottom Right - the sum of the row and col is the same                                     
//						System.out.print("*");
//					}
//					else {
//						System.out.print(" ");
//					}
//                 
//			}	
//			System.out.println();
//		}
//		
//		//Bottom Left Diagonal
//		for (i=0;i<input;i++) {     
//				for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line Hollow
//					
//					if(i-j==input/2) {   //Last Condition indicator the Diagonal Bottom Right - the difference of the row and col is the same                                     
//						System.out.print("*");
//					}
//					else {
//						System.out.print(" ");
//					}
//                 
//			}	
//			System.out.println();
//		}
		
//		//Diamond
//		for (i=0;i<input;i++) {     
//				for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line Hollow
//					
//					if(i+j==input/2-1 || j-i==input/2 || i-j==input/2|| i+j==input*3/2-1) {   //Last Condition indicator the Diagonal Bottom Right - the sum of the row and col is the same                                     
//						System.out.print("*");
//					}
//					else {
//						System.out.print(" ");
//					}
//                 
//			}	
//			System.out.println();
//		}

//		//Hollow Top Left Triangle
//		for (i=0;i<input;i++) { // This part controls no. of rows 
//			
//			for (j=input;j>i;j--) {   //Print Spaces with Descending Amounts in each Line Controls no. in each column
//				if(i==0 || j==input || i==j-1) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			
//			for (j=0;j<i;j++) {       //Print Stars with Ascending Amounts in each Line
//				System.out.print(" ");
//			}
//
//			System.out.println();
//		}
		
	
//		//Hollow Top Right Triangle
//		for (i=0;i<input;i++) { // This part controls no. of rows 
//			
//			for (j=0;j<i;j++) {       //Print Stars with Ascending Amounts in each Line
//				System.out.print(" ");
//			}
//
//			for (j=input;j>i;j--) {   //Print Spaces with Descending Amounts in each Line Controls no. in each column
//				if(i==0 || j==input || i==j-1) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			
//
//			System.out.println();
//		}
		
//		//Hollow Bottom Left Triangle
//		for (i=0;i<input;i++) { 
//			
//			for (j=0;j<=i;j++) {       //Print Stars with Ascending Amounts in each Line
//				if(i==input-1 || j==0 || i==j) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			
//			for (j=input-1;j>i;j--) {   //Print Spaces with Descending Amounts in each Line
//				System.out.print(" ");
//			}
//			
//			System.out.println();
//		}
		
//		//Hollow Bottom Right Triangle
//		for (i=0;i<input;i++) { 
//			
//			for (j=input-1;j>i;j--) {   //Print Spaces with Descending Amounts in each Line
//				System.out.print(" ");
//			}
//			
//			for (j=0;j<=i;j++) {       //Print Stars with Ascending Amounts in each Line
//				if(i==input-1 || j==0 || i==j) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			
//			System.out.println();
//		}

	}

}
