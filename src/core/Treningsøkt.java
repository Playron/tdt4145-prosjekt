package core;

import java.sql.Date;
import java.sql.Time;


public class Trenings�kt {
	
//	private int trenings�ktID;
	private Date dato;
	private Time tid;
	private int varighet;
	private int prestasjon;
	private String notat;
	
//	public void setTrenings�ktID(int trenings�ktID) {
//		this.trenings�ktID = trenings�ktID;
//	}
//	public int getTrenings�ktID() {
//		return trenings�ktID;
//	}
	public void setDato(Date dato) {
		this.dato = dato;
	}
	public Date getDato() {
		return dato;
	}
	public void setTid(Time tid) {
		this.tid = tid;
	}
	public Time getTid() {
		return tid;
	}
	public void setVarighet(int varighet) {
		this.varighet = varighet;
	}
	public int getVarighet() {
		return varighet;
	}
	public void setPrestasjon(int prestasjon) {
		this.prestasjon = prestasjon;
	}
	public int getPrestasjon() {
		return prestasjon;
	}
	public void setNotat(String notat) {
		this.notat = notat;
	}
	public String getNotat() {
		return notat;
	}
}
