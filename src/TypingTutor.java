import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener{
	JFrame TypingTutor = new JFrame();
	JPanel panel = new JPanel();
	JLabel letter=new JLabel();
	char currentLetter=generateRandomLetter();
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}


	public static void main(String[] args) {
	new TypingTutor().createUI();

	}	
		
	
	
public void createUI() {
	TypingTutor.add(panel);
	TypingTutor.setVisible(true);
	TypingTutor.setSize(500, 500);
	TypingTutor.setTitle("Type or Die");
	letter.setText(""+currentLetter);
	letter.setFont(letter.getFont().deriveFont(28.0f));
	letter.setHorizontalAlignment(JLabel.CENTER);	
	TypingTutor.add(letter);
	TypingTutor.addKeyListener(this);

}


@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub

}


@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("You typed " + currentLetter);
	if(e.getKeyChar()==currentLetter) {
		System.out.println("Correct");
		panel.setBackground(Color.green);
	}
	else {
		panel.setBackground(Color.red);
	}
}


@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
currentLetter=generateRandomLetter();
letter.setText(""+currentLetter);
}
}
