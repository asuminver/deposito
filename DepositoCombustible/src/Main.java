/**
 * Main class of the Java program. 
 * 
 * @author IES Severo Ochoa team
 * @since 2018-01
 * 
 */
public class Main {

    public static void main(String[] args) {
        
        // create the tank
        DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
        
        System.out.print("The tank with capacity " + tank.getDepositoMax() + " liters has been created. ");
        System.out.println(" Its initial fuel level is  " + tank.getDepositoNivel() + " liters.");
    }
}
