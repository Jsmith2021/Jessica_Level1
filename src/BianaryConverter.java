import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class BianaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField answer = new JTextField(20);
	JTextField answer1 = new JTextField(20);
	JButton button = new JButton("Convert");

	public static void main(String[] args) {
		BianaryConverter converter = new BianaryConverter();
		converter.createUI();

	}

	public void createUI() {
		panel.add(button);
		panel.add(answer);
		panel.add(answer1);
		frame.add(panel);
		frame.setTitle("Binary Converter");
		frame.setVisible(true);
		frame.pack();
		button.addActionListener(this);
		
	}

	int convert1(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		 //if(!Pattern.matches("\2", binary)) {
		//JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");;
		 //return 0;
		// }
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			System.out.println(asciiValue);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			// question.setText("");
			return 0;
		}
	}

	String convert(int binary) {
		
		char theLetter = (char) binary;
		return "" + theLetter;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		answer1.setText(convert(convert1(answer.getText()))); 
		System.out.println(convert(convert1(answer.getText())) );
	
	}
}
