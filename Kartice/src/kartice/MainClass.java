package kartice;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		VisaKartica v1 = new VisaKartica(11, 2024, "7100-1560-5924-6184");
		v1.setIme("Dragana");
		v1.setPrezime("Vlajnic");
		v1.dodajSredstva(2000);
		v1.izvrsiTransakciju(20);
		System.out.println(v1.getIme() + " " + v1.getPrezime());
		v1.stampanje();
		
		System.out.println();
		
		MasterKartica m1 = new MasterKartica(12, 2024, "7200-1234-7898-1000");
		m1.dodajSredstva(1800);
		m1.izvrsiTransakciju(400);
		m1.stampanje();		
	}

}
