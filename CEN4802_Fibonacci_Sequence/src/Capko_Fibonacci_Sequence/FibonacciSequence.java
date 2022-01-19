package Capko_Fibonacci_Sequence;

/***
 * @author Grayson Capko
 * Date 1/18/2022
 */

public class FibonacciSequence {

	/***
	 *Greets the user and calls the callFib() method. Once method have resolved
	 * the system produced a exit message then ends.
	 */
	public static void main(String[] args) {
	
		System.out.println("Hello this is my application");
		
		callFib();
		
		System.out.println("Thank you for using my Fibonacci Sequence Generator");

	}

	/***
	 *
	 * @param i number of iterations
	 * @return result of the fibonacci sequence at i iterations. This is given to callFib for display.
	 */
	  public static long fibonacciRec(int i) 
	  {
		  
		if (i == 0) return 0;
		if (i <= 2) return 1;
		
		long fibTerm = fibonacciRec(i - 1) + fibonacciRec(i -2);
		return fibTerm;
	  }

	/***
	 * Calls fibonacciRec method and provides the pramater of 10. Once results are returned
	 * the method displays a message with the number of iterations and the result by the other method.
	 */
	public static void callFib() {
		  
		  int iteration = 10;
		  long results = fibonacciRec(iteration);
		  
		  System.out.println("The " + iteration + " term of the Fibonacci sequence is: " + results);
		  
		  
	  }
}
