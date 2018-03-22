package core;

public class Matprodukt {

	private int matProduktID;
	private String navn;
	private int karbohydrat;
	private int fett;
	private int protein;
	private int kalori;
	
	public int getAntallCheeseBurgereIProdukt(int kalori) {
		int antallCheeseburger = kalori/300;
		return antallCheeseburger;
	}
	
	public void setKalori(int karbohydrat, int fett, int protein) {
		this.kalori = karbohydrat*4 + fett*9 + protein*4;

	}
	public int getKalori() {
		this.kalori = getIntegerFromDB("kalori");
		return kalori;
	}

	public int getMatProduktID() {
		this.matProduktID = getIntegerFromDB("matproduktid");
		return matProduktID;
	}

	public void setMatProduktID(int matProduktID) {
		this.matProduktID = matProduktID;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getKarbohydrat() {
		this.karbohydrat = getIntegerFromDB("karbohydrat");
		return karbohydrat;
	}

	public void setKarbohydrat(int karbohydrat) {
		this.karbohydrat = karbohydrat;
	}

	public int getFett() {
		this.fett = getIntegerFromDB("fett");
		return fett;
	}

	public void setFett(int fett) {
		this.fett = fett;
	}

	public int getProtein() {
		this.protein = getIntegerFromDB("protein");
		return protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

}
