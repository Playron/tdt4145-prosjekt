package core;

public class Øvelsegruppe {
	
//	private int øvelsesgruppeID;
	private String navn;
	
	public void setØvelsegruppe(String navn){
		setNavn(navn);
		
	}
//	public void setØvelsesgruppeID(int øvelsesgruppeID) {
//		this.øvelsesgruppeID = øvelsesgruppeID;
//	}
//	public int getØvelsesgruppeID() {
//		return øvelsesgruppeID;
//	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public String getNavn() {
		return navn;
	}

}
