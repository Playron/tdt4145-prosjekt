package core;

public class OvelseIOkt {
	private Ovelse ovelse;
	private int reps;
	private int set;
	private int kilo;

	public Ovelse getOvelse() {
		this.ovelse = getStringFromDB("ovelse");
		return ovelse;
	}

	public void setOvelse(Ovelse ovelse) {
		this.ovelse = ovelse;
	}

	public int getReps() {
		this.reps = getStringFromDB("reps");
		return reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}

	public int getSet() {
		this.set = getStringFromDB("set");
		return set;
	}

	public void setSet(int set) {
		this.set = set;
	}

	public int getKilo() {
		this.kilo = getStringFromDB("kilo");
		return kilo;
	}

	public void setKilo(int kilo) {
		this.kilo = kilo;
	}

}
