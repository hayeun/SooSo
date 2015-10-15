import java.awt.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;




public class Application extends JFrame{
	private JTabbedPane tabbedPane;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	
	// Table Header
	 private String colName1[] = { "Date", "Hometeam", "Awayteam", "HomeScores","AwayScores"};
	 private DefaultTableModel model = new DefaultTableModel(colName1, 0);
	 private JTable table = new JTable(model);

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
		panel1 = new JPanel(new BorderLayout());
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		
		panelSet1(panel1);
		panelSet2(panel2);
		panelSet3(panel3);
		panelSet4(panel4);
		
		tabbedPane.add("Plan/Result", panel1);
		tabbedPane.add("Team Record", panel2);
		tabbedPane.add("Player Record", panel3);
		tabbedPane.add("Prediction", panel4);
		tabbedPane.setTabPlacement(JTabbedPane.TOP);
	}
	
	private void panelSet1(JPanel panel){
		label1 = new JLabel("Game Plans/Results");
		panel.add(label1,BorderLayout.NORTH);
		panel.setBorder(new EmptyBorder(new Insets(20, 20, 20, 20)));
		panel.add(new JScrollPane(table));
        pack();
		
	};
	
	private void panelSet2(JPanel panel){
		label2 = new JLabel("Team Record");
		panel.add(label2);
		
	};
	
	private void panelSet3(JPanel panel){
		label3 = new JLabel("Player Record");
		panel.add(label3);
	};
	
	private void panelSet4(JPanel panel){
		label4 = new JLabel("Prediction");
		panel.add(label4);
	};
	
	
}