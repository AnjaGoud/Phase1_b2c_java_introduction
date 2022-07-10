
public class Calculator {

	int add(int a, int b, int c) {
		return a + b;
	}
	
	int sub(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		int result = c1.add(4, 6,1);
		System.out.println(result);
		
		int res = c1.sub(5, 2);
		System.out.println(res);
	}
}

// Installation - JDK 8 , Eclipse
// We did today
// OOPs concept - Final keyword, Static keyword

// GIT - Go thorugh by 2 weeks