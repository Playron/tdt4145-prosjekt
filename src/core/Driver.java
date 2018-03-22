package core;
import java.sql.*;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Driver {
	
	static String database = "jdbc:mysql://localhost:3306/tdt4145prosjekt";
	
	

		
		
		public static Connection getConnection() throws SQLException {
			String url = "jdbc:mysql://mysql.stud.ntnu.no:3306/fredridn_gr33?autoReconnect=true&useSSL=false";
			String user = "fredridn";
			String password = "gr33";
			Connection myConn = DriverManager.getConnection(url, user, password);
			return myConn;
		}
		// Her etableres koblingen til v�r eksterne database.

		public Statement establishConnection() {
			try {
				String url = "jdbc:mysql://mysql.stud.ntnu.no:3306/fredridn_gr33?autoReconnect=true&useSSL=false";
				String user = "fredridn";
				String password = "gr33";

				Connection myConn = DriverManager.getConnection(url, user, password);

				Statement myStmt = myConn.createStatement();

				return myStmt;
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}

		public PreparedStatement preparedStatementEstablishConnection() {
			try {
				String url = "jdbc:mysql://mysql.stud.ntnu.no:3306/fredridn_gr33?autoReconnect=true&useSSL=false";
				String user = "fredridn";
				String password = "gr33";
				Connection conn = DriverManager.getConnection(url, user, password);

				PreparedStatement myStmt = (PreparedStatement) conn.createStatement();

				return myStmt;
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}
		public static void main(String[] args) {
		try {
			//leggTilApparat();
			leggTilOvelse();
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
	
	public static void leggTilOvelse() throws SQLException, ParseException {
		Scanner scanner = new Scanner(System.in);
		Connection myconn = DriverManager.getConnection(database, "pertest", "test");
		System.out.println("Connecting to Database:" + myconn.getCatalog() + "......");
		System.out.println("Connection is established!");
		
		System.out.println("Skriv inn treningsOktID: ");
		int treningsOktID = scanner.nextInt();
		
		
		//Date startDate = Date.getDate();
		DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Skriv inn Dato: (Form: yyyy-MM-dd) ");
		
		
		System.out.println("Skriv inn varighet: ");
		int varighet = scanner.nextInt();
		System.out.println("Skriv inn prestasjon: ");
		int prestasjon = scanner.nextInt();
		System.out.println("Skriv inn notat: ");
		String notat = scanner.next();
		
		
		
		PreparedStatement stmt = myconn.prepareStatement("INSERT INTO treningsøkt(treningsøktid, dato, tidspunkt, varighet, prestasjon, notat) VALUES(?,?,SYSDATE,?,?,?)");
		stmt.setInt(1, treningsOktID);
		stmt.setDate(2, sql);
		stmt.setInt(4, varighet);
		stmt.setInt(5, prestasjon);
		stmt.setString(7, notat);
		
		
	}
	
	
	
}

