package domaci1608zadatak3;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int broj;
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj:");
		broj = s.nextInt();
		
		while(broj > 0) {
			System.out.println("Laku noc!");
			broj--;
		}

	}

}
