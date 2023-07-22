package Questions;

import java.util.Arrays;

public class SameNo {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {5,4,3,2,1};
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result= Arrays.equals(a, b);
		System.out.println(result);
	}

	}


