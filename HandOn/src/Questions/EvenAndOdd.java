package Questions;

public class EvenAndOdd {

	public static void main(String[] args) {
		int[] num = { 10,18, 42, 9, 6, 27 };

        System.out.println("Even numbers:");
        printEvenNumbers(num);

        System.out.println("Odd numbers:");
        printOddNumbers(num);
    }

    public static void printEvenNumbers(int[] arr) {
        for (int n : arr) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbers(int[] arr) {
        for (int n : arr) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
	}

}
