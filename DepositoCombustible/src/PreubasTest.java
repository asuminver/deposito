import static org.junit.Assert.*;

import org.junit.Test;

public class PreubasTest {
	DepositoCombustible tank = new DepositoCombustible(120.0,90.0);
	
	@Test
	public void testDepsNivel() {
		double DepNiv= tank.getDepositoNivel();
		assertEquals(120, DepNiv);
	}

}
