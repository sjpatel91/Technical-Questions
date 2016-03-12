import java.util.Scanner;

public class ReadMatrixInSpiral {
	void printMatrix(char[][] matrix) {
		if (matrix.length == 0)
			return;
		int top = 0;
		int down = matrix.length - 1;
		int left = 0;
		int right = matrix[0].length - 1;
		while (true) {
			for (int i = left; i <= right; i++)
				System.out.print(matrix[top][i]);
			top++;
			if (top > down || left > right)
				break;
			
			for (int j = top; j <= down; j++)
				System.out.print(matrix[j][right]);
			right--;
			if (top > down || left > right)
				break;

			for (int i = right; i >= left; i--)
				System.out.print(matrix[down][i]);
			down--;
			if (top > down || left > right)
				break;

			for (int j = down; j >= top; j--)
				System.out.print(matrix[j][left]);
			left++;
			if (top > down || left > right)
				break;
		}

	}

	public static void main(String[] args) {
		int row, column;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter matrix:");
		System.out.println("enter value of rows:");
		row = sc.nextInt();
		System.out.println("enter value of column:");
		column = sc.nextInt();
		char mat[][] = new char[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				mat[i][j] = sc.next().charAt(0);
			}
		}

		ReadMatrixInSpiral object1 = new ReadMatrixInSpiral();

		object1.printMatrix(mat);

	}
}
