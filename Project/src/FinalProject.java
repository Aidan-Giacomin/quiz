import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.ImageIcon;

import java.awt.*;
import java.util.Scanner;

import javax.swing.*;

import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;

public class FinalProject extends Canvas {

	static int understanding;
	static int lasagna;
	static int weird;
	static int people;
	static int confusion;
	static String name;
	static String crying;
	static int className;
	static int startQuestion;
	static int elipse;
	static int thanks;
	static ImageIcon icon;
	static JFrame frame = new JFrame();
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		name = JOptionPane.showInputDialog("What is your name?");
		crying = JOptionPane.showInputDialog("babies do this a lot");
		JOptionPane.showMessageDialog(frame,
				"welcome " + name + " get ready to be brain fu... I mean have your brain boozled");
		Object[] options = { "➸" };
		className = JOptionPane.showOptionDialog(frame, "Welcome to gravity the Game of understanding",
				"cats, dogs, and tacos", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,
				options[0]);
		beginNew();
	}

	public static void beginNew() {
		Object[] option = { "huh why me?", "ogey lets go", "1-10" };
		startQuestion = JOptionPane.showOptionDialog(frame, "Choose your poison... elephants?",
				"AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				option, option[2]);
		firstQuestion();
	}

	public static void firstQuestion() {
		switch (startQuestion) {
		case 0: {
			questionConfusion();
			break;
		}
		case 1: {
			ogeyAnd();
			break;
		}
		case 2: {
			secondOne();
			break;
		}
		}
	}

	public static void secondOne() {

		// icon = new ImageIcon(("C.jpg"));
		Object[] option = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "reset" };
		elipse = JOptionPane.showOptionDialog(frame, "are these doors to a farm? or are you just high?", "be prepared",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, option, option[9]);
		highDoors();
	}

	public static void highDoors() {
		switch (elipse) {
		case 0: {
			JOptionPane.showMessageDialog(frame, icon = new ImageIcon(("C.jpg")));
			secondOne();
			break;
		}
		case 1: {
			Desktop d = Desktop.getDesktop();
			try {
				d.browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		case 2: {
			JOptionPane.showMessageDialog(frame, icon = new ImageIcon(("I.png")));
			secondOne();
			break;
		}
		case 3: {
			JOptionPane.showMessageDialog(frame, icon = new ImageIcon(("Y.jpg")));
			bigThanks();
			break;
		}
		case 4: {
			JOptionPane.showMessageDialog(frame,
					"you must " + crying + " a lot too");
			secondOne();
			break;
		}
		case 5: {
			JOptionPane.showMessageDialog(frame, icon = new ImageIcon(("G.jpg")));
			secondOne();
			break;
		}
		case 6: {
			JOptionPane.showMessageDialog(frame, icon = new ImageIcon(("A.jpg")));
			secondOne();
			break;
		}
		case 7: {
			JOptionPane.showMessageDialog(frame, icon = new ImageIcon(("J.jpg")));
			secondOne();
			break;
		}
		case 8: {
			JOptionPane.showMessageDialog(frame, icon = new ImageIcon(("images.jpg")));
			secondOne();
			break;
		}
		case 9: {
			FinalProject canvas = new FinalProject();
			JFrame frame = new JFrame();
			frame.setSize(1920, 1080);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(canvas).setBackground(Color.white);
			frame.setLocationRelativeTo(null); // Sets JPanel to center of screen
			frame.setResizable(false);
			frame.setVisible(true);
			break;
		}
		case 10: {
			beginNew();
		}
		}
	}
	public static void bigThanks()
	{
		Object[] options = { "❤" };
		thanks = JOptionPane.showOptionDialog(frame, "A big thanks to Mr McGuire for this amazing trimester and an enjoyable java experience",
				"cats, dogs, and tacos", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,
				options[0]);
		secondOne();
	}

	public void paint(Graphics graphics) {
		graphics.setColor(new Color(0, 0, 255));
		graphics.fillRect(0, 0, 1920, 1080);
		delay();
		repaint();
		graphics.setColor(new Color(60, 255, 0));
		graphics.fillRect(0, 0, 1920, 1080);
		delay();
		repaint();
		graphics.setColor(new Color(255, 0, 0));
		graphics.fillRect(0, 0, 1920, 1080);
		delay();
		repaint();
		graphics.setColor(new Color(0, 0, 0));
		graphics.fillRect(0, 0, 1920, 1080);
		delay();
		repaint();
		graphics.setColor(new Color(255, 0, 221));
		graphics.fillRect(0, 0, 1920, 1080);
		delay();
		repaint();
		graphics.setColor(new Color(255, 242, 0));
		graphics.fillRect(0, 0, 1920, 1080);
		delay();
		repaint();
		graphics.setColor(new Color(3, 252, 244));
		graphics.fillRect(0, 0, 1920, 1080);
		delay();
		repaint();
		graphics.setColor(new Color(255, 0, 221));
		graphics.fillRect(0, 0, 1920, 1080);
		delay();
		repaint();
		graphics.setColor(new Color(252, 3, 140));
		graphics.fillRect(0, 0, 1920, 1080);
		delay();
		repaint();
	}

	public void delay() {
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void ogeyAnd() {
		Object[] option = { "Shout out to the homie suess", "the world is your playground", "the point is your great",
				"be spontaneous do something new everyday", "reset" };
		understanding = JOptionPane.showOptionDialog(frame, "oh the places youll go or the things youll be",
				"whats the meaning of these?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				option, option[3]);
		ogeyRandom();
	}

	public static void ogeyRandom() {
		switch (understanding) {
		case 0: {
			JOptionPane.showMessageDialog(frame, icon = new ImageIcon(("PH.jpg")));
			beginNew();
			break;
			
		}
		case 1: {
			Desktop d = Desktop.getDesktop();
			try {
				d.browse(new URI("http://www.mapcrunch.com/"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		case 2: {
			Desktop d = Desktop.getDesktop();
			try {
				d.browse(new URI("https://pointerpointer.com/"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
			break;
		}
		case 3: {
			Desktop d = Desktop.getDesktop();
			try {
				d.browse(new URI("https://theuselessweb.com/"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		case 4: {
			beginNew();

		}
		}
	}

	public static void questionConfusion() {
		Object[] option = { "people?", "places?", "things?", "reset" };
		confusion = JOptionPane.showOptionDialog(frame, "because you are the one? what do you want to know?", "clock",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[2]);
		peopleConfusion();
	}

	public static void peopleConfusion() {
		switch (confusion) {
		case 0: {
			peopleThings();
			break;
		}
		case 1: {
			Desktop d = Desktop.getDesktop();
			try {
				d.browse(new URI("http://www.mapcrunch.com/"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		case 2: {
			Desktop d = Desktop.getDesktop();
			try {
				d.browse(new URI("https://weirdorconfusing.com/"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
		}
		case 3: {
			beginNew();
		}
		}
	}

	public static void peopleThings() {
		Object[] option = { "white girls", "uhhhhhhh", "AN ORANGE", "Calvin Kim" };
		weird = JOptionPane.showOptionDialog(frame, "battery acid? and beyond our galaxy", "sandy butt cheeks",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[1]);
		peopleTwo();
	}

	public static void peopleTwo() {
		switch (weird) {
		case 0: {
			JOptionPane.showMessageDialog(frame, icon = new ImageIcon(("K.jpg")));
			beginNew();
			break;
		}
		case 1: {
			JOptionPane.showMessageDialog(frame, icon = new ImageIcon(("P.jpg")));
			beginNew();
			break;
		}
		case 2: {
			JOptionPane.showMessageDialog(frame, icon = new ImageIcon(("N.png")));
			beginNew();
			break;
		}
		case 3: {
			JOptionPane.showMessageDialog(frame, icon = new ImageIcon(("H.jpg")));
			beginNew();
			break;
		}
		}
	}

}
