import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleClicker implements ActionListener{
	JButton jokeButton = new JButton();
	JButton punchline = new JButton();;
public static void main(String[] args) {
new chuckleClicker().makeButtons();		
}
public void makeButtons() {
	JFrame frame=new JFrame();
	frame.setVisible(true);
	frame.setSize(200, 60);
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.setVisible(true);
	panel.add(jokeButton);
	panel.add(punchline);
	jokeButton.setText("joke");
	punchline.setText("punchline");
	jokeButton.addActionListener(this);
	punchline.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==jokeButton) {
		System.out.println("I used to work in a shoe-recycling shop.");
	}
	if (e.getSource()==punchline) {
		System.out.println("It was sole-destroying");
	}
	
	
}

}
