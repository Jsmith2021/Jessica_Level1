
public class teaParty {
	

	public static String welcome (String lastName, boolean isWoman, boolean isKnighted){
		if(isWoman==true) {
			return "Ms."+lastName;
			
		}
		else if(isKnighted==true) {
			return "Sir"+lastName;
		}
		else {
			return "Mr."+lastName;
		}
		
		
		
		
	
	
}
}
