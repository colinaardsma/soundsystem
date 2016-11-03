package soundsystem;

import org.springframework.stereotype.Component;

@Component  // tells Spring to look in this class for objects to make
public class BornToRun implements CompactDisc {

	private String title = "Born to Run";
	private String artist = "Bruce Springsteen";
	
	public void play() {
		System.out.println("Playing " + title + " by " + artist);

	}

}
