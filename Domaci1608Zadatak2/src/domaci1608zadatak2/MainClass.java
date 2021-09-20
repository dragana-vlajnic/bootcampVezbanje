package domaci1608zadatak2;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int broj = 0;
		int suma = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj:");
		broj = s.nextInt();
		while(broj >= 0) {
			suma = suma + broj;
			System.out.println("Unesite broj:");
			broj = s.nextInt();
		}
		System.out.println("Rezultat je: " + suma);
	}
}
