package patterns;

public class S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter the no.: ");
//		int input = sc.nextInt();
		int input = 10;
		
//		System.out.println("Enter the char.: ");
//		String alpha = sc.next();
		int i,j;
		
		//S
		for (i=0;i<input;i++) {
			for (j=0;j<input;j++) {   //Print Spaces with Same Amounts in each Line Hollow
				
				if(i==0 && j!=0 && j!=input-1 || i==input/2-1 && j!=0 && j!=input-1 || i==input-1 && j!=0 && j!=input-1 || j==0 && i!=0 && i!=input-1 && i<input/2-1 || j==input-1 && i!=0 && i!=input-1 && i>input/2-1) {
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
