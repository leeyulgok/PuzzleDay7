package part9;

import java.util.Scanner;

public class CoordinateTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("좌표 p를 입력하세요.");
		System.out.print("X좌표 : ");
		double x = scan.nextDouble();
		System.out.print("Y좌표 : ");
		double y = scan.nextDouble();
		
		Coordinate p = new Coordinate(x, y);
		System.out.println("p = (" + p.getX() + ", " + p.getY() + ")");
		System.out.println("q와 p를 동일 좌표로 만들었습니다.");
		
		Coordinate q = p;
		System.out.println("q = (" + q.getX() + ", " + q.getY() + ")");
		
		if(p.equalTo(q)) {
			System.out.println("p와 q가 같습니다.");
		} else {
			System.out.println("p와 q가 다릅니다.");
		}
		
		Coordinate c1 = new Coordinate();
		Coordinate c2 = new Coordinate(1.1, 2.2);
		
		System.out.println("c1 = (" + c1.getX() + ", " + c1.getY() + ")");
		System.out.println("c2 = (" + c2.getX() + ", " + c2.getY() + ")");
		
		Coordinate[] list = new Coordinate[3];
		
		for(int i = 0; i < list.length; i++) {
			list[i] = new Coordinate();
			System.out.println("list["+i+"] = (" + list[i].getX() + ", " + list[i].getY() + ")");
		}
		
		scan.close();
	}

}
