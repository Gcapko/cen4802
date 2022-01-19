package Capko_Fibonacci_Sequence;


public class FibonacciSequence {

	public static void main(String[] args) {
	
		System.out.println("Hello this is my application");
		
		callFib();
		
		System.out.println("Thank you for using my Fibonacci Sequence Generator");

	}

	  public static long fibonacciRec(int i) 
	  {
		  
		if (i == 0) return 0;
		if (i <= 2) return 1;
		
		long fibTerm = fibonacciRec(i - 1) + fibonacciRec(i -2);
		return fibTerm;
	  }
	  
	  public static void callFib() {
		  
		  int iteration = 10;
		  long results = fibonacciRec(iteration);
		  
		  System.out.println("The " + iteration + " term of the Fibonacci sequence is: " + results);
		  
		  
	  }
}
