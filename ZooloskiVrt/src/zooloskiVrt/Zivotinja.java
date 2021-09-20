package zooloskiVrt;

public abstract class Zivotinja {
	protected String vrsta;
	protected String naziv;
	protected String ishrana;
	
	Zivotinja(String vrsta, String naziv, String ishrana) {
		this.vrsta = vrsta;
		this.naziv = naziv;
		this.ishrana = ishrana;
	}

	public String getVrsta() {
		return vrsta;
	}

	public String getNaziv() {
		return naziv;
	}

	public String getIshrana() {
		return ishrana;
	}
	
	void ispis() { 
		System.out.println(vrsta + "-" + naziv + "-" + ishrana);
	}
}
