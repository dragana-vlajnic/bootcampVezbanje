package domaci2308zadatak3;

import java.util.Scanner;



public class MainClass {
	
	// 1. Prvi zadatak
	public static int najveciBroj(int a, int b, int c) {
		if(a < b) {
			if(b < c) {
				return c;
			}
			else {
				return b;
			}
		}
		else {
			if (a < c) {
				return c;
			}
			else {
				return a;
			}
		}
	}
	
	public static int zbir(int a, int b, int c) {
		return a+b+c;
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
		
		System.out.println("Najveci broj je: " + najveciBroj(a, b, c));
		System.out.println("Zbir brojeva je: " + zbir(a, b, c));

		s.close();
	}

}
