package Package_1;

public class SungJuk {
	int kor;
	int mat;
	int eng;
	
	void SungJukInfo() {
		System.out.println("국어 성적 : " + kor);
		System.out.println("수학 성적 : " + mat);
		System.out.println("영어 성적 : " + eng);
		System.out.println("성적 합계 : " + (kor + mat + eng));
		System.out.println("성적 평균 : " + (kor + mat + eng)/3);
		
		int avg = (kor + mat + eng) / 3;
		if(avg<60) {
			System.out.println("성적 합계 : F");
		}
		else if(avg<70) {
			System.out.println("성적 합계 : D");
		}
		else if(avg<80) {
			System.out.println("성적 학점 : C");
		}
		else if(avg<90) {
			System.out.println("성적 합계 : B");
		}
		else {
			System.out.println("성적 합계 : A");
		}
	}
}
