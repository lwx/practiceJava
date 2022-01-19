package patterns;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter the no.: ");
//		int input = sc.nextInt();
		int input = 10;
		
//		System.out.println("Enter the char.: ");
//		String alpha = sc.next();
		int i,j;
		
		//B
		for (i=0;i<input;i++) {
			for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line Hollow
				
				if(j==0 || j==input-1 && i>input/2-1 && i != input-1|| i == input/2-1 && j!=input-1|| i==input-1 && j !=input-1 || i==0 && j<input*3/4 || i!=0 && j==input*3/4 && i<input/2) {
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
