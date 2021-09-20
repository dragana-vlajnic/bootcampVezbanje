package kartice;

public class VisaKartica extends PlatnaKartica {
	private String ime;
	private String prezime;

	public VisaKartica(int mesec, int godina, String brojKartice) {
		super(mesec, godina, brojKartice);
		// TODO Auto-generated constructor stub
	}
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public void izvrsiTransakciju(double suma) {
		double provizija;
		if (1.8/100 * suma < 4) {
			provizija = 4;
		}
		else {
			provizija = suma*1.8/100;
		}
		this.suma = this.suma - suma - provizija;
	}
	
	public void stampanje() {
		System.out.print("Visa card: ");
		super.stampanje();
	}

}
