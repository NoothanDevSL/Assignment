package Questions;

public class UniqueLetters {

	public static void main(String[] args) {
		String a = "java";
		for (int i = 0; i < a.length(); i++) {
			if (a.indexOf(a.charAt(i)) != a.lastIndexOf(a.charAt(i))) {
				continue;
			} else
				System.out.print(a.charAt(i) + " ");

		}
		

	}

}
