package figura;

public class Trougao extends Figura {
	private double a;
	
	public Trougao(double a) {
		super();
		this.a = a;
	}

	@Override
	public double povrsina() {
		return (a*a)*1.73205/4;
		
	}

	@Override
	public double obim() {
		return 3*a;
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

}
