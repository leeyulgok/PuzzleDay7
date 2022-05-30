package part7;

import java.util.Scanner;

public class PrintArray {
	
	static void printArray(int[] xList) {
		System.out.println("1차원 배열x");
		for(int i = 0; i < xList.length; i++) {
			System.out.print(xList[i] + " ");
		}
		System.out.println();
	}
	
	static void printArray(int[][] yList) {
		System.out.println("2차원 배열y");
		for(int i = 0; i < yList.length; i++) {
			for(int j = 0; j < yList[i].length; j++) {
				System.out.print(yList[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1차원 행렬 x의 요소 수 : ");
		int x = scan.nextInt();
		int[] xList = new int[x];
		for(int i = 0; i < x; i++) {
			System.out.print("xList["+i+"] = ");
			int xx = scan.nextInt();
			xList[i] = xx;
		}
		System.out.print("2차원 행렬 y의 행 수 : ");
		int y = scan.nextInt();
		int[][] yList = new int[y][];
		for(int i = 0; i < y; i++) {
			System.out.print(i + "행째 열 수 : ");
			int yy = scan.nextInt();
			yList[i] = new int[yy];
		}
		System.out.println("각 요소의 값을 입력하세요.");
		for(int i = 0; i < y; i++) {
			for(int j = 0; j < yList[i].length; j++) {
				System.out.print("yList["+i+"]["+j+"] = ");
				int z = scan.nextInt();
				yList[i][j] = z;
			}
		}
		
		printArray(xList);
		printArray(yList);
		
		scan.close();
	}

}
