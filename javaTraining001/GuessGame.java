package javaTraining001;

import java.util.Scanner;

class Guessor {
	int gNum;
	
	int genNum(){
		System.out.println("Guessor is guessing...");
			Scanner sc = new Scanner(System.in);
			int gNum = sc.nextInt();
			System.out.println("Guessor guesses " + gNum);

			return gNum;
		}
}
	


class Player {
	int gNum;
	
	int genNum(){
		System.out.println("Player is guessing...");
            Scanner sc = new Scanner(System.in);
			int gNum = sc.nextInt();
			System.out.println("Player guesses " + gNum);
			return gNum;

	}
	
}

class Umpire {
	int noFromGuessor;
	int noFromP1;
	int noFromP2;
	int noFromP3;
	
	void askGuessor(){
		Guessor g = new Guessor();
		noFromGuessor = g.genNum();
		
	}
	
	void askPlayer(){
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		noFromP1 = p1.genNum();
		noFromP2 = p2.genNum();
		noFromP3 = p3.genNum();
		
	}
	
	void compare(){
		if(noFromGuessor == noFromP1 && noFromGuessor == noFromP2 && noFromGuessor == noFromP3){
			System.out.println("Everyone wins!!");
		}else if(noFromGuessor == noFromP1 && noFromGuessor == noFromP2){
			System.out.println("Player 1 & 2 wins!!");
		}else if(noFromGuessor == noFromP1 && noFromGuessor == noFromP3){
			System.out.println("Player 1 & 3 wins!!");
		}else if(noFromGuessor == noFromP2 && noFromGuessor == noFromP3){
			System.out.println("Player 2 & 3 wins!!");
		}else if(noFromGuessor == noFromP1) {
			System.out.println("Player 1 wins!!");
		}else if(noFromGuessor == noFromP2) {
			System.out.println("Player 2 wins!!");
		}else if(noFromGuessor == noFromP3) {
			System.out.println("Player 3 wins!!");
		}else {
			System.out.println("No one guessed correctly, no one wins!!");
		}
	}
	
}

public class GuessGame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u = new Umpire();
		u.askGuessor();
		u.askPlayer();
		u.compare();

		

	}

}
