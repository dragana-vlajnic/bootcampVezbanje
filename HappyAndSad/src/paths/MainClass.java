package paths;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Path happy = new HappyPath("username", "password");
		Path sad = new SadPath("username", "password");
		Scanner s = new Scanner(System.in);
		
		happy.path();
		sad.path();
	}

}
