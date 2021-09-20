package domaci;
import java.util.ArrayList;
public class Autobus {
	private String naziv;
	private Vozac vozac;
	private int cenaKarte;
	private ArrayList<Putnik> putnici;
	
	public Autobus (String naziv, int cenaKarte) 	{
		this.naziv=naziv;
		this.cenaKarte=cenaKarte;
		putnici= new ArrayList<Putnik> ();
	}
	public Vozac getVozac() {
		return vozac;
	}

	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	
	}
	public void dodajPutnika (Putnik p) {
	
		if (vozac==null) {System.out.println("Nije moguce naplatiti kartu");
		}
		else {
			p.oduzmiNovac(cenaKarte);
			putnici.add(p);
			System.out.println("Uspesna transakcija");
		}
		
	}
	public void oduzmiPutnika(Putnik p) {
		putnici.remove(p);
	}
	public void oduzmiVozaca () {
		vozac=null;
	}
	public void pisi() {
		System.out.println("Autobus " + naziv + " sa vozacem " );
		vozac.pisi();
		for (int i=0; i<putnici.size(); i++) {
			putnici.get(i).pisi();
			
		}
	}
}
