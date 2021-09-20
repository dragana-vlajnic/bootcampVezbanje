package domaci2008zadatak;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		String[] gradovi;
		Scanner s = new Scanner(System.in);
		gradovi = new String[5];
		
		for (int i = 0; i<5; i++) {
			gradovi[i] = s.nextLine();
		}
		
		for (int i=1; i<4; i++) {
			System.out.println(i + "." + gradovi[i]);
		}
				
		gradovi[0] = "Lisabon";
		gradovi[1] = "London";
		gradovi[2] = "Helsinki";
		gradovi[3] = "Prag";
		gradovi[4] = "Madrid";
		
		int i=0;
		while (!(gradovi[i].equals("Prag"))) {
			System.out.println(i + ". " + gradovi[i]);
			i++;
		}
	}

}
