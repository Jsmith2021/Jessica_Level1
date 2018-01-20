import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MethodWriting {
public static void main(String[] args) {
	whichPresent("Liv");
	doPigsEat("bananas");
	System.out.println(whichPresent("Liv")+whichPresent("Zoe")+whichPresent("Amanda"));
	getLuckyNumber();
	numEggsMomWants();
	numEggsDadWants();
	numEggsBabyWants();
	numEggsEveryoneWants();
	getAverageHeight(5);
}
public static String whichPresent(String friendName) {
	
	if (friendName.equals("Liv")) {
		return friendName+" wants a jacket";
	}
	if (friendName.equals("Zoe")) {
		return friendName+" wants a computer";
	}
	if (friendName.equals("Amanda")) {
		return friendName+" wants a trampoline";
	}
	else 
		return friendName+" wants a kitten";
	}

	

public static boolean doPigsEat(String food) {
	if(food.equals("Can pigs eat bananas?")){
		return true;
		
	}
	else {
		return false;
	}
}
	public static int getLuckyNumber(){
		Random number  = new Random();
		return number.nextInt(653)+13;
	}
	public static int numEggsMomWants() {
		return 5;
	}
	public static int numEggsDadWants() {
		return 8;
	}
	public static int numEggsBabyWants() {
		return 2;
	}
	public static int numEggsEveryoneWants() {
		return 5;
	}
	public static int getAverageHeight(int age) {
		if (age>100) {
			return 34;
		}
		if (age>50&&age<100) {
			return 30;
		}
		if (age>10&&age<50) {
			return 26;
		}
		if (age<10) {
			return 14;
		}
	}


}


