import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for (int j = (s.length() - 1); j >= 0; j--) {
			System.out.print(s.charAt(j));
		}
		sc.close();
	}

}
