package part7;

public class AddMatrix {
	
	static boolean addMatrix(int[][] a, int [][] b, int[][] c) {
		boolean t = false;
		for(int i = 0; i < 2; i++) {
			if(a.length == b.length) {
				for(int j = 0; j < 3; j++) {
					c[i][j] = a[i][j] + b[i][j];
				}
				t = true;
			} else {				
				t = false;
			}
		}
		return t;
	}
	
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6}};
		int[][] b = {{6,3,4},{5,1,2}};
		int[][] c = new int[2][3];
		
		System.out.println("행렬 a");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("행렬 b");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		addMatrix(a, b, c);
		
		System.out.println();
		System.out.println("행렬 c");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
