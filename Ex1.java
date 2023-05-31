package chap03;

public class Ex1 {

	public static void main(String[] args) {
		int num1 = 5, num2 = 2, result;
		
		result = num1 + num2;
		System.out.println("result: " + result);
		
		result = num1 - num2;
		System.out.println("result: " + result);
		
		result = num1 * num2;
		System.out.println("result: " + result);
		
		result = num1 / num2;
		System.out.println("result: " + result);
		System.out.println("result: " + ((double)num1/num2));  //double 은 나누기하면 뒤에도 double됨

	}

}
