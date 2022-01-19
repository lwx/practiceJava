package javaTraining001;

import java.util.Scanner;

public class hollowpattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.: ");
		int input = sc.nextInt();
		int i,j;
		
		//Block 1
		for (i=0;i<input;i++) { 
			
			for (j=input-1;j>i;j--) {   //Print Spaces with Descending Amounts in each Line
				System.out.print(" ");
			}
			
			for (j=0;j<=i;j++) {       //Print Stars with Ascending Amounts in each Line
				if(i==input-1 || j==0 || i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line
				System.out.print(" ");
				}
			
			for (j=0;j<=i;j++) {       //Print Stars with Ascending Amounts in each Line
				if(i==input-1 || j==0 || i==j) {
					System.out.print("*");
				}
			else {
				System.out.print(" ");
				}
			}
		
			for (j=input-1;j>i;j--) {   //Print Spaces with Descending Amounts in each Line
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		//Block 2
		for (i=0;i<input;i++) { 
				
			for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line
				System.out.print(" ");
				}
			
			for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line Hollow
				
				if(i==0 || i==input-1 || j ==0 || j==input-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		//Block 3
		for (i=0;i<input;i++) { 
			
			for (j=0;j<i;j++) {       //Print Stars with Ascending Amounts in each Line
			System.out.print(" ");
		}

		for (j=input;j>i;j--) {   //Print Spaces with Descending Amounts in each Line Controls no. in each column
			if(i==0 || j==input || i==j-1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
			
			for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line
				System.out.print(" ");
				}
			
			for (j=input;j>i;j--) {   //Print Spaces with Descending Amounts in each Line Controls no. in each column
			if(i==0 || j==input || i==j-1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		
		for (j=0;j<i;j++) {       //Print Stars with Ascending Amounts in each Line
			System.out.print(" ");
		}
			
			System.out.println();
		}
		


	}

}
