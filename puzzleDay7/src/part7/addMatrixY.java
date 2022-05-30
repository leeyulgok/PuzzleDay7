package part7;

import java.util.Scanner;

public class addMatrixY {
	static int[][] addMatrix(int[][] a, int[][] b) {
		int xx = 0;
		int yy = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				yy++;
			}
			xx++;
		}
		yy = yy/2;
		
		int[][] c = new int[xx][yy];
		for(int i = 0; i < xx; i++) {
			for(int j = 0; j < yy; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return c;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("행렬의 행 수 : ");
		int x = scan.nextInt();
		System.out.print("행렬의 열 수 : ");
		int y = scan.nextInt();
		
		int[][] a = new int[x][y];
		int[][] b = new int[x][y];
		
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				System.out.print("a["+i+"]"+"["+j+"] = ");
				int aa = scan.nextInt();
				a[i][j] = aa;
			}
		}
		System.out.println("==================");
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				System.out.print("b["+i+"]"+"["+j+"] = ");
				int bb = scan.nextInt();
				b[i][j] = bb;
			}
		}
		int[][] c = addMatrix(a, b);
		System.out.println("==================");
		System.out.println("행렬 a");
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("행렬 b");
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("행렬 c");
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}

}
