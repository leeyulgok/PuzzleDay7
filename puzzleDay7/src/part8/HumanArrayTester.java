package part8;

import java.util.Scanner;

public class HumanArrayTester {
	
	// 1차원 배열
	static void printArray(Human[] qList) {
		for(int i = 0; i < qList.length; i++) {
			System.out.printf("No%d. %s %dcm %dkg\n", i, qList[i].getName(), qList[i].getHeight(), qList[i].getWeight());
		}
	}
	
	// 2차원 배열	
	static void printArray(Human[][] yList) {
		for(int i = 0; i < yList.length; i++) {
			System.out.println(i+"행");
			for(int j = 0; j < yList[i].length; j++) {
				System.out.printf("No%d. %s %dcm %dkg\n", j, yList[i][j].getName(), yList[i][j].getHeight(), yList[i][j].getWeight());
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("배열 q의 요소 수 : ");
		int q = scan.nextInt();
		Human[] qList = new Human[q];
		
		for(int i = 0; i < qList.length; i++) {
			System.out.println("q["+i+"]");
			System.out.print("이름 : ");
			String name = scan.next();
			System.out.print("신장 : ");
			int height = scan.nextInt();
			System.out.print("체중 : ");
			int weight = scan.nextInt();
			qList[i] = new Human(name, height, weight);
		}
		
		System.out.print("배열 y의 행 수 : ");
		int y = scan.nextInt();
		Human[][] yList = new Human[y][];
		for(int i = 0; i < yList.length; i++) {
			System.out.print("y["+i+"]의 열 수 : ");
			int yy = scan.nextInt();
			yList[i] = new Human[yy];
		}
		
		for(int i = 0; i < yList.length; i++) {
			for(int j = 0; j < yList[i].length; j++) {
				System.out.println("y["+i+"]["+j+"]");
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("신장 : ");
				int height = scan.nextInt();
				System.out.print("체중 : ");
				int weight = scan.nextInt();
				yList[i][j] = new Human(name, height, weight);
			}
		}
		System.out.println("-------------------------------");
		System.out.println("배열 q");
		printArray(qList);
		
		System.out.println("-------------------------------");
		System.out.println("배열 y");
		printArray(yList);
		
		scan.close();
	}

}
