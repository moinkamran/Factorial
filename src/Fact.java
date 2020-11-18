// Factorial program by for loop
public class Fact {

	public static void main(String[] args) {
		int num = 5;
		int factorial = 1;
		for (int i = num; i > 0; i--) {

			factorial = factorial * i;
		}
		System.out.println("Factorial is :" + factorial);
		System.out.println("This line is added by Mohammad Miyan");
		System.out.println("This line is moin");
		display();
	}

	public static void display() {
		System.out.println("i am moin kamran and i am displye method");

	}
}