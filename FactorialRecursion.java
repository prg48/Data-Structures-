
public class FactorialRecursion {

	public static void main(String[] args) {
		System.out.println(factorial(3));
	}
	
	private static int factorial(int n) throws IllegalArgumentException {
		if(n<0) {
			throw new IllegalArgumentException();
		}
		else if(n==0) {
			return 1;
		}
		return n*factorial(n-1);
	}
}
