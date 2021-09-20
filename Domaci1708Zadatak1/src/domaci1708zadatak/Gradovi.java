package domaci1708zadatak;

import java.util.Scanner;

public class Gradovi {

	public static void main(String[] args) {
		boolean nastavi = true;
		do {
			String drzava;
			int izbor;
			String glavniGrad;
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Opcije su:");
			System.out.println("1. Francuska");
			System.out.println("2. Italija");
			System.out.println("3. Srbija");
			System.out.println("4. Izlaz");
			
			izbor = s.nextInt();
		
			
			switch(izbor) {
			case 1: {
				System.out.println("Koji je glavni grad drzave Francuska");
				System.out.println("Unesite svoj odgovor");
				glavniGrad = s.next();
				if(glavniGrad.equals("Pariz")) {
					System.out.println("Odgovor je tacan");
				}
				else {
					System.out.println("Odgovor je netacan");
				}
				break;
			}
			case 2: {
				System.out.println("Koji je glavni grad drzave Italija");
				System.out.println("Unesite svoj odgovor");
				glavniGrad = s.next();
				if(glavniGrad.equals("Rim")) {
					System.out.println("Odgovor je tacan");
				}
				else {
					System.out.println("Odgovor je netacan");
				}
				break;
			}
			case 3: {
				System.out.println("Koji je glavni grad drzave Srbija");
				System.out.println("Unesite svoj odgovor");
				glavniGrad = s.next();
				if(glavniGrad.equals("Beograd")) {
					System.out.println("Odgovor je tacan");
				}
				else {
					System.out.println("Odgovor je netacan");
				}
				break;
			}
			case 4: {
				nastavi = false;
				break;
			}
			}
		} while(nastavi);
	}
}
