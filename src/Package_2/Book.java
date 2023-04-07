package Package_2;

public class Book {
	String title;
	String author;
	int age;
	void show() { System.out.println(title + " " + author + " " + age); }
	public Book() {
		this("", "");
		System.out.println("생성자 호출됨");
	}
	public Book(String title) {								
		this(title, "작자미상");								//Book 안에 있는 생성자(갯수 맞는것) 향함
	}
	public Book(String title, String author) {
		this.title = title;									//class Book 안에 있는 멤버변수로 향함
		this.author = author;
	}
	public Book(String title, String author, int age) {
		this.title = title;
		this.author = author;
		this.age = age;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		Book emptyBook = new Book();
		Book age = new Book("어린왕자", "홍길동", 45);
		age.show();

	}

}
