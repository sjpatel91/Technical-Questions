import java.util.Scanner;


public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World-pattern1");
		// TODO Auto-generated method stub
		System.out.println("Enter n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i<=n; i++) {
			for (int j = i; j<n; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
