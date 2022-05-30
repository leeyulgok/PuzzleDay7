package part8;

import java.util.Scanner;

public class CarTester2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("차량의 데이터를 입력하세요.");
		System.out.print("이름 : " );
		String name = scan.next();
		System.out.print("번호 : " );
		String number = scan.next();
		System.out.print("전폭 : " );
		int withd = scan.nextInt();
		System.out.print("전고 : " );
		int height = scan.nextInt();
		System.out.print("전징 : " );
		int length = scan.nextInt();
		System.out.print("탱크용량 : " );
		double tankage = scan.nextDouble();
		System.out.print("연료량 : " );
		double fuel = scan.nextDouble();
		System.out.print("연비 : " );
		double sfc = scan.nextDouble();
		
		Car myCar = new Car(name, number, withd, height, length, tankage, fuel, sfc);
		
		while(true) {
			System.out.println("현재 위치 : (" + myCar.getX() + "," + myCar.getY() + ")");
			System.out.println("남은 연료 : " + myCar.getFuel());
			System.out.print("이동하시겠습니까? 0-No/1-Yes : ");
			int move = scan.nextInt();
			if(move == 0) {
				break;
			} else {
				System.out.print("X방향으로의 이동 거리 : ");
				double dx = scan.nextDouble();
				System.out.print("Y방향으로의 이동 거리 : ");
				double dy = scan.nextDouble();
				if(!myCar.move(dx, dy)) {
					System.out.println("연료부족 !!");
				}
			}
		}
		scan.close();
	}

}
