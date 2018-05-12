
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test implements ActionListener {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JTextField textfield = new JTextField(10);
	JButton button = new JButton("Submit");
	JLabel label = new JLabel("Submitted:");

	public static void main(String[] args) {
		new Test().createUI();
	}

	public void createUI() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(textfield);
		panel.add(button);
		frame.setTitle("My Shopping List");
		panel.add(label);
		button.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		label.setText(("\n"+label.getText()+"\n"+textfield.getText()));
		System.out.println((textfield.getText()));
	}

}
