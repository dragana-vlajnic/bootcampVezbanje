package kartice;

public class MasterKartica extends PlatnaKartica {

	public MasterKartica(int mesec, int godina, String brojKartice) {
		super(mesec, godina, brojKartice);
		// TODO Auto-generated constructor stub
	}
		
	public void izvrsiTransakciju(double suma) {
		double provizija = suma*1.5/100;
		this.suma = this.suma - suma - provizija;
	}
	
	void odrzavanjeRacuna() {
		suma -= 2;
	}
	
	public void stampanje() {
		System.out.print("Master card: ");
		super.stampanje();
	}

}
