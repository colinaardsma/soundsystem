package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // tells Spring to look in this class for objects to make
public class CDPlayer implements MediaPlayer {
	
	@Autowired
	private CompactDisc cd;

	public void play() {
		cd.play();
	}

}
