package zooloskiVrt;

public class MainClass {

	public static void main(String[] args) {
		Riba r = new Riba("saran", "biljojed", 10 , "ledjno", "reka");
		Sisari s = new Sisari("braon", "pas", "svastojed", "domaca");
		
		Sisari s2 = new Sisari("braon", "macka", "mesojed", "domaca");
		
		s2.setDomacaIliDivlja("divlja");
		
		Staniste divljina = new Staniste("divljina");
		divljina.dodajZivotinju(r);
		divljina.dodajZivotinju(s2);
		divljina.ispis();
		
		r.ispis();
		s.ispis();
	}

}
