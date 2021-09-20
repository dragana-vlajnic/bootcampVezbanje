package videoplayer;

public class QualityOptimizerControl extends Control {

	private int brzinaInterneta;
	
	public QualityOptimizerControl(int brzinaInterneta) {
		this.brzinaInterneta = brzinaInterneta;
	}

	public int getBrzinaInterneta() {
		return brzinaInterneta;
	}

	public void setBrzinaInterneta(int brzinaInterneta) {
		this.brzinaInterneta = brzinaInterneta;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer videoPlayer) {
		double parametar = brzinaInterneta * 10.1;
		if (parametar < 144)
		{
			videoPlayer.setKvalitet(144);
		}
		else if (parametar > 144 && parametar < 240) {
			videoPlayer.setKvalitet(240);
		}
		else if (parametar > 240 && parametar < 360) {
			videoPlayer.setKvalitet(360);
		}
		else if (parametar > 360 && parametar < 480) {
			videoPlayer.setKvalitet(480);
		}
		else if (parametar > 480 && parametar < 720) {
			videoPlayer.setKvalitet(720);
		}
		else if (parametar > 720) {
			videoPlayer.setKvalitet(1080);
		}
		else {
			videoPlayer.setKvalitet(1080);
		}
	}

}
