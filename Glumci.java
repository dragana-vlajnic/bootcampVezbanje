package projekat1;

public class Glumci {
	public String ime;
	public String prezime;
	public int godinaRodjena;
	public String pol;
	
	private boolean bracniStatus;
	private int prosecnaZaradaPoFilmu;
	private int brojSnimljenihFilmova;
	
	
	public Glumci (){
	}
	
	public Glumci (String ime, String prezime, int godinaRodjena, String pol){
		this.ime = ime;
		this.prezime = prezime;
		this.godinaRodjena = godinaRodjena;
		this.pol = pol;
		}
	
	//getter
	public boolean getBracniStatus() {
		return bracniStatus;
	}
	
	public int getProsecnaZaradaPoFilmu() {
		return prosecnaZaradaPoFilmu;
	}
	
	public int getBrojSnimljenihFilmova() {
		return brojSnimljenihFilmova;
	}
	
	//setter
	public void setBracniStatus(boolean bracniStatus) {
		this.bracniStatus = bracniStatus;
	}
	
	public void setProsecnaZaradaPoFilmu(int prosecnaZaradaPoFilmu) {
		this.prosecnaZaradaPoFilmu = prosecnaZaradaPoFilmu;
	}
	
	public void setBrojSnimljenihFilmova(int brojSnimljenihFilmova) {
		this.brojSnimljenihFilmova = brojSnimljenihFilmova;
	}
	
	public int ukupnaZarada() {
		return this.getBrojSnimljenihFilmova() * this.getProsecnaZaradaPoFilmu();
	}
	
	public int starost () {
		return 2022 - this.godinaRodjena;
	}
	
	public String titula(String pol) {
		if (pol.equals("z")) return "Mrs.";
		else return "Mr.";
	}
	
	public void stampanje () {
		System.out.println(this.titula(pol) + " " + ime + " " + prezime + " " + godinaRodjena + " " + pol);
	}
}
