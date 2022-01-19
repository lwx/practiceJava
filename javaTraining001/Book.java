package javaTraining001;


class Page{
	private int pgNo;
	
	// Constructor are used to initialize object values. 
	
	Page (int pgNo) {
		
		
		if(pgNo>0) {
			this.pgNo = pgNo; //shadowing problem in java
			
			//this keyword is always used with instanced variable
		}else {
			System.out.println("Page No. cannot be negative.");
			System.exit(0);
		}
		
		System.out.println("Page No. set to " + pgNo);
	}
	
	int getPage(){
		return pgNo;
	}
	
//	Common practice uses the local var with the same name as the instanced var, so we 
//	place a this.instanced var to differentiate the var
	
	// Special Setter Method - Constructor 
	// Same name as the Class, no prefix
	void setPage (int pgNo) {
		
		
		if(pgNo>0) {
			this.pgNo = pgNo; //shadowing problem in java
			
			//this keyword is always used with instanced variable
		}else {
			System.out.println("Page No. cannot be negative.");
			System.exit(0);
		}
		
		System.out.println("Page No. set to " + pgNo);
	}
}

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Calling Constructor, by making a contructor method in the Page class, it makes var inpot required.
		// Required for creation of an object
		Page pg = new Page(100);
		
		pg.setPage(-100);
		int page = pg.getPage();
		System.out.println(page);

	}

}
