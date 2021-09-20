package domaci1908zadatak3;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int broj;
		Scanner s = new Scanner(System.in);
		broj = s.nextInt();
		
		for (int i=0; i<broj; i++) {
			for (int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
