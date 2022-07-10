
public class OperatorExample {

	public static void main(String[] args) {
		int a = 5;
		a = a + 1; // 6

		++a; // 7
		a++; // 8 // a = a+1;

		// a = a-1;
		--a; // 7
		a--; // 6

		System.out.println(a++); // a=a+1

		System.out.println(a);

		System.out.println(a > 10);

		System.out.println((5 > 3) || (2 > 3));

		int age = 18;

		if (age >= 18) {
			System.out.println("Valid");
		} else {

			System.out.println("Invalid");

		}

		// Switch case loop
		int number = 20;

		switch (number) {
		case 20:
			System.out.println("20");

			break;
		case 10:
			System.out.println("10");
			break;

		default:
			System.out.println("Not in 10 or 20");
		}

		// Looping - Repeat yourself - 5 times -
		// continue, break
		for (int i = 0; i <= 5; i++) {
			if (i == 3)
				continue;

			System.out.println("Hello");
		}

		int n = 4;
		// While looop
		while (n <= 2) {
			System.out.println("Whileloop");
			n++;
		}

		n=4;
		
		do {
			System.out.println("DoWhile");
			n++;
		} while (n <= 2);

	}
}
