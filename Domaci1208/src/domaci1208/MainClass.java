package domaci1208;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		String ime;
		String prezime;
		char pol;
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Unesite ime");
		ime = s.next();
		System.out.println("Unesite prezime");
		prezime = s.next();
		System.out.println("Unesite pol");
		pol = s.next().charAt(0);
		
		System.out.println("Ime je: " + ime + ", prezime je: " + prezime + ", pol je: " + pol);
		int zlatnihMedalja;
		int ukupnoMedalja;
		System.out.println("Broj zlatnih medalja je: ");
		zlatnihMedalja = s.nextInt();
		System.out.println("Ukupan broj medalja je: ");
		ukupnoMedalja = s.nextInt();
		System.out.println("Ukupan broj medalja je: " + ((double)zlatnihMedalja/ukupnoMedalja * 100));
	}
}
