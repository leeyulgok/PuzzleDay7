package part7;

import java.util.Scanner;

public class Min {
	
	static int min(int x, int y) {
		int min = x;
		if(min > y) {
			min = y;
		}
		return min;
	}
	
	static int min(int x, int y, int z) {
		int min = x;
		if(min > y) {
			min = y;
		}
		if(min > z) {
			min = z;
		}
		return min;
	}
	
	static int min(int[] list) {
		int min = list[0];
		for(int i = 1; i < list.length; i++) {
			if(min > list[i]) {
				min = list[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("x값 : ");
		int x = scan.nextInt();
		System.out.print("y값 : ");
		int y = scan.nextInt();
		System.out.print("z값 : ");
		int z = scan.nextInt();
		System.out.print("배열 a의 요소 수 : ");
		int a = scan.nextInt();
		
		int[] list = new int[a];
		for(int i = 0; i < a; i++) {
			System.out.print("list["+i+"] = ");
			int aa = scan.nextInt();
			list[i] = aa;
		}
		int min2 = min(x, y);
		int min3 = min(x, y, z);
		int minList = min(list);
		
		System.out.println("x,y의 최솟값은 " + min2 + "입니다.");
		System.out.println("x,y,z의 최솟값은 " + min3 + "입니다.");
		System.out.println("배열 list의 최솟값은 " + minList + "입니다.");
		
		scan.close();
	}

}
