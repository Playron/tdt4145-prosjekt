package core;
import java.sql.*;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		System.out.println(myconn.getCatalog());
		
		
		PreparedStatement stmt = myconn.prepareStatement("INSERT into apparat(apparatID, navn, beskrivelse) VALUES(?,?,?)");
		
		stmt.setInt(1, ID);
		stmt.setString(2, apparat);
		stmt.setString(3, beskrivelse);
		
		System.out.println("Trying to insert Apparat");
		
		stmt.executeUpdate();
		
	}
	
	public void leggTilØvelse() throws SQLException, ParseException {
		Scanner scanner = new Scanner(System.in);
		Connection myconn = DriverManager.getConnection(database, "pertest", "test");
		System.out.println("Connecting to Database:" + myconn.getCatalog() + "......");
		System.out.println("Connection is established!");
		
		System.out.println("Skriv inn treningsøktID: ");
		int treningsøktID = scanner.nextInt();
		
		
		
		SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd");
		System.out.println("Skriv inn Dato: (Form: yyyyMMdd) ");
		Date parsed = (Date) date.parse(scanner.next());
		java.sql.Date sql = new java.sql.Date(parsed.getTime());
		
		
		
		System.out.println("Skriv inn tidspunkt: ");
		System.out.println("Skriv inn varighet: ");
		System.out.println("Skriv inn prestasjon: ");
		System.out.println("Skriv inn notat: ");
		
		
		
		PreparedStatement stmt = myconn.prepareStatement("INSERT INTO treningsøkt(treningsøktid, dato, tidspunkt, varighet, prestasjon, notat) VALUES(?,?,?,?,?,?)");
		stmt.setInt(1, treningsøktID);
		stmt.setDate(2, sql);
		
		
		
	}
	
	
	
}

