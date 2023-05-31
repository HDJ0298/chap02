package chap03;

public class Ex5 {

	public static void main(String[] args) {
		int num1 = 6, num2 = 4, result;   
		boolean bool1 = false, bool2 = true, bResult;
		//6은 2진수로  num1 0110     4의 2진수는  num2 0100
		
		
		
		/*
		
		result = num1 & num2;           //&는 비트AND연산자                0100 => 4 
		System.out.println("result: "+result);
		
		bResult = bool1 & bool2;  //&는 논리AND연산자    피연산자가 정수면 비트AND연산자,   
		System.out.println("bResult: "+bResult);
		*/
		
		
		
		result = num1 | num2;           //|는 비트OR연산자                0110 => 6
		System.out.println("result: "+result);
		
		bResult = bool1 | bool2;  //|는 논리AND연산자    피연산자가 논리값이면 비트OR연산자,    피연산자가 논리값이면 논리AND연산자
		System.out.println("bResult: "+bResult);

	}

}
