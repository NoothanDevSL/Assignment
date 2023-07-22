package Questions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNoRange {

	

	public static void main(String[] args) {
		List<Integer> res = IntStream.rangeClosed(0, 30).filter(PrimeNoRange::prime).boxed().collect(Collectors.toList());
        System.out.println(res);
    }

    private static boolean prime(int number) {
        if(number < 0) {
            return false;
        }

        if(number == 0 || number == 1) {
            return false;
        }

        for(int i=2; i<=number/2; i++) {
            if(number % i == 0) return false;
        }
        return true;
	}

}
