package domaci1908zadatak1;

import java.util.Scanner;
import java.util.ArrayList;
public class MainClass {

	public static void main(String[] args) {
		int broj;
		int suma = 0;
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		
		Scanner s = new Scanner(System.in);
		broj = s.nextInt();
		if(broj < 0) {
			System.out.println("Suma je: " + suma);	
		}
		else {
			do {
				brojevi.add(broj);
				suma = suma + broj;
				broj = s.nextInt();
				} while (broj >= 0);
		}
		System.out.println("Suma je: " + suma);
		System.out.println("Uneti brojevi su: ");
		for (int i = 0; i<brojevi.size(); i++) {
			System.out.println(brojevi.get(i));
		}
		
					
	}

}
