package SooSo.Application;

import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Panel_Prediction_WEKA {

	private static JTextArea textArea;

	public static void create(JPanel panel) throws Exception {
		textArea = new JTextArea(42,90);
		
		panel.add(textArea);

		WEKA_Controller weka = new WEKA_Controller();
		textArea.append(weka.getJ48().toString());
		
	}

}
