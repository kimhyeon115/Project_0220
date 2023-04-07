package Package_1;

import java.util.Scanner;

public class Rectangle {
	int width;													//정수형 변수 생성
	int height;													//정수형 변수 생성

	public int getArea() {										//메소드 선언부
		return width*height;									//메소드 실행부
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();						//객체생성(힙메모리에 생성)
		Scanner scanner = new Scanner(System.in);				//키보드에서 입력받음
		System.out.print(">> ");								//인쇄출력
		rect.width = scanner.nextInt();							//키보드에서 입력받아 힙메모리 해당위치에 저장
		rect.height = scanner.nextInt();						//키도드에서 입력받아 힙메모리 해당위치에 저장
		System.out.println("사각형의 면적은 " + rect.getArea());	//클래스 메소드 실행하고 인쇄 출력
		scanner.close();										//객체닫기
	}

}
