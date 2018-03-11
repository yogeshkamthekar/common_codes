package all_types_of_codes.practices;

import java.sql.*;

public class JDBC_Select_Through_SQL_Server {

static String JDBC_DRIVER = "com.mysql.jdbc.Driver";

	public static void main (String[] args) throws SQLException, ClassNotFoundException {
	Class.forName("com.mysql.jdbc.Driver");
//	jdbc:mysql://localhost/EMP
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost/test_new_schema","root","test");
	Statement stmt = con.createStatement();
	ResultSet res =stmt.executeQuery("SELECT * FROM test_new_schema.college");
    System.out.println("Rows Fetched from Select statement " +res);
    res.close();
    stmt.close();
    con.close();
	}	
	}
