import org.jointheleague.graphical.robot.Robot;

public class RobotClass {
	
	String shape;
	String imageURL;
	Robot robot1= new Robot();
	int i;
	
	public RobotClass(String shape, String imageURL) {
		this.shape=shape;
		this.imageURL=imageURL;
	}
	
	public String getShape() {
		return this.shape;
		
	}
	
	public String getImageURL() {
		return this.imageURL;
		
	}
	
	public void setShape() {
		this. shape=shape; 
	}
	
	public void setImageURL() {
		this.imageURL= imageURL;
	}
	
	
	
	
	public void Draw() {
		
		robot1.changeRobot("http://www.salemalpacas.com/demonstrate/Front-Face-smaller-smooth2016.png");
	
	
	if (this.shape.equals("rectangle")) {
		robot1.penDown();
		robot1.move(500);
		robot1.turn(90);
		robot1.move(1000);
		robot1.turn(90);
		robot1.move(500);
		robot1.turn(90);
		robot1.move(1000);
	}
		if(this.shape.equals("triangle")){
			robot1.penDown();
			robot1.move(20);
			robot1.turn(60);
			robot1.move(20);
			robot1.turn(60);
			robot1.move(20);
		}
		if(this.shape.equals("circle")) {
			for(i=0; i<360; i++) {
				robot1.penDown();
				robot1.move(1);
				robot1.turn(1);
			}
				
			}
			else {
				for(i=0; i<4; i++) {
					robot1.penDown();
					robot1.move(20);
					robot1.turn(90);
				}
		
		
	}
}
	
}

	
