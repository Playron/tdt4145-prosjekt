package core;
import java.sql.*;
import java.util.Scanner;
public class Driver {
	
	static String database = "jdbc:mysql://localhost:3306/tdt4145prosjekt";
	
	
	public static void main(String[] args) {
		
		
		try {
			leggTilApparat();
			//Get connection to database
			Connection myconn = DriverManager.getConnection(database, "pertest", "test");
			
			//Create a statement
			
			Statement myStatement = myconn.createStatement();
			
			//Statement newStatement = myconn.createStatement();
			
			//Excecute sql Query
			
			ResultSet res = myStatement.executeQuery("select * from apparat");
			
			//PreparedStatement statement = myconn.prepareStatement("INSERT INTO employee(id, last_name, first_name, email) VALUES ('"+id+"', '"+var1+"', '"+var2+", '"+epost+"')" );
			
			//ResultSet test  = newStatement.executeQuery("")
			
			//statement.executeUpdate();
			
			//Process the result set
			
			while(res.next()) {
				System.out.println("Apparat-ID: " + res.getString("apparatID") + ", " + "Apparat-navn: " +  res.getString("navn") + ", Apparat-beskrivelse: " +  res.getString("beskrivelse"));
			}
		}
		catch(Exception e){
			e.printStackTrace();
			
		}

	}
	
	public static void leggTilApparat() throws SQLException {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Skriv inn ApparatID: ");
		System.out.println();
		int ID = scanner.nextInt();
		System.out.println("Skriv inn Apparat-Navn: ");
		System.out.println();
		String apparat = scanner.next();
		System.out.println("Skriv inn Apparat-beskrivelse: ");
		System.out.println();
		String beskrivelse = scanner.next();
		
		System.out.println("Connecting to a selected database...");
		Connection myconn = DriverManager.getConnection(database, "pertest", "test");
		System.out.println("Connected database successfully...");
		
		
		PreparedStatement stmt = myconn.prepareStatement("INSERT into apparat(apparatID, navn, beskrivelse) VALUES(?,?,?)");
		
		stmt.setInt(1, ID);
		stmt.setString(2, apparat);
		stmt.setString(3, beskrivelse);
		
		System.out.println("Trying to insert Apparat");
		
		stmt.executeUpdate();
		
	}
	
	
	
}

