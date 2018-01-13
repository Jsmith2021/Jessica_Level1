
public class IntroToMethodWriting {
public static void main(String[] args) {
	iRock();
	Rocker("Jessica");
	Truth("Taylor Swift");
	Echo("Cats");
	Repeating(2, "Cats");
	int sum=add(1,1);
	System.out.println(sum);
	isEven(2);
}
public static void iRock() {
	System.out.println("Jessica rocks");
	
}
public static void Rocker(String name) {
	 
	System.out.println(name+" rocks");
}

public static void Truth(String name) {
	if(name.equals("Justin Bieber")) {
	System.out.println(name+" is annoying");
	
}
	else 
		System.out.println(name+" is awesome");
}
public static void Echo(String repeat) {
	for (int i = 0; i < 2; i++) {
		System.out.println(repeat);
		
	}
}
public static void Repeating(int times, String word) {
	System.out.println("Cats");
for (int i = 0; i < 2; i++) {
}
	
}
public static int add(int number, int number1) {
	return number+number1;
	
}
public static boolean isEven(int even) {
	if(even==2) {
		return true;
		
	}
	else {
		return false;
	}
}
}








