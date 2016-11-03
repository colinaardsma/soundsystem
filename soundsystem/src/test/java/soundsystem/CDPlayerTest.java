package soundsystem;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // runs as spring test
@ContextConfiguration(classes=CDPlayerConfig.class) // configures test case using config file referenced
public class CDPlayerTest {
	
	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();

	@Autowired // tells Soring to go find a class that implements the MediaPlayer interface and try to create the object
	private MediaPlayer cdPlayer; // Spring creates an instance of cdPlayer for us
	
	@Test
	public void testCDPlayer() {
		
		cdPlayer.play();
		assertEquals(log.getLog(), "Playing Born to Run by Bruce Springsteen\n");
	}

}
