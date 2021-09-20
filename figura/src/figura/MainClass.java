package figura;
import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<Figura> list = new ArrayList<Figura>();
		double povrsina = 0;
		double obim = 0;
		
		Trougao t1 = new Trougao(10);
		Trougao t2 = new Trougao(15);
		Trougao t3 = new Trougao(20);
		Pravougaonik p1 = new Pravougaonik(5, 10);
		Pravougaonik p2 = new Pravougaonik(10, 20);
		Kvadrat k1 = new Kvadrat(4);
		Kvadrat k2 = new Kvadrat(8);
		Kvadrat k3 = new Kvadrat(12);
		Kvadrat k4 = new Kvadrat (20);
		
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(p1);
		list.add(p2);
		list.add(k1);
		list.add(k2);
		list.add(k3);
		list.add(k4);
		
		for (int i=0; i<list.size(); i++)
		{
			povrsina += list.get(i).povrsina();
			obim += list.get(i).obim();
		}
		
		System.out.println("Suma svih povrsina je " + povrsina);
		System.out.println("Suma svih obima je " + obim);
		
	}

}
