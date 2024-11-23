package connection;




import  java.sql.Connection;		
import  java.sql.Statement;
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;		
public class  DBConn {				
    	public static void  main(String[] args) throws  ClassNotFoundException, SQLException {													
				//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
//                String dbUrl = "jdbc:mysql://localhost:3306/myflixdb";					
                String dbUrl = "jdbc:mysql://localhost:3306/world";	
                
				//Database Username		
				String username = "root";	
                
				//Database Password		
//				String password = "root";	
				String password = "Nte#25";	

				//Query to Execute		
				String query = "SELECT * FROM city;";	
				//String query = "SELECT * FROM movies;";	
                
         	    //Load mysql jdbc driver		
           	    Class.forName("com.mysql.jdbc.Driver");			
           
           		//Create Connection to DB		
            	Connection con = DriverManager.getConnection(dbUrl,username,password);
          
          		//Create Statement Object		
        	   Statement stmt = con.createStatement();					
       
       			// Execute the SQL Query. Store results in ResultSet		
         		ResultSet rs= stmt.executeQuery(query);							
         
         		// While Loop to iterate through all data and print results		
				while (rs.next()){
					
					
			        		String id = rs.getString(1);								        
                            String title = rs.getString(2);	
                            String director = rs.getString(3);
                            //String Address = rs.getString(5);
                            System. out.println(id + "  -  " + title+" ---------- "+director);
                            System.out.println("*********************");
                            //System.out.println(Address);
                    }		
      			 // closing DB Connection	
				
				
				
				
      			con.close();			
		}
}