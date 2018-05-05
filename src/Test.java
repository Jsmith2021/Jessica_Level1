
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton button = new JButton("Submit");
	JTextField textfield = new JTextField();
	JLabel label = new JLabel("Submitted:");

	public static void main(String[] args) {
		int r = new Random().nextInt();
		new Test().createUI(r);
	}

	public void createUI(int random) {
		frame.setVisible(true);
		frame.pack();
		frame.add(panel);
		panel.add(button);
		frame.setTitle("My Shopping List");
		panel.add(label);
		panel.add(textfield);
		// label.add(textfield);
	}

}
