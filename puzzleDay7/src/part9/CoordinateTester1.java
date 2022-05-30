package part9;

import java.util.Scanner;

public class CoordinateTester1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("좌표 p를 입력하세요.");
		System.out.print("좌표 X : ");
		double x = scan.nextDouble();
		System.out.print("좌표 Y : ");
		double y = scan.nextDouble();
		
		Coordinate p = new Coordinate(x, y);
		System.out.println("p = (" + p.getX() + ", " + p.getY() + ")");
		System.out.println("-----------------");
		Coordinate q = p;
		q.set(9.9, 9.9);
		System.out.println("p = (" + p.getX() + ", " + p.getY() + ")");
		System.out.println("q = (" + q.getX() + ", " + q.getY() + ")");
		
		scan.close();
	}

}
