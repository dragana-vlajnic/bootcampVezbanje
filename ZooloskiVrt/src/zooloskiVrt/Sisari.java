package zooloskiVrt;

public class Sisari extends Zivotinja {
	String bojaDlake;
	String domacaIliDivlja;
	
	
	Sisari(String bojaDlake, String naziv, String ishrana, String domacaIliDivlja) {
		super("kicmenjaci", naziv, ishrana);
		this.bojaDlake=bojaDlake;
		this.domacaIliDivlja = domacaIliDivlja;
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public String getDomacaIliDivlja() {
		return domacaIliDivlja;
	}
	
	public void setDomacaIliDivlja(String domacaIliDivlja) {
		this.domacaIliDivlja = domacaIliDivlja;
	}

	
	void ispis() {
		super.ispis();
		System.out.println(this.domacaIliDivlja + " boja: "+ this.bojaDlake );
	}
}
