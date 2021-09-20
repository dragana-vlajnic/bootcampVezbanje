package videoplayer;

public class VideoPlayer {
	private int duzinaVidea;
	private int treuntnoVreme;
	private int jacinaZvuka;
	private int kvalitet;
	
	VideoPlayer(int duzinaVidea, int trenutnoVreme, int jacinaZvuka, int kvalitet) {
		this.duzinaVidea = duzinaVidea;
		this.treuntnoVreme = trenutnoVreme;
		this.jacinaZvuka = jacinaZvuka;
		this.kvalitet = kvalitet;
	}
	
	public int getDuzinaVidea() {
		return duzinaVidea;
	}
	
	public void setDuzinaVidea(int duzinaVidea) {
		this.duzinaVidea = duzinaVidea;
	}
	
	public int getTreuntnoVreme() {
		return treuntnoVreme;
	}
	
	public void setTreuntnoVreme(int treuntnoVreme) {
		this.treuntnoVreme = treuntnoVreme;
	}
	
	public int getJacinaZvuka() {
		return jacinaZvuka;
	}
	
	public void setJacinaZvuka(int jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}
	
	public int getKvalitet() {
		return kvalitet;
	}
	
	public void setKvalitet(int kvalitet) {
		this.kvalitet = kvalitet;
	}
	
}
