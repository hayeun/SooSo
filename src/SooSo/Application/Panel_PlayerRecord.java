package SooSo.Application;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_PlayerRecord {

	private static JLabel label;
	public static void create(JPanel panel) {

		label = new JLabel("Team Record");
		panel.add(label);
	}
}
