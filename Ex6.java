package chap03;

public class Ex6 {

	public static void main(String[] args) {
		int num1 = 5, num2 = 5;
		boolean result;
		
		
		/*
		result = num1 > 10 & num2 ++ > 5;  //false
		System.out.println("result: "+result+ ", num2: "+num2);
		 */
		/*
		result = num1 > 10 && num2 ++ > 5;  // &&인데 num2++ 평가 안함 
		System.out.println("result: "+result+ ", num2: "+num2);
		*/
		/*
		result = num1 < 10 | num2 ++ > 5;  //true 라서 뒤에 평가할필요없는데 평가했음
		System.out.println("result: "+result+ ", num2: "+num2);
		*/
		
		result = num1 < 10 || num2 ++ > 5;  //true 라서 뒤에 평가x
		System.out.println("result: "+result+ ", num2: "+num2);
	}

}
