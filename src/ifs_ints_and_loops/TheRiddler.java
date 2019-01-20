package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int Score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog("What has a head and a tail, but no body?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one

		if (answer.equalsIgnoreCase("COIN")) {
			Score = Score + 1;
			JOptionPane.showMessageDialog(null, "CORRECT");
			// 5. Otherwise, say "wrong" and tell them the answer

		} else {
			JOptionPane.showMessageDialog(null, "WRONG");
			// 6. Add some more riddles
		}
		String answer2 = JOptionPane.showInputDialog("Imagine you are in a dark room. How do you get out?");
		if (answer2.equalsIgnoreCase("stop imagining")) {
			Score = Score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "WRONG");
			// 2. Make a pop up to show the score.
		}
		JOptionPane.showMessageDialog(null, Score);
	}
}
