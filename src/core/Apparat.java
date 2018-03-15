package core;

public class Apparat {
	// private int apparatID;
	private String navn;
	private String beskrivelse;

	public Apparat(String navn, String beskrivelse) {
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
		return navn;
	}

	public void setBeskrivelse(String beskrivelse) {
		this.beskrivelse = beskrivelse;
	}

	public String getBeskrivelse() {
		return beskrivelse;
	}

}
