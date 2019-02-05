package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String Feelings = JOptionPane.showInputDialog("Is you happy?");

		if (Feelings.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever your doing.");
		} else {
			Feelings = JOptionPane.showInputDialog("Do you want to be happy?");
			if (Feelings.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep Doing whatever you want");
			} else {
				if (Feelings.equalsIgnoreCase("yes")) {
					JOptionPane.showMessageDialog(null, "Change Something.");

				}

			}

		}
	}
}