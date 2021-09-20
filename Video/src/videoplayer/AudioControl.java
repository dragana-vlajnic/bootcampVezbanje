package videoplayer;

public class AudioControl extends Control {
	
	boolean pojacaj;
	
	public AudioControl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void izvrsiAkciju(VideoPlayer videoPlayer) {
		int jacinaZvuka = videoPlayer.getJacinaZvuka();
		if (pojacaj == true)
		{
			if(videoPlayer.getJacinaZvuka() + 1 < 100) {
				videoPlayer.setJacinaZvuka(jacinaZvuka + 1);
			}
		}
		else {
			if (videoPlayer.getJacinaZvuka() - 1 > 0) {
				videoPlayer.setJacinaZvuka(jacinaZvuka-1);
			}
		}
	}

	public boolean isPojacaj() {
		return pojacaj;
	}

	public void setPojacaj(boolean pojacaj) {
		this.pojacaj = pojacaj;
	}

}
