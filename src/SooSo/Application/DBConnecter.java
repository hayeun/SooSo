package SooSo.Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import SooSo.Game.Game;

public class DBConnecter {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	public void connectDatabase(String query) throws SQLException {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 검색 성공!");

		} catch (ClassNotFoundException e) {
			System.err.println("error = " + e);
		}

		String url = "jdbc:mysql://127.0.0.1:3306/KBODB";// localhost, 127.0.0.1
		String id = "root";
		String pass = "qogkdus12!@";

		conn = DriverManager.getConnection(url, id, pass);
		stmt = conn.createStatement();
		rs = stmt.executeQuery(query);
	}

	public void closeDatabase() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("닫기 오류: " + e.getStackTrace());
		}
	}

	public ResultSet getResultSet() {
		return rs;
	}
}
