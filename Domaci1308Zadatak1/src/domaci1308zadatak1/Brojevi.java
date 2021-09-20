package domaci1308zadatak1;
import java.util.Scanner;

public class Brojevi {
	public static void main(String[] args) {
		int broj;
		double rezultat;
		Scanner s = new Scanner(System.in);
		
		broj = s.nextInt();
		rezultat = broj;
		
		if(broj < 10) {
			rezultat = broj * 100;
		}
		else if (broj > 100) {
			rezultat = (double)broj / 10;
		}
		
		System.out.println("Rezultat je: " + rezultat);
		System.out.println("Broj koji smo koristili da proverimo program je: " + broj);
	}
}
