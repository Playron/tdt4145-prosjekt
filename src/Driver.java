import java.sql.*;
public class Driver {

	public static void main(String[] args) {
		
		
		try {
			
			//Get connection to database
			Connection myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tdt4145prosjekt", "tdt4145prosjekt", "smud");
			
			//Create a statement
			Statement myStatement = myconn.createStatement();
			//Excecute sql Query
			ResultSet res = myStatement.executeQuery("select * from employee");
			//Process the rusult set
			while(res.next()) {
				System.out.println(res.getString("id") + ", " +  res.getString("last_name") + ", " +  res.getString("first_name"));
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
			
		}

	}

}
