package part9;

import java.util.Scanner;

public class CoordinateTester2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("좌표 p를 입력하세요.");
		System.out.print("X좌표 : ");
		double x = scan.nextDouble();
		System.out.print("Y좌표 : ");
		double y = scan.nextDouble();
		
		System.out.println("좌표 q를 입력하세요.");
		System.out.print("X좌표 : ");
		double xq = scan.nextDouble();
		System.out.print("Y좌표 : ");
		double yq = scan.nextDouble();
		
		Coordinate p = new Coordinate(x, y);
		Coordinate q = new Coordinate(xq, yq);
		
		if(p == q) {
			System.out.println("p == q 입니다.");
			System.out.println("p와 q가 같습니다.");
		} else {
			System.out.println("p != q 입니다.");
			System.out.println("p와 q가 다릅니다.");
		}
		
		if(p.getX() == q.getX() && p.getY() == q.getY()) {
			System.out.println("p == q 입니다.");
			System.out.println("p와 q가 같습니다.");
		} else {
			System.out.println("p != q 입니다.");
			System.out.println("p와 q가 다릅니다.");
		}
		
		scan.close();
	}

}
