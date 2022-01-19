package javaTraining001;

class Id {
	int id = 1234;
//	private String userName = "ID";
	String userName = "ID";
	
	void disp() {
		System.out.println(userName);
		
		
	}
}

class Access {
	
	Id a = new Id();
	
	void accessDetails() {
		
		System.out.println(a.id);
		System.out.println(a.userName);
	}
	
	void changeDetails(){
		System.out.println("Changing Details");
		a.id = 321;
		a.userName = "Mine";	
		System.out.println(a.id);
		System.out.println(a.userName);
	}
}

public class encapsulation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Access acc = new Access();
		acc.accessDetails();
		System.out.println();
		acc.changeDetails();
		

		

	}
	

}


