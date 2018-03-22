package core;

import java.sql.Date;

public class Maaltid {
	private Date dato;

	public Date getDato() {
		this.dato = getIntegerFromDB("dato");
		return dato;
	}

	public void setDato(Date dato) {
		this.dato = dato;
	}
	

}
