

public class FibonacciIterative implements Fibonacci {

	public int fibonacci(int n) {

		int total = 0;
		int num1 = 0;
		int num2 = 1;
		if(n<=1) {
			return 1;
		}
		for(int i=2; i<=n; i++) {
			total = num1 + num2;
			num1=num2;
			num2=total;
		}
		return total;
	}
}