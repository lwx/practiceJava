package javaTraining001;

import java.util.Random;

class Guessors {
	Random rd = new Random();
	int storedNum;
	
	int genNum(){
		int storedNum = rd.nextInt();
		System.out.println(storedNum);
		return storedNum;
	}
	
	int getNum() {
		if(storedNum==0) {
			System.out.println("Guessor havs not guessed");
			return -1;
		}else {
			return storedNum;
		}
	}
}

class Players {
	Random rd = new Random();
	
	int genNum(){
		int retNum = rd.nextInt();
		System.out.println(retNum);
		return retNum;
	}
}


public class test001 {

}
