package zooloskiVrt;

import java.util.ArrayList;

public class Staniste {
	private String naziv;
	private ArrayList<Zivotinja> staniste;
	
	public Staniste(String naziv){
		naziv = this.naziv;
		staniste = new ArrayList<Zivotinja>();
	}
	
	public void dodajZivotinju(Zivotinja zivotinja) {
		staniste.add(zivotinja);
	}

	public String getNaziv() {
		return naziv;
	}
	
	void ispis() {
		for (int i=0; i<staniste.size(); i++) {
			staniste.get(i).ispis();
		}
	}
}
