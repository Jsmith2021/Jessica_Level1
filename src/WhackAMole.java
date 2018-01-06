import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


	public class WhackAMole implements ActionListener {
		JFrame WhackAMole = new JFrame();
		JPanel panel = new JPanel();
		JButton button=new JButton();
	
		public static void main(String[] args) {
			WhackAMole mole = new WhackAMole();
			mole.createUI();

		}
	public void createUI() {
		WhackAMole.add(panel);
		panel.add(button);
		WhackAMole.setSize(800,300);
	}
	
	for(int i; i<25; i++) {
		JButton button =new JButton();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
