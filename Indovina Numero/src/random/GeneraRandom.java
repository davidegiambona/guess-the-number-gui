package random;
import java.util.Random;

public class GeneraRandom {
	private static Random rand;
	
	public GeneraRandom() {
		rand = new Random();
	}
	
	public static int generaRandom() {
		int numero = rand.nextInt(100);
		return numero;
	}
}