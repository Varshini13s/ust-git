package basics;

public class ExceptionHandling {
	public static void main(String[] args) {
		int n=10;
		int m=0;
		try {
			int ans=n/m;
			System.out.println("Answer: " + ans);
			System.out.println("Error:Division by 0!");
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
