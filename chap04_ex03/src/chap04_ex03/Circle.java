package chap04_ex03;

public class Circle {
	int radius;
	String name;
	
	public Circle() {
		radius = 1;
		name = "";
		
	}
	
	public Circle(int r, String n){
		radius = r;
		name = n;
		
	}
	
	public double getArea(){
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		

	}

}
