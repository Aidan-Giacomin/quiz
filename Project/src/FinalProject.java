import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;

import java.awt.*;
import java.util.Scanner;

import javax.swing.*;

public class FinalProject extends Canvas
	{
		static int lasagna;
		static int weird;
		static int people;
		static int confusion;
		static String name;
		static int className;
		static int startQuestion;
		static int elipse;
		static ImageIcon icon;
		static JFrame frame = new JFrame();
		private static final long serialVersionUID = 1L;

		public static void main(String[] args)
			{
				name = JOptionPane.showInputDialog("What is your name?");
				JOptionPane.showMessageDialog(frame,
						"welcome " + name + " get ready to be brain fu... I mean have your brain boozled");
				Object[] options =
					{ "➸" };
				className = JOptionPane.showOptionDialog(frame, "Welcome to gravity the Game of understanding",
						"cats, dogs, and tacos", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						options, options[0]);

				Object[] option =
					{ "huh why me?", "ogey lets go", "1-10" };
				startQuestion = JOptionPane.showOptionDialog(frame, "Choose your poison... elephants?",
						"AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, option, option[2]);
				firstQuestion();
			}

		public static void firstQuestion()
			{
				switch (startQuestion)
					{
					case 0:
						{
							questionConfusion();
							break;
						}
					case 1:
						{

							break;
						}
					case 2:
						{
							secondOne();
							break;
						}
					}
			}

		public static void secondOne()
			{

				// icon = new ImageIcon(("C.jpg"));
				Object[] option =
					{ "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
				elipse = JOptionPane.showOptionDialog(frame, "are these doors to a farm? or are you just high?",
						"be prepared", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, option,
						option[9]);
				highDoors();
			}

		public static void highDoors()
			{
				switch (elipse)
					{
					case 0:
						{
							JOptionPane.showMessageDialog(frame, icon = new ImageIcon(("C.jpg")));
							break;
						}
					case 1:
						{

							break;
						}
					case 2:
						{
							secondOne();
							break;
						}
					case 3:
						{

							break;
						}
					case 4:
						{

							break;
						}
					case 5:
						{
							secondOne();
							break;
						}
					case 6:
						{

							break;
						}
					case 7:
						{
							JOptionPane.showMessageDialog(frame, icon = new ImageIcon(("J.jpg")));
							break;
						}
					case 8:
						{
							JOptionPane.showMessageDialog(frame, icon = new ImageIcon(("images.jpg")));
							break;
						}
					case 9:
						{
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
					}
			}

		public void paint(Graphics graphics)
			{
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

		public void delay()
			{
				try
					{
						Thread.sleep(2);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
			}

		public static void questionConfusion()
			{
				Object[] option =
					{ "people?", "places?", "things?" };
				confusion = JOptionPane.showOptionDialog(frame, "because you are the one? what do you want to know?",
						"AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, option, option[2]);
				peopleConfusion();
			}

		public static void peopleConfusion()
			{
				switch (confusion)
					{
					case 0:
						{
							peopleThings();
							break;
						}
					case 1:
						{

							break;
						}
					case 2:
						{
							secondOne();
							break;
						}
					}
			}

		public static void peopleThings()
			{
				Object[] option =
					{ "Kermit", "lavezza", "things?" };
				weird = JOptionPane.showOptionDialog(frame, "caca",
						"AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, option, option[1]);
			}
		public static void peopleTwo()
			{
				switch (weird)
					{
					case 0:
						{
							JOptionPane.showMessageDialog(frame, icon = new ImageIcon(("K.jpg")));
							break;
						}
					case 1:
						{
							JOptionPane.showMessageDialog(frame, icon = new ImageIcon(("L.jpg")));
							break;
						}
					case 2:
						{
							secondOne();
							break;
						}
					}
			}

	}
