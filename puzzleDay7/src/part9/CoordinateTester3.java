package part9;

import java.util.Scanner;

public class CoordinateTester3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("좌표는 몇 개 : ");
		int number = scan.nextInt();
		
		Coordinate[] a = new Coordinate[number];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = new Coordinate(5.5, 7.7);
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] = (%.1f, %.1f)\n", i, a[i].getX(), a[i].getY());
		}
		scan.close();
	}

}
