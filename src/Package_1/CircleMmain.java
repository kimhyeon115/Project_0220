package Package_1;

public class CircleMmain {
		public int radius;
		public String name;
//		public Circle() {}
		public CircleMmain() { 									 // 매개 변수 없는 생성자
			radius = 1; name = ""; 							     // 필드 초기화
			}
		public CircleMmain(int r, String n) { 					 // 매개 변수를 가진 생성자
		radius = r; name = n;									 // 매개 변수로 필드 초기화 
			}
		public double getArea() {
			return 3.14*radius*radius;
		}

	public static void main(String[] args) {
		CircleMmain pizza = new CircleMmain(10, "자바피자");
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);

		CircleMmain donut = new CircleMmain();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);

	}

}
