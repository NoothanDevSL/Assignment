package Questions;

public class DiffOfEquals {

	public static void main(String[] args) {
		int a = 8;
		int b = 8;
		System.out.println("Using == with primitive types: " + (a == b));

		String str1 = new String("Java");
		String str2 = new String("Java");
		System.out.println("Using == " + (str1 == str2));
		System.out.println(".equals() " + str1.equals(str2));


	}

}
