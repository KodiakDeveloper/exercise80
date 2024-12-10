package bookExercises;

import javax.swing.JOptionPane;

public class Ex80 {

	public static void main(String[] args) {

		String userAnswer;

		Ex80methods exercise = new Ex80methods();

		do {

			int a, b;

			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Dividend: "));

			b = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Divisor: "));

			if (a <= 0 || b <= 0) {
				
				JOptionPane.showMessageDialog(null, "Please input a value greater than zero!!");
			}

			else {
				
				exercise.remainder(a, b);
			}
			
			
			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!");

	}

}
