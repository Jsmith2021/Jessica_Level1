import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


	public class WhackAMole implements ActionListener {
		JFrame WhackAMole = new JFrame();
		JPanel panel = new JPanel();
		JButton mole=new JButton("Mole");
		int molesWhacked=10;
		Date timeAtStart = new Date();

		

		public static void main(String[] args) {
			int r=new Random().nextInt(24);
			new WhackAMole().createUI(r);
			
			
		}
		
	public void createUI(int random) {
		WhackAMole.setSize(250, 300);
		WhackAMole.setVisible(true);
		WhackAMole.setTitle("Whack a Button for Fame and Glory");
		WhackAMole.add(panel);
		mole.addActionListener(this);
		for(int i=0;i<24;i++) {
			if(i==random) {
				panel.add(mole);
			}
			else {
			JButton button=new JButton();
			panel.add(button);
			button.addActionListener(this);
			
			
		}
		}
	}
	void speak(String words) {
		try {
		Runtime.getRuntime().exec("Say " + words).waitFor();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==mole) {
			WhackAMole.dispose();
			int a=new Random().nextInt(24);
			new WhackAMole().createUI(a);
			playSound("soundcloud.com:.webloc");
			
			
		}
		else { 
		speak("You are a dork");
		speak("You are a moron");
		speak("You are a complete waste of atoms");
			
		}
		
		if(molesWhacked==10) {
			endGame(timeAtStart, 10);
		}
		
		
		}
	
	
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
		+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		}

	
}
