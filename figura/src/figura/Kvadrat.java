package figura;

public class Kvadrat extends Figura {
	private double a;

	public Kvadrat(double a) {
		super();
		this.a=a;
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}
	
	public double povrsina() {
		return a*a;
		
	}
	
	public double obim() {
		return 4*a;
	}

}
