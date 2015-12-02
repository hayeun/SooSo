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

public class Panel_TeamRecord {

	// private static JLabel label;

	// Table Header
	private static String colName[] = { "Team", "연고지" };
	private static DefaultTableModel model = new DefaultTableModel(colName, 0);
	private static JTable table = new JTable(model) {
		public boolean isCellEditable(int rowIndex, int mColIndex) {
			return false;
		}
	};

	public static void create(JPanel panel) {

		// label = new JLabel("Team Record");
		// panel.add(label);
		// panel.setBorder(new EmptyBorder(new Insets(20, 20, 20, 20)));
		panel.add(new JScrollPane(table));

		table.setAutoCreateRowSorter(true);
		TableRowSorter sorter = new TableRowSorter(table.getModel());
		table.setRowSorter(sorter);

		try {
			DBConnecter con = new DBConnecter();
			con.connectDatabase("select * from team");
			ResultSet rs = con.getResultSet();

			while (rs.next()) {
				Object[] temporaryObject = { rs.getString(1), rs.getString(2) };
				model.addRow(temporaryObject);
			}

			con.closeDatabase();
		} catch (SQLException e) {
			System.err.println("error sql = " + e);
		}
	}
}
