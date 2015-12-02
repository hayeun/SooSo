package SooSo.Application;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Panel_Plan_Result {

	private static JLabel label;

	// Table Header
	private static String colName[] = { "Date", "Hometeam", "Awayteam", "HomeScores", "AwayScores" };
	private static DefaultTableModel model = new DefaultTableModel(colName, 0) {
		public boolean isCellEditable(int rowIndex, int mColIndex) {
			return false;
		}
	};
	private static JTable table = new JTable(model);

	public static void create(JPanel panel) {

		// label = new JLabel("Game Plans/Results");
		// panel.add(label, BorderLayout.NORTH);
		// panel.setBorder(new EmptyBorder(new Insets(20, 20, 20, 20)));
		panel.add(new JScrollPane(table));

		table.setAutoCreateRowSorter(true);
		TableRowSorter sorter = new TableRowSorter(table.getModel());
		table.setRowSorter(sorter);
		//table.addMouseListener(new MyMouseListener());

		try {
			DBConnecter con = new DBConnecter();
			con.connectDatabase("select * from game where game.date >'2015-03-01'");
			ResultSet rs = con.getResultSet();

			while (rs.next()) {
				Object[] temporaryObject = { rs.getDate(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getInt(6) };
				model.addRow(temporaryObject);
			}

			con.closeDatabase();
		} catch (SQLException e) {
			System.err.println("error sql = " + e);
		}
	}
	
	private class MyMouseListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e){
			if(e.getButton() == 1){ //left click
				
			}
			if(e.getClickCount() == 2){ //double click
				JDialog dialog = new JDialog();
				dialog.setModal(true);
				dialog.setTitle("Detail of game");
				dialog.setVisible(true);
			}
			if(e.getButton() == 3){ //right click
				
			}
		}
	}
	
}
