import java.sql.*;
public class Driver {

	
	public static void post() {

		try {
			final int id  = 7;
			final String var1 ="Fredrik";
			final String var2 = "Nordstad";
			final String epost = "fredrikdn@gmail.com";
			Connection myconn1 = DriverManager.getConnection("jdhc:mysql://localhost:3306/tdt4145prosjekt", "pertest", "test");
			PreparedStatement statement = myconn1.prepareStatement("INSERT INTO employee(id, last_name, first_name, email) VALUES ('"+id+"', '"+var1+"', '"+var2+", '"+epost+"')" );
			System.out.println(statement);
			statement.executeUpdate();
		}
		
		
		catch(Exception e){
			System.out.println(e.getStackTrace());
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		//post();
		
		final int id  = 7;
		final String var1 ="Fredrik";
		final String var2 = "Nordstad";
		final String epost = "fredrikdn";
		try {
			
			//Get connection to database
			Connection myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tdt4145prosjekt", "pertest", "test");
			
			//Create a statement
			Statement myStatement = myconn.createStatement();
			//Statement newStatement = myconn.createStatement();
			//Excecute sql Query
			ResultSet res = myStatement.executeQuery("select * from apparat");
			//PreparedStatement statement = myconn.prepareStatement("INSERT INTO employee(id, last_name, first_name, email) VALUES ('"+id+"', '"+var1+"', '"+var2+", '"+epost+"')" );
			//ResultSet test  = newStatement.executeQuery("")
			//statement.executeUpdate();
			//Process the rusult set
			while(res.next()) {
				System.out.println(res.getString("apparatID") + ", " +  res.getString("navn") + ", " +  res.getString("beskrivelse"));
			}
		}
		catch(Exception e){
			e.printStackTrace();
			
		}

	}

}
