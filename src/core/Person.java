package core;

public class Person {

	// private int profilID;
	private String navn;
	private int vekt;
	private int hvilepuls;
	private int personligForm;

	public Person(String navn, int vekt, int hvilepuls, int personligForm) {
		setNavn(navn);
		setVekt(vekt);
		setHvilepuls(hvilepuls);
		setPersonligForm(personligForm);
	}

	// public void setProfilID(int profilID) {
	// this.profilID = profilID;
	// }
	// public int getProfilID() {
	// return profilID;
	// }

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getNavn() {
		return navn;
	}

	public int getVekt() {
		return vekt;
	}

	public void setVekt(int vekt) {
		this.vekt = vekt;
	}

	public void setHvilepuls(int hvilepuls) {
		this.hvilepuls = hvilepuls;
	}

	public int getHvilepuls() {
		return hvilepuls;
	}

	public void setPersonligForm(int personligForm) {
		this.personligForm = personligForm;
	}

	public int getPersonligForm() {
		return personligForm;
	}
}
