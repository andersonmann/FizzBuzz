package fizzbuzz;

/**
 * @author andersonm
 */

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		System.out.println("" + fb.fizzBuzzRecursivo(20));
	}
}
