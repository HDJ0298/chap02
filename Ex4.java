package chap03;

public class Ex4 {

	public static void main(String[] args) {
		int num1 = 1000000, num2 = 2000000;
		long result;
		
		result = (long)num1 * num2;   //int*int = int  int값 범위내에서 순환했음
		
		System.out.println("result: "+result);

	}

}
