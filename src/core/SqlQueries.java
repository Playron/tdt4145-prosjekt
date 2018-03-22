package core;

import java.sql.*;
import java.util.ArrayList;

public class SqlQueries {

	// Metode for å sende SQL query til databasen
	public void pushToDB(String sql) throws SQLException {
		// 1. Get connection and statement from DatabaseConnection.java
		DatabaseConnection myConn = new DatabaseConnection();
		myConn.establishConnection();
		// 3. Execute SQL query
		myConn.establishConnection().executeUpdate(sql);
	}

	// Metode for å hente data fra databasen, dataen blir returnert som et ResultSet
	public ResultSet retrieveFromDB(String query) throws Exception {
		// 1. Get connection and statement from DatabaseConnection.java
		DatabaseConnection myConn = new DatabaseConnection();
		myConn.establishConnection();
		// 1. Execute SQL query
		ResultSet myRs = myConn.establishConnection().executeQuery(query);
		return myRs;
	}

	public Array getArrayFromColumnNameInDB(String desierdData) throws Exception {

		ResultSet rs = retrieveFromDB(desierdData);
		return rs.getArray(desierdData);

	}

	public ArrayList<String> convertArrayToArrayListWithString(Array arrayOfStrings) throws SQLException {

		return (ArrayList<String>) arrayOfStrings.getArray();

	}

	public ArrayList<Integer> convertArrayToArrayListWithIntegers(Array arrayOfIntegers) throws SQLException {

		return (ArrayList<Integer>) arrayOfIntegers.getArray();

	}

	public ArrayList<String> getArrayListOfStringsFromColomnInDB(String queryForOneColomnOfStrings) throws Exception {
		Array a = getArrayFromColumnNameInDB(queryForOneColomnOfStrings);
		ArrayList<String> al = convertArrayToArrayListWithString(a);
		return al;
	}

	public ArrayList<Integer> getArrayListOfIntegersFromColomnInDB(String queryForOneColomnOfIntegers)
			throws Exception {
		Array a = getArrayFromColumnNameInDB(queryForOneColomnOfIntegers);
		ArrayList<Integer> al = convertArrayToArrayListWithIntegers(a);
		return al;
	}
	public String getStringFromDB(String DBcolumnName) throws Exception {
		String sql = "SELECT "+DBcolumnName+" FROM simeba_pu_gr7.Profile WHERE UserName = '"+this.username+"';";
		String value = "Not initialised";
		ResultSet myRs = query.retrieveFromDB(sql);
		while(myRs.next()) {
			value = myRs.getString(1);
		}
		return value;
	}
	public int getIntFromDB(String DBcolumnName) throws Exception {
		String sql = "SELECT "+DBcolumnName+" FROM simeba_pu_gr7.Profile WHERE UserName = '"+this.username+"';";
		int value = 0;
		ResultSet myRs = query.retrieveFromDB(sql);
		while(myRs.next()) {
			value = myRs.getInt(1);
		}
		return value;
	}

}
