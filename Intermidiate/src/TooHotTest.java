import static org.junit.Assert.*;

import org.junit.Test;

public class TooHotTest {
	TooHot tooHot = new TooHot();
	@Test
	public void test() {
		assertEquals(true,tooHot.isHot(85,false));
		assertEquals(true,tooHot.isHot(100,true));
		assertEquals(true,tooHot.isHot(60,true));
		assertEquals(true,tooHot.isHot(70,false));
		assertEquals(true,tooHot.isHot(90,false));
		assertEquals(false,tooHot.isHot(100,false));
		assertEquals(false,tooHot.isHot(110,true));
		assertEquals(false,tooHot.isHot(50,true));
		assertEquals(false,tooHot.isHot(40,false));
		assertEquals(false,tooHot.isHot(59,false));
	}

}
