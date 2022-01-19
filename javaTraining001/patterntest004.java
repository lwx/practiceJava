package javaTraining001;

import java.util.Scanner;

public class patterntest004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.: ");
		int input = sc.nextInt();
		int i,j;
		
//		//Top Left L, Bottom Right L 
//		for (i=0;i<input;i++) {
//				for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line Hollow
//					
//					if(i==0 && j<input/2 || i==input-1 && j>input/2 || j==0 && i<input/2 || j==input-1 && i>input/2) {
//						System.out.print("*");
//					}
//					else {
//						System.out.print(" ");
//					}
//
//			}	
//			System.out.println();
//		}
		
//		//Top Right L , Bottom Left L
//		for (i=0;i<input;i++) {
//			for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line Hollow
//				
//				if(i==0 && j>input/2 || i==input-1 && j<input/2 || j==0 && i>input/2 || j==input-1 && i<input/2) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//
//		}	
//		System.out.println();
//	}
		// Box
//		for (i=0;i<input;i++) {
//			for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line Hollow
//				
//				if(j==0 && i>input/2 || j==input-1 && i>input/2 || i == input/2) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//
//		}	
//		System.out.println();
//	}
		
		for (i=0;i<input;i++) {
			for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line Hollow
				
				if(j==0 && i>input/2 || j==input-1 && i>input/2 || i == input/2 || i+j==input/2 -1 || j-i==input/2) {
					System.out.print("*");
					}
				else {
					System.out.print(" ");
					}

				}	
			System.out.println();
			}

	}

}
