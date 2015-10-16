package SooSo.Application;

import java.awt.BorderLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class Panel_TeamRecord{
	private static JLabel label;
	
	public static void create(JPanel panel) {

		label = new JLabel("Team Record");
		panel.add(label);
	}
}
