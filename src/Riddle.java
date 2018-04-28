import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Riddle implements ActionListener{
JFrame frame = new JFrame();
JPanel panel= new JPanel(); 
JLabel label = new JLabel();
JButton button = new JButton("Submit");
JButton button1 = new JButton("Hint");
JTextField text=new JTextField("Type answer here");


public static void main(String[] args) {
	new Riddle().createUI();
}
public void createUI(){
	frame.setVisible(true);
	frame.add(panel);
	panel.add(label);
	panel.add(button);
	panel.add(button1);
	panel.add(text);
	frame.pack();
	label.setText("What starts with an e, ends with an e, and contains one letter?");
	button.addActionListener(this);
	button1.addActionListener(this);
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==button) ;
	if(text.equals("An envelope")) {
		System.out.println("You got the correct answer!");
	}
		else {
			System.out.println("You got the wrong answer!");
		}
	

}	
	
}



