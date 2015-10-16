package SooSo.Application;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_Prediction {

	private static JLabel label;

	public static void create(JPanel panel) {

		label = new JLabel("Prediction");
		panel.add(label);
	}
}
