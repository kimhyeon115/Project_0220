package Package_1;

import java.util.Scanner;

public class SungJukMain {

	public static void main(String[] args) {
		SungJuk sj = new SungJuk();
		Scanner scn = new Scanner(System.in);
		System.out.println("국어 성적 입력>");
		sj.kor = scn.nextInt();
		System.out.println("수학 성적 입력>");
		sj.mat = scn.nextInt();
		System.out.println("영어 성적 입력>");
		sj.eng = scn.nextInt();
		sj.SungJukInfo();

	}

}
