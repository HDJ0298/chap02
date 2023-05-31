package chap03;

import java.util.Scanner;

/*
   [동전교환 프로그램]
   다음의 실행 결과와 같은 프로그램을 작성하세요.
   
   실행결과=
   계산하실 금액을 입력하세요. 10000
   구매하신 금액을 입력하세요: 6234
   
   거스름돈: 3766원
   500원짜리 동전: 7개
   100원짜리 동전: 2개
   50원짜리 동전:1개
   10원짜리 동전:1개
   나머지 거스름돈: 6원
   
   작성조건:
   1.여러개의 변수 이용하여 문제를 해결하기.
   2.하나의 변수만 사용하여 문제를 해결합니다.
 */

public class Exam2 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		int i=0, j=0;
		int result =0;
		int a,b,c,d,e;
		
		System.out.print("계산하실 금액을 입력하세요: ");
		i=sc.nextInt();
		System.out.print("구매하신 금액을 입력하세요: ");
		j=sc.nextInt();
		
		result = i - j;
		System.out.println("거스름돈: "+result+"원");
		
		a= result/500;
		System.out.println("500원 짜리 동전: "+a+"개");
		
		b= (result-a*500)/100;
		System.out.println("100원 짜리 동전: "+b+"개");
		
		c= (result-((a*500)+(b*100)))/50;
		System.out.println("50원 짜리 동전: "+c+"개");
		
		d= (result-((a*500)+(b*100)+(c*50)))/10;
		System.out.println("10원 짜리 동전: "+d+"개");
		
		e= (result-((a*500)+(b*100)+(c*50)+(d*10)))/1;
		System.out.println("나머지 거스름돈: "+e+"원");
		
		sc.close();
		*/
		
		//변수 한개만 쓰고 풀기
		
		  Scanner sc = new Scanner(System.in);
		  
		  int money;
		 
		  System.out.print("\n\t계산하실 금액을 입력하세요: ");
		  money=sc.nextInt();
		  
		  System.out.print("\t구매하신 금액을 입력하세요: ");
		  money -=sc.nextInt();   //money한번밖에 못쓰니까 -=써서 거스름돈만 남기기, 복합대입연산자
		  
		  sc.close();
		  
		  System.out.printf("\n\t거스름돈: %d원",money);
		  System.out.printf("\n\t500원 짜리 동전: %d개",money/500);
		  
		  money %=500;
		  System.out.printf("\n\t100원 짜리 동전: %d개",money/100);
		  
		  money %=100;
		  System.out.printf("\n\t50원 짜리 동전: %d개",money/50);
		  
		  money %=50;
		  System.out.printf("\n\t10원 짜리 동전: %d개",money/10);
		  
		  money %=10;
		  System.out.printf("\n\t나머지 거스름돈: %d원",money/1);
		 
		  
		 
		 
		
		
		
		

		
		
		
	}

}
