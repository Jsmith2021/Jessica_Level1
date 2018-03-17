public class popcornMethod {
	
	public static void main(String[] args) {
		Popcorn popcorn1=new Popcorn("popcorn");
		Microwave microwave1=new Microwave ();
		
		microwave1.putInMicrowave(popcorn1);
		microwave1.setTime(1);
		microwave1.startMicrowave();
		popcorn1.applyHeat();
		popcorn1.pause();
	}
}
