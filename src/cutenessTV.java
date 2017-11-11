
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {
	JFrame cutenessFrame = new JFrame();
	JPanel panel = new JPanel();
	JButton ducks = new JButton("Ducks");
	JButton frogs = new JButton("Frogs");
	JButton unicorns = new JButton("Unicorns");

	public static void main(String[] args) {
		cutenessTV cute = new cutenessTV();
		cute.createUI();

	}

	public void createUI() {
		cutenessFrame.add(panel);
		panel.add(ducks);
		panel.add(frogs);
		panel.add(unicorns);
		ducks.addActionListener(this);
		frogs.addActionListener(this);
		unicorns.addActionListener(this);
		cutenessFrame.setTitle("Cuteness TV!");
		cutenessFrame.setVisible(true);
		cutenessFrame.pack();

	}

	void showDucks() {
		playVideo("oMQI0bJJOvM");
	}

	void showFrogs() {
		playVideo("_9Pwyp7aVPI&t=20s");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/watch?v=" + videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ducks) {
			showDucks();
		}
		if (e.getSource() == frogs) {
			showFrogs();
		}
		if (e.getSource() == unicorns) {
			showFluffyUnicorns();
		}
	}

}
