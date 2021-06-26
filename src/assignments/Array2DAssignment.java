package assignments;

public class Array2DAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{7,4},{2,9}};
		int b[][] = {{1,5},{3,8}};
		
		int c [][] = new int[2][2];
		
		for (int i = 0;i<2;i++) {
			for (int j=0; j<2; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.println(c[i][j]);
			}
		}
		
		
	}

}
