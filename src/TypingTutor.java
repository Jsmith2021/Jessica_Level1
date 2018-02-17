import java.awt.Color;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener{
	JFrame TypingTutor = new JFrame();
	JPanel panel = new JPanel();
	JLabel letter=new JLabel();
	char currentLetter=generateRandomLetter();
	static TypingTutor t1;
	int numberOfCorrectCharacters=0;
	int counter=0;
	Date timeAtStart = new Date();
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}


	public static void main(String[] args) {
		t1=new TypingTutor();
	t1.createUI();
	

	}	
		
	
	
public void createUI() {
	TypingTutor.add(panel);
	TypingTutor.setVisible(true);
	TypingTutor.setSize(500, 500);
	TypingTutor.setTitle("Type or Die");
	letter.setText(""+currentLetter);
	letter.setFont(letter.getFont().deriveFont(28.0f));
	letter.setHorizontalAlignment(JLabel.CENTER);
	panel.add(letter);
	TypingTutor.addKeyListener(this);
	TypingTutor.pack();

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
		numberOfCorrectCharacters++;
		counter++;	
		if(counter>10) {
		 t1.showTypingSpeed(numberOfCorrectCharacters);
		}
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
private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	Date timeAtEnd = new Date();
	long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	long gameInSeconds = (gameDuration / 1000) % 60;
	double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	int charactersPerMinute = (int) (charactersPerSecond * 60);
	JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
}


}




