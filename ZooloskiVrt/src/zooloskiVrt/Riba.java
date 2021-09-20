package zooloskiVrt;

public class Riba extends Zivotinja {
	private String mestoObitavanja;
	private int brojPeraja;
	private String vrstaPeraja;
	
	public Riba(String naziv, String ishrana, int brojPeraja, String vrstaPeraja, String mestoObitavanja) {
		super("kicmenjaci", naziv, ishrana);
		this.brojPeraja = brojPeraja;
		this.vrstaPeraja = vrstaPeraja;
		this.mestoObitavanja = mestoObitavanja;
	}

	public String getMestoObitavanja() {
		return mestoObitavanja;
	}

	public int getBrojPeraja() {
		return brojPeraja;
	}

	public String getVrstaPeraja() {
		return vrstaPeraja;
	}
	
	void ispis() {
		super.ispis();
		System.out.println(this.mestoObitavanja + " broj peraja: "+ this.brojPeraja + " vrsta peraja: " + this.vrstaPeraja );
	}	
}
