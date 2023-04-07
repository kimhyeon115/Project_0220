package Package_1;

public class Circle78 {
	public int radius;
	public String name;
	public Circle78() {}					//기본생성자(매개가 있는 생성자가 있을때는 자동으로 만들지 않는다)
	public Circle78(int n1, String p1) {				//<오버로딩>
		radius = n1;
		name = p1;
	}
	public double getArea() {										
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		Circle78 pizza = new Circle78(10, "자바피자");
		Circle78 pizza1 = new Circle78();
		double area = pizza.getArea();		
		System.out.println(pizza.name + "의 면적은 " + area);

	}

}
