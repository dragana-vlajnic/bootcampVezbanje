package figura;

public abstract class Figura {

	public Figura() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract double povrsina();
	public abstract double obim();
	
	public void stampanje() {
		System.out.println("Povrsina je " + povrsina() + ", " + ", obim je " + obim());
	}

}
