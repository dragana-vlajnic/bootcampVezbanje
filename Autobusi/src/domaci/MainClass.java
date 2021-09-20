package domaci;

public class MainClass {

	public static void main(String[] args) {
		Putnik p1=new Putnik("Dragana", "Vlajnic", 5000);
		Vozac v1= new Vozac("Pera", "Peric", "vozac");
		Autobus a1= new Autobus("Lasta", 3000);
		
		a1.setVozac(v1);
		a1.dodajPutnika(p1);
		a1.pisi();
	}
}
