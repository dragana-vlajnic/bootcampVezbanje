package videoplayer;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		VideoPlayer videoPlayer = new VideoPlayer(600, 0, 20, 720);
		
		TimeControl timeControl = new TimeControl();
		timeControl.setPomerajUnapred(true);
		QualityOptimizerControl qualityOptimizerControl = new QualityOptimizerControl(20);
		AudioControl audioControl = new AudioControl();
		audioControl.setPojacaj(true);
		
		ArrayList<Control> controls = new ArrayList<Control>();	
	
		controls.add(timeControl);
		controls.add(qualityOptimizerControl);
		controls.add(audioControl);
		for (int i=0; i<controls.size(); i++) {
			controls.get(i).izvrsiAkciju(videoPlayer);
		}
	}

}
