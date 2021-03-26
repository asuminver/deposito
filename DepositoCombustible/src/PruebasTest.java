import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class PruebasTest {
	
     DepositoCombustible Dep = new DepositoCombustible(120.0,90.0);

	@Test
	public void testDepNivel() {
		
		double n=Dep.getDepositoNivel();
		assertEquals(90.0,n);
	}
	
	@Test
	public void testDepMAX() {
		double n=Dep.getDepositoMax();
		assertEquals(120.0,n);
	}

	@Test
	public void testDepVacioFalse() {
	     DepositoCombustible Dep1 = new DepositoCombustible(120.0,90.0);

		boolean n=Dep1.estaVacio();
		
		assertFalse(n);
		
		
		
	}
	@Test
	public void testDepVacioTrue() {
	     DepositoCombustible Dep2 = new DepositoCombustible(120.0,0.0);

		boolean n=Dep2.estaVacio();
		
		assertTrue(n);
		
	}
	
	@Test
	public void testDepMedVac() {
	     DepositoCombustible Vac = new DepositoCombustible(120.0,90.0);

		double n=Vac.getDepositoNivel();
		double h=Vac.getDepositoMax()/2;
		
		assertEquals(false,n==h);
		
	}
	
}
