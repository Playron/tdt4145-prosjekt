package core;

public class Friovelse extends Ovelse {
	private String beskrivelse;

	public Friovelse(String beskrivelse, String navn) {
		super(navn);
		setBeskrivelse(beskrivelse);
	}

	public void setBeskrivelse(String beskrivelse) {
		this.beskrivelse = beskrivelse;
	}

	public String getBeskrivelse() {
		this.beskrivelse = getStringFromDB("beskrivelse");
		return beskrivelse;
	}

}
