package part8;

public class Car {
	private String name;	// 이름
	private String number;	// 번호
	private int width;		// 폭
	private int height;		// 높이
	private int length;		// 길이
	private double x;		// 현재 좌표 x
	private double y;		// 현재 좌표 y
	private double tankage;	// 탱크 용량
	private double fuel;	// 남은 연료
	private double sfc;		// 연비
	
	public Car() {
		
	}

	public Car(String name, String number, int width, int height, int length, double tankage, double fuel, double sfc) {
		this.name = name;
		this.number = number;
		this.width = width;
		this.height = height;
		this.length = length;
		this.x = 0.0;
		this.y = 0.0;
		this.tankage = tankage;
		this.fuel = (fuel <= tankage) ? fuel : tankage; // 남은 연료는 탱크 용량과 동일
		this.sfc = sfc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getTankage() {
		return tankage;
	}

	public void setTankage(double tankage) {
		this.tankage = tankage;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public double getSfc() {
		return sfc;
	}

	public void setStc(double sfc) {
		this.sfc = sfc;
	}
	
	// 사양 표시
	void putSpec() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + number);
		System.out.println("전폭 : " + width + "mm");
		System.out.println("전고 : " + height + "mm");
		System.out.println("전장 : " + length + "mm");
		System.out.println("탱크 : " + tankage + "리터");
		System.out.println("연비 : " + sfc + "km/리터");	
	}
	
	// X방향으로 dx, Y방향으로 dy
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy); // 이동 거리
		double f = dist / sfc; // 이동에 필요한 연료
		
		if(f > fuel) {
			return false;
		} else {
			fuel -= f;
			x += dx;
			y += dy;
			return true;
		}
	}
	
	// df 리터 급유
	void refuel(double df) {
		if(df > 0) {
			fuel += df;
			if(fuel > tankage) {
				fuel = tankage;
			}
		}
	}
}
