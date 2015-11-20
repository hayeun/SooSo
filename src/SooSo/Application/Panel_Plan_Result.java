package SooSo.Application;

import java.awt.BorderLayout;
import java.awt.Insets;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Panel_Plan_Result {

	private static JLabel label;

	// Table Header
	private static String colName[] = { "Date", "Hometeam", "Awayteam", "HomeScores", "AwayScores" };
	private static DefaultTableModel model = new DefaultTableModel(colName, 0);
	private static JTable table = new JTable(model);

	public static void create(JPanel panel) {

		label = new JLabel("Game Plans/Results");
		panel.add(label, BorderLayout.NORTH);
		panel.setBorder(new EmptyBorder(new Insets(20, 20, 20, 20)));
		panel.add(new JScrollPane(table));

		table.setAutoCreateRowSorter(true);
		TableRowSorter sorter = new TableRowSorter(table.getModel());
		table.setRowSorter(sorter);

		try {
			Connecter con = new Connecter();
			con.connectDatabase();
			ResultSet rs = con.getResultSet();

			while (rs.next()) {
				Object[] temporaryObject = { rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getInt(6) };
				model.addRow(temporaryObject);
			}

			con.closeDatabase();
		} catch (SQLException e) {
			System.err.println("error sql = " + e);
		}
	}
}
