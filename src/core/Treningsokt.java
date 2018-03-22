package core;

import java.sql.Date;
import java.sql.Time;

public class Treningsokt {

	// private int treningsøktID;
	private Date dato;
	private Time tid;
	private int varighet;
	private int prestasjon;
	private String notat;

	public Treningsokt(Date dato, Time tid, int varighet, int prestasjon, String notat) {
		setDato(dato);
		setNotat(notat);
		setPrestasjon(prestasjon);
		setTid(tid);
		setVarighet(varighet);

	}

	// public void setTreningsoktID(int treningsoktID) {
	// this.treningsoktID = treningsoktID;
	// }
	// public int getTreningsoktID() {
	// return treningsoktID;
	// }
	public void setDato(Date dato) {
		this.dato = dato;
	}

	public Date getDato() {
		this.dato = getIntegerFromDB("dato");
		return dato;
	}

	public void setTid(Time tid) {
		this.tid = tid;
	}

	public Time getTid() {
		this.tid = getIntegerFromDB("tid");
		return tid;
	}

	public void setVarighet(int varighet) {
		this.varighet = varighet;
	}

	public int getVarighet() {
		this.varighet = getIntegerFromDB("varighet");
		return varighet;
	}

	public void setPrestasjon(int prestasjon) {
		this.prestasjon = prestasjon;
	}

	public int getPrestasjon() {
		this.prestasjon = getIntegerFromDB("prestasjon");
		return prestasjon;
	}

	public void setNotat(String notat) {
		this.notat = getIntegerFromDB("notat");
		this.notat = notat;
	}

	public String getNotat() {
		this.notat = getStringFromDB("notat");
		return notat;
	}
}
