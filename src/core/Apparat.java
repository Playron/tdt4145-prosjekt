package core;

import java.sql.ResultSet;

public class Apparat {
	// private int apparatID;
	private String navn;
	private String beskrivelse;
	SqlQueries sql = new SqlQueries();

	public Apparat(String navn, String beskrivelse) {
		String guery = "INSERT INTO `simeba_pu_gr7`.`Apparat` (`navn`, `beskrivelse`) values ('" + navn + "', '"
				+ beskrivelse + "');";

		sql.query.pushToDB(sql);
		setNavn(navn);
		setBeskrivelse(beskrivelse);
	}

	// public void setApparatID(int apparatID) {
	// this.apparatID = apparatID;
	// }
	// public int getApparatID() {
	// return apparatID;
	// }
	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getNavn() {
		this.navn = getStringFromDB("navn");
		return navn;
	}

	public void setBeskrivelse(String beskrivelse) {
		this.beskrivelse = beskrivelse;
	}

	public String getBeskrivelse() {
		this.beskrivelse = getStringFromDB("beskrivelse");
		return beskrivelse;
	}

}
