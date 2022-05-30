package part7;

import java.util.Scanner;

public class Absolute {
	
	static int absolute(int a) {
		int abA = 0;
		if(a < 0) {
			abA = (-a);
		} else {
			abA = a;
		}
		return abA;
	}
	
	static long absolute(long b) {
		long abB = 0;
		if(b < 0) {
			abB = (-b);
		} else {
			abB = b;
		}
		return abB;
	}
	
	static float absolute(float c) {
		float abC = 0;
		if(c < 0) {
			abC = (-c);
		} else {
			abC = c;
		}
		return abC;
	}
	
	static double absolute(double d) {
		double abD = 0;
		if(d < 0) {
			abD = (-d);
		} else {
			abD = d;
		}
		return abD;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("int   형 정수 a의 값 : ");
		int a = scan.nextInt();
		System.out.print("long  형 정수 b의 값 : ");
		long b = scan.nextLong();
		System.out.print("float 형 정수 c의 값 : ");
		float c = scan.nextFloat();
		System.out.print("double형 정수 d의 값 : ");
		double d = scan.nextDouble();
		
		int abA = absolute(a);
		long abB = absolute(b);
		float adC = absolute(c);
		double adD = absolute(d);
		
		System.out.println("a의 절대값은 " + abA + "입니다.");
		System.out.println("b의 절대값은 " + abB + "입니다.");
		System.out.println("c의 절대값은 " + adC + "입니다.");
		System.out.println("d의 절대값은 " + adD + "입니다.");
		
		scan.close();
	}

}
