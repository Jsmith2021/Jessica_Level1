import javax.swing.JOptionPane;

public class Platypus {
	
		public String name;

		public Platypus() {
			// TODO Auto-generated constructor stub
		}

		void sayHi(){
			System.out.println("The platypus " + name + " is smarter than your average platypus.");
		}
		
		public static void main(String[] args) {
			Platypus platypus1 = new Platypus();
			platypus1.createUI();
			
		}
			public void createUI() {
				name=JOptionPane.showInputDialog("What do you want your Platypus to be called?");
			
				sayHi();
			}
			//1. Make an instance of your new pet platypus
			
			//2. Call the sayHi method
			
			//3. Create a constructor in the platypus class so that you can give your platypus a name.
		}
	


