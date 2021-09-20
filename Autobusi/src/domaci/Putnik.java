package domaci;

public class Putnik extends Covek {
	
	private int novac;
	
	public Putnik (String ime, String prezime, int novac) {
		super (ime, prezime);
		this.novac=novac;
		
	}
	
	public void pisi() {
		System.out.println(this.getIme() + " " + this.getPrezime() + " " + this.novac);
	}
	public void dodajNovac(int kolicina) {
		novac=novac+kolicina;
	
	}
	public void oduzmiNovac(int oduzmi) {
		
		if (novac<oduzmi) {
			System.out.println("Nemate dovoljno novca na racunu");
		}
		else {
			novac=novac-oduzmi;
			System.out.println("Uspesna transakcija");
		}
	}
	

}
