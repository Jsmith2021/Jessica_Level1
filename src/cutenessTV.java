import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {
	JFrame cutenessFrame;
	JPanel panel;
	JButton ducks;
	JButton frogs;
	JButton unicorns;
	
	public static void main(String[] args) {
		cutenessFrame.setVisible(true);
		cutenessFrame.add(ducks, cutenessFrame);
		cutenessFrame.add(frogs, cutenessFrame);
		cutenessFrame.add(unicorns, cutenessFrame);
		cutenessFrame.setTitle("Cuteness TV!");
		ducks.setName("Click here to watch a duck video!");
		frogs.setName("Click here to watch a frog video!");
		unicorns.setName("Click here to watch a unicorn video!");
	}

	
	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
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
	
	public void createUI(){
		new cutenessTV().createUI();
		JPanel panel = new JPanel();
		JButton ducks = new JButton();
		JButton frogs = new JButton();
		JButton unicorns = new JButton();
		
		
		
	}
	public void ActionPreformed (ActionEvent e) {
		if(e.getSource==ducks) {
			System.out.println("button pressed");
		}
		if(e.getSource==frogs) {
			System.out.println("button pressed");
		}
		if(e.getSource==unicorns) {
			System.out.println("button pressed");
		}
	}
	}

