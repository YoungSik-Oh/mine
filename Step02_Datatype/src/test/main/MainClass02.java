package test.main;

public class MainClass02 {
	
	public static void main(String[] args) {
		int kor=95;
		
		int eng=100;
				
		//국어 점수와 영어점수의 평균을 구해서 변수에 담고 그 결과를 콘솔창에 출력해보세요
		double sum= kor+eng;
		double avg=sum/2;
		
		System.out.println(avg);
	
		// int type 과 double type 을 연산하면 결과는 double type이다.
		double a=(kor+eng)/2.0;
		System.out.println("평균:" + a);
	}

}
