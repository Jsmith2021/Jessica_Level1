


public class RobotArmy {
	public static void main(String[] asd){
		//1. create a new human
		Human human1=new Human("Bob");
		

		//2. create a new Robot army of good and evil robots.
Robot2 army=new Robot2("R2D2", true);
		
		//3. command your robot army to destroy a human
	army.destroy(human1);
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	
	public Human(String name){
		this.name = name;
		this.isAlive = true;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot2 {
	boolean isEvil;
	String name;
	
	public Robot2(String name, boolean isEvil){
		this.name = name;
		this.isEvil = isEvil;
	}
	
	public void destroy(Human man){
		if(isEvil){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			System.out.println("No!! The robot " + name + " loves " +man.getName());
		}
	}
}



