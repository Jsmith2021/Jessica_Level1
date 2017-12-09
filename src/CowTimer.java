
import java.applet.AudioClip;

import javax.swing.JApplet;

public class CowTimer {
	public static void main(String[] args) throws InterruptedException {
		CowTimer timer = new CowTimer();
		timer.setTime(2);
		timer.start();

	}

	private int minutes;

	public void setTime(int minutes) {
		this.minutes = minutes;
		System.out.println("Cow set to " + minutes + " minutes.");
	}

	public void start() throws InterruptedException {

		for (int i = this.minutes; i > 0; i--) {
			System.out.println(minutes);
		}

		Thread.sleep(60000);
		playSound("moo.wav");

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();

	}

	private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
