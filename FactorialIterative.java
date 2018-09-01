/*
Author: Summer Marsh
*/

public class FactorialIterative implements Factorial {

	public int factorial(int n) {
		int total = n;
		for(int i = n-1; i > 0; i--) {
			total = total * i;
		}
		return total;
	}	
}