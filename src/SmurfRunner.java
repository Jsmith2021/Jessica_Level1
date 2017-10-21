
public class SmurfRunner {
public static void main(String[] args) {
	Smurfs handySmurf = new Smurfs("Handy");
System.out.println(handySmurf.getName());
handySmurf.eat();

Smurfs papaSmurf = new Smurfs("Papa");
System.out.println(papaSmurf.getName());
papaSmurf.eat();
System.out.println(papaSmurf.getHatColor());
Smurfs SmurfetteSmurf = new Smurfs("Smurfette");
System.out.println(SmurfetteSmurf.getName());
SmurfetteSmurf.eat();

System.out.println(SmurfetteSmurf.isGirlOrBoy());
	
	
}
}