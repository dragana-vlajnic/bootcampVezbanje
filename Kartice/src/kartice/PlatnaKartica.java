package kartice;

public class PlatnaKartica {
	private int mesec;
	private int godina;
	protected String brojKartice;
	protected double suma;
	
	public PlatnaKartica(int mesec, int godina, String brojKartice) {
		this.mesec = mesec;
		this.godina = godina;
		this.brojKartice = brojKartice;
		this.suma = 0;
	}
	
	public int getMesec() {
		return mesec;
	}

	public int getGodina() {
		return godina;
	}

	public String getBrojKartice() {
		return brojKartice;
	}

	public double getSuma() {
		return suma;
	}
	
	public void dodajSredstva(double suma) {
		this.suma += suma;
	}
	
	public void izvrsiTransakciju(double suma) {
		this.suma -= suma;
	}
	
	public void stampanje() {
		System.out.print(this.brojKartice + ", " + this.mesec + "/" + this.godina + ", $" + this.suma );
	}
	
}
