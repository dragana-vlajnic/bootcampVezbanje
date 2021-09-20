package domaci;

public class Vozac extends Covek {
	
	private String zanimanje;
	
	public Vozac(String ime, String prezime, String zanimanje) {
		super(ime, prezime);
		this.zanimanje = zanimanje;
	}
	public void pisi() {
		System.out.println(this.getIme() + " "+ this.getPrezime());
	}
}
