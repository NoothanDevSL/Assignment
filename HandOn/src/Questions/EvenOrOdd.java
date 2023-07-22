package Questions;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

	    int[] numbers = new int[n];

	    int Even = 0, Odd = 0;

	    System.out.print("Enter " + n + " integers: ");

	    for (int i = 0; i < n; i++) {
	    	numbers[i] = input.nextInt();
	    }
	    for( int i = 0 ; i <n ;i++) {
	    	if(numbers[i] % 2 ==0) {
	    		Even = numbers[i]+Even;
	    	}else {
	    		Odd =  numbers[i]+Odd;
	    	}
	    }
	    
	    System.out.println(Even);;
	    System.out.println(Odd);
	    
	    

	}

}
