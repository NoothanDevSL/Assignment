package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shuffle {

	public static void main(String[] args) {
		Integer[] array = {1, 2, 3, 4};
	     List<Integer> list = new ArrayList<>(Arrays.asList(array));
	     Collections.shuffle(list);
	     System.out.println(list);

	}

}
