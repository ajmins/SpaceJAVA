package com.theopentutorials.jdb.oracle;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class TestOracleJDBC {
	//JDBC driver name and database URL
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	//database credentials
	static final String USERNAME = "testuser";
	static final String PASSWORD = "123456789";
	
    public static void main(String[] args) {
    	TestOracleJDBC jdbcOracleDemo = new TestOracleJDBC();
    	jdbcOracleDemo.getInformation();
    }
    
    //function to get information
    private void getInformation(){
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
        	//1.Register JDBC driver
            Class.forName(JDBC_DRIVER);
            
            //2.Open a connection
            //con = DriverManager.getConnection("jdbc:oracle:thin:testuser/123456789@localhost");
            System.out.println("Connecting to database...");
            con=DriverManager.getConnection(DB_URL,USERNAME,PASSWORD); 
            
            //3.Executing statement
            System.out.println("Creating statement...");
            stmt = con.createStatement();
            
            String sql = "SELECT pid,name FROM person";
            rs = stmt.executeQuery(sql);
            
            //4.Extract data from resultset
//            while(rs.next()) {
//                System.out.print(rs.getInt(1) + "\t");
//                System.out.println(rs.getString(2));
//            }
            //another method
            while(rs.next()) {
            	//Retrieve by columun name
            	int id = rs.getInt("pid");
            	String name = rs.getString("name");
            	
            	//display values
            	System.out.println("ID: "+id);
            	System.out.println("Name: "+name);
            	
            }
            
            DatabaseMetaData dbmd=con.getMetaData();  
            getDetails(dbmd);
            //getTablesList(dbmd);
            
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
	private static void getTablesList(DatabaseMetaData dbmd) throws SQLException {
		String table[]={"TABLE"};  
        ResultSet rs1=dbmd.getTables(null,null,null,table);  
          
        while(rs1.next()){  
        System.out.println(rs1.getString(3));  
        }  
		
	}

	private static void getDetails(DatabaseMetaData dbmd) throws SQLException {
		System.out.println("\nDatabase Details...");
		System.out.println("-----------------------------------");
		System.out.println("Driver Name: "+dbmd.getDriverName());  
        System.out.println("Driver Version: "+dbmd.getDriverVersion());  
        System.out.println("UserName: "+dbmd.getUserName());  
        System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
        System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion()); 
		
	}
}
