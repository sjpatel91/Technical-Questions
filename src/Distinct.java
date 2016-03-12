public class Distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 3, 4 };
		boolean flag = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length && j != i; j++) {
				if (a[i] == a[j]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println("distinct  numbers:" + a[i]);
			}
			flag = true;
		}		
	}
}
