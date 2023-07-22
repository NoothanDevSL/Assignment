package Questions;

import java.util.Arrays;

public class Largest2No {

	public static void main(String[] args) {
		int list[] = {1,5,7,9,3};
		int size = list.length;
		Arrays.sort(list);
//		System.out.println("given array is " + Arrays.toString(list));
		int secondmax = list[size-2];
		System.out.println("second highest number from array is " + secondmax);

	}

}
