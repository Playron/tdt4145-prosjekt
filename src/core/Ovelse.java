package core;

public class Ovelse {

	// private int OvelseID;
	private String navn;

	public Ovelse(String navn) {
		setNavn(navn);
	}

	// public void setOvelseID(int ovelseID) {
	// OvelseID = ovelseID;
	// }
	// public int getOvelseID() {
	// return OvelseID;
	// }
	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getNavn() {
		return navn;
	}
}
