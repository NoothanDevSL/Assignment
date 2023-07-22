package Questions;

import java.util.Arrays;

public class CheckSameNo {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {4,3,2,1};
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result= Arrays.equals(a, b);
		System.out.println(result);

	}

}
