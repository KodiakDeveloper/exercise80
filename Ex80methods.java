package bookExercises;

import javax.swing.JOptionPane;

public class Ex80methods {

	public void remainder(int a, int b) {

		int quotient = a / b;

		if (a - (quotient * b) == 0) {

			JOptionPane.showMessageDialog(null,
					"\nDividend: " + a + "\nDivisor: " + b + "\nQuotient: " + quotient + "\nThe numbers are divisible");

		}

		else {

			JOptionPane.showMessageDialog(null, "\nDividend: " + a + "\nDivisor: " + b + "\nQuotient: " + quotient
					+ "\nThe numbers are not divisible");

		}
	}

}
