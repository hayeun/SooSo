package SooSo.Application;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class Application extends JFrame {
	private JTabbedPane tabbedPane;
	private JPanel panelPlanResult;
	private JPanel panelTeamRecord;
	private JPanel panelPlayerRecord;
	private JPanel panelPrediction;
	
	public Application() {
		initUI();
	}

	private void initUI() {
		createMenuBar(); // menu bar creating
		this.createTabPane(); // Panel creating

		// window setting
		add(tabbedPane);
		setTitle("Prediction System for KBO");
		setSize(1024, 768);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void createMenuBar() {
		JMenuBar menubar = new JMenuBar();

		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F); // short cut key
		JMenu setting = new JMenu("Setting");
		JMenu help = new JMenu("Help");

		JMenuItem newMI = new JMenuItem("new");
		JMenuItem openMI = new JMenuItem("open");
		JMenuItem saveMI = new JMenuItem("save");
		JMenuItem quitMI = new JMenuItem("quit");

		// event handling for quit menu
		quitMI.setMnemonic(KeyEvent.VK_Q);
		quitMI.setToolTipText("Exit application");
		quitMI.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});

		setJMenuBar(menubar);
		menubar.add(file);
		file.add(newMI);
		file.add(openMI);
		file.add(saveMI);
		file.add(quitMI);
		menubar.add(setting);
		menubar.add(Box.createHorizontalGlue());
		menubar.add(help);
	}

	private void createTabPane() {
		tabbedPane = new JTabbedPane();
		panelPlanResult = new JPanel(new BorderLayout());
		panelTeamRecord = new JPanel();
		panelPlayerRecord = new JPanel();
		panelPrediction = new JPanel();

		Panel_Plan_Result.create(panelPlanResult);
		Panel_TeamRecord.create(panelTeamRecord);
		Panel_PlayerRecord.create(panelPlayerRecord);
		Panel_Prediction.create(panelPrediction);

		tabbedPane.add("Plan/Result", panelPlanResult);
		tabbedPane.add("Team Record", panelTeamRecord);
		tabbedPane.add("Player Record", panelPlayerRecord);
		tabbedPane.add("Prediction", panelPrediction);
		tabbedPane.setTabPlacement(JTabbedPane.TOP);
	}
}