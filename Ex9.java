package chap03;

import java.util.Scanner;

/*
 1.사용자에게 영어와 수학 점수를 입력으로 받아 두과목 모두 80점 이상이면 "합격입니다" 아니면 "불합격입니다" 값을 출력하는 코드를 작성하세오.
 2.사용자에게 영어와 수학 점수를 입력으로 받아 두 과목중 한 과목이라도 80점 미만인 점수가 있으면 "과락인 과목이 존재합니다", 아니면 "과락인과목이 없습니다"
   값을 출력하는 코드를 작성하세오.
 3. 사용자에게 영어와 수학점수를 입력으로 받아 두 과목중 모두 80점 이상이면 "합격입니다" 아니면 "불합격입니다"값을 출력하는 코드를 작성하세오.
    단 and연산자 사용x 
 
  */

public class Ex9 {

	public static void main(String[] args) {
		int math = 0,eng = 0;
		boolean result;
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("영어점수와 수학점수를 입력하세요: ");
		
		eng = sc.nextInt();
		math = sc.nextInt();
		sc.close();
		
		
		/* 1번
		result = math >= 80 && eng>=80;
		
		System.out.println("result: "+ (result ? "합격입니다" :"불합격입니다"));
		*/
		
		/* 2번
		result = math <80 || eng<80;
		
		System.out.println("result: "+ (result ? "과락인 과목이 존재합니다." :"과락인 과목이 없습니다."));
		*/
		
		
		result = !(eng <80 || math <80); 
		
		System.out.println("result: "+ (result ? "합격입니다" :"불합격입니다"));

	}

}
