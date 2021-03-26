
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;	

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)

public class DepositoTesteParamerizada {
	private double Numero1;
	private double Numero2;
	private double Resultado;
	
	
	public  DepositoTesteParamerizada(double Numero1, double Numero2, double Resultado) {
		this.Numero1=Numero1;
		this.Numero2=Numero2;
		this.Resultado=Resultado;
		
	}
		
	public static Collection<Object[]>nuemros(){
		return Arrays.asList(new Object[][]{
			{10,10,20},{20,50,70},{-30,40,10},{70,-70,0}});
	}
	
	
	@Test
	public void testSumar(double Numero1) {// meter gas...
	     DepositoCombustible Vac = new DepositoCombustible(120.0,90.0);

		assertEquals(Resultado,Numero1+Numero2);
		
	}
	
	
	
	/*@Test
	public void testRestar(double amount) { //quitar gas.amount..
		
		
		
	}*/

}