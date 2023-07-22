package Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dublicate {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,20,30);
		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);

	}

}
