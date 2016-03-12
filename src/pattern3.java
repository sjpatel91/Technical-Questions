import java.util.Scanner;


public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World-pattern3");
		// TODO Auto-generated method stub
		System.out.println("Enter n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i<=n; i++) {
			for (int j = 1;j<=n; j++ ) {
				if(j<i){
					System.out.print("_");
				}
				else{
				System.out.print("*");
				}
			}
			System.out.print("\n");
		}

	}

}
