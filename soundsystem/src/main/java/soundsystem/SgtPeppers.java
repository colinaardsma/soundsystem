package soundsystem;

import org.springframework.stereotype.Component;

// can only have one component per case 
// @Component  // tells Spring to look in this class for objects to make
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	
	public void play() {
		System.out.println("Playing " + title + " by " + artist);

	}

}
