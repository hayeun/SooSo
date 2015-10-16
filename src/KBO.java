/*
import java.sql.*;
import jxl.*;
import java.io.File; 

//import java.util.*;


public class KBO {

	public static void main(String[] ar) {

		Workbook workbook = null;
		Sheet sheet = null;
		//Cell cell = null;
		try {
			workbook = Workbook.getWorkbook(new File("test.xls")); 
			workbook.getSheets();	
			if(workbook!=null){
				sheet = workbook.getSheet(0);
				if(sheet!=null)
				{
					//Cell a1 = sheet.getCell(1,1);
					//String stringa1 = a1.getContents();
					int nRowStartIndex = 0;
					int nRowEndIndex = sheet.getRow(0).length-1;
					int nColumnStartIndex = 0;
					int nColumnEndIndex = sheet.getColumn(0).length-1;
					System.out.println(nRowEndIndex);
					System.out.println(nColumnEndIndex);
					String szValue = "";
					for (int nColumn = nColumnStartIndex ; nColumn<=nColumnEndIndex ;nColumn++){
						for (int nRow = nRowStartIndex ; nRow<=nRowEndIndex ;nRow++){
							szValue = sheet.getCell(nRow,nColumn).getContents();
							System.out.print(szValue);
							System.out.print("\t");
						}
						System.out.println();
					}
				}
				else
				{
					System.out.println("Sheet is null");
				}
	
			}
			else{
				System.out.println("Sheet is null");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			if(workbook!=null){
				workbook.close();
			}
		}
		
		
		try {

			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("����̹� �˻� ����!");

		} catch (ClassNotFoundException e) {
			System.err.println("error = " + e);
		}

		Connection conn = null;

		Statement stmt = null;

		ResultSet rs = null;

		String url = "jdbc:mysql://127.0.0.1:3306/KBODB";// localhost, 127.0.0.1

		String id = "root";

		String pass = "dltngns";

		String query = "select * from team";

		try {

			conn = DriverManager.getConnection(url, id, pass);

			stmt = conn.createStatement();

			rs = stmt.executeQuery(query);

			while (rs.next()) {

				String TeamID = rs.getString(1); // rs.getString("name");

				String TeamName = rs.getString(2); // rs.getString("jumin");

				System.out.print(TeamID + "\t");

				System.out.println(TeamName + "\t");

			}

			rs.close();

			stmt.close();

			conn.close();

		}

		catch (SQLException e) {
			System.err.println("error sql = " + e);
		}

	} // main() block

} // class() block

*/
