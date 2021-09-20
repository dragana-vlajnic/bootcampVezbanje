package domaci2308zadatak2;

import java.util.Scanner;

public class MainClass {
	
	public static int proizvod(int a, int b, int c) {
		return a*b*c;
	}

	public static void main(String[] args) {
		int a = 0, b=0, c=0;
		Scanner s = new Scanner(System.in);
		
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		System.out.println("a je: " + a);
		System.out.println("b je: " + b);
		System.out.println("c je: " + c);
		
		System.out.println("Proizvod brojeva je: " + proizvod(a, b, c));
		
		s.close();
	}
}
