package all_types_of_codes.practices;

import java.sql.*;

public class JDBC_Select_insert_through_SQL_server {

static String JDBC_DRIVER = "com.mysql.jdbc.Driver";



	public static void main (String[] args) throws SQLException, ClassNotFoundException {
	
	Class.forName("com.mysql.jdbc.Driver");
//	jdbc:mysql://localhost/EMP
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost/test_new_schema","root","test");
	Statement stmt = con.createStatement();
	Statement stmt1 = con.createStatement();
	ResultSet res =stmt.executeQuery("SELECT * FROM test_new_schema.college");
	int res1=stmt1.executeUpdate("Insert INTO test_new_schema.college values(011,'exctt','2018-03-12')");
    
	System.out.println("Rows Fetched from Select statement " +res);
    
	while (res.next())
    {
//    System.out.println("from while " +res);	
    int subject_number = res.getInt("College_Subjects_Number");
    String subject_name = res.getString("College_Subject_Name");
    Date Subject_Start_Date = res.getDate("College_Subject_Start_Date");
    
    System.out.println("SUBJECT_NUMBER:" +subject_number);
    System.out.println("SUBJECT_NAME:" +subject_name);
    System.out.println("SUBJECT_START_DATE:" +Subject_Start_Date);
    }
    
    res.close();
    
    
    stmt.close();
    stmt.close();
    con.close();
	}	
	}
