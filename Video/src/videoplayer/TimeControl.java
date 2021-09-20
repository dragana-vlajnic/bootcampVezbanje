package videoplayer;

public class TimeControl extends Control {

	boolean pomerajUnapred;
	
	
	public TimeControl() {
		// TODO Auto-generated constructor stub
	}
	
	public void setPomerajUnapred(boolean pomerajUnapred) {
		this.pomerajUnapred = pomerajUnapred;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer videoPlayer) {
		int trenutnoVreme = videoPlayer.getTreuntnoVreme();
		if (pomerajUnapred == true ) {
			if (videoPlayer.getDuzinaVidea() >= trenutnoVreme + 15) {
				videoPlayer.setTreuntnoVreme(trenutnoVreme + 15);
			}
			else {
				videoPlayer.setTreuntnoVreme(videoPlayer.getDuzinaVidea());
			}
		}
		else {
			if (trenutnoVreme - 15 > 0) {
				videoPlayer.setTreuntnoVreme(trenutnoVreme - 15);
			}
			else {
				videoPlayer.setTreuntnoVreme(0);
			}
		}
	}
}
