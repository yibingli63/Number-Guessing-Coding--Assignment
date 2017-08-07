package Gussing_Number;

public class NumberGuessing {

	public static int ng(int secretNumber){
		int guess = 0;
		int upperBoundary = 100;
		int lowerBoundary = 0;
		int count = 0;
		
		do {
			count ++;
			//Use binary search algorithm to iterate secrectNumber
			guess = (upperBoundary - lowerBoundary) / 2 + lowerBoundary;
			System.out.println("Is the number " + guess);

			if (guess < secretNumber) {
				System.out.println("lower");	
				//Adjust lower boundary
				lowerBoundary = guess;
			} else if (guess > secretNumber) {
				System.out.println("higher");
				//Adjust upper boundary
				upperBoundary = guess;
			}
		//	System.out.println(count + ": " + upperBoundary + " -- " + lowerBoundary);
		} while (guess != secretNumber);
		//System.out.println("Your number = " + secretNumber);
		System.out.println("yes"); 
		return count;
	}
	
	public static void main(String[] args) {
		int secretNumber;
		//Suppose my number is between 1 and 100
		secretNumber = (int)(Math.random()*99+1);
		System.out.println("Your number = " + secretNumber);
		System.out.println("count = " + NumberGuessing.ng(secretNumber));
	}	
}
