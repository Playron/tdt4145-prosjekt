package core;

public class Ovelsegruppe {

	// private int ovelsesgruppeID;
	private String navn;

	public Ovelsegruppe(String navn) {
		setNavn(navn);

	}

	// public void setOvelsesgruppeID(int øvelsesgruppeID) {
	// this.ovelsesgruppeID = ovelsesgruppeID;
	// }
	// public int getOvelsesgruppeID() {
	// return ovelsesgruppeID;
	// }
	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getNavn() {
		return navn;
	}

}
