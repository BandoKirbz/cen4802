import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junittest {

	@Test
	public void test() {
		Task junit = new Task();
		int result = junit.changeIndex(0);
		assertEquals(10, result);
	}

}
