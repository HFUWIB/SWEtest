package Übung4;

import java.util.*;
class Student{
	int matrikelnr;
	String vorname;
	String nachname;

	ArrayList<Kurs> Kurse;

	public int getMatrikelnr(){
		return matrikelnr;
	}

	public void setMatrikelnr(int matrikelnr){
		this.matrikelnr = matrikelnr;
	}

	public String getVorname(){
		return vorname;
	}

	public void setVorname(String vorname){
		this.vorname = vorname;
	}

	public String getNachname(){
		return nachname;
	}

	public void setNachname(String nachname){
		this.nachname = nachname;
	}
	public ArrayList<Kurs> getKurse(){
		return Kurse;
	}

	public void setKurse(ArrayList<Kurs> Kurse){
		this.Kurse = Kurse;
	}

}
