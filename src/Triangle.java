
public class Triangle {
	
	public double firstSideBase;
	public double secondSide;
	public double thirdSide;
	public double height;
	public double pointA;
	public double pointB;
	public double pointC;

	Triangle(double firstSideBase, double secondSide, double thirdSide, double height) {
		this.firstSideBase = firstSideBase;
		this.secondSide = secondSide;
		this.thirdSide = thirdSide;
		this.height = height;
	}
	
	public static void calculatePerimeter(double firstSideBase, double secondSide, double thirdSide) {
		double perimeter = firstSideBase+secondSide+thirdSide;
		System.out.println("Le périmètre équivaut à : "+perimeter+" cm.");
	}
	
	public static void calculateArea(double firstSideBase, double height) {
		double area = firstSideBase * height / 2 ;
		System.out.println("L'aire de ce triangle équivaut à : "+area+" cm.");
	}
	
	public static void moveTriangle(double pointA, double pointB, double pointC) {
		
	}
	
	public static void reduceTriangle() {
		
	}
}
