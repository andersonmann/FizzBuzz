package fizzbuzz;

/** 
 * @author andersonm
 */

public class FizzBuzz {

	/**
	 * Método recursivo utilizado na classe Main
	 */
	public static String fizzBuzzRecursivo(int n) {
		String s = "";
		if (n == 0)
			return s;
		if ((n % 5) == 0)
			s = "Buzz" + s;
		if ((n % 3) == 0)
			s = "Fizz" + s;
		if (s.equals(""))
			s = n + "";
		return fizzBuzzRecursivo(n - 1) + s;
	}

	/**
	 * Método iterativo utilizado no JUnit
	 */
	public static String fizzBuzz(int n) {
		String s = "";
		if (n == 0)
			return s;
		if ((n % 5) == 0)
			s = "Buzz" + s;
		if ((n % 3) == 0)
			s = "Fizz" + s;
		if (s.equals(""))
			s = n + "";
		return s;
	}
}
