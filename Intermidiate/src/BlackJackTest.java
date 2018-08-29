import static org.junit.Assert.*;

import org.junit.Test;

public class BlackJackTest {
	BlackJack blackjack = new BlackJack();
	@Test
	public void test() {
		assertEquals(19,blackjack.twentyOne(19,23));
		assertEquals(19,blackjack.twentyOne(10,20));
	}

}
