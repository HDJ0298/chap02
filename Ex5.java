package chap03;

public class Ex5 {

	public static void main(String[] args) {
		int num1 = 6, num2 = 4, result;   
		boolean bool1 = false, bool2 = true, bResult;
		//6�� 2������  num1 0110     4�� 2������  num2 0100
		
		
		
		/*
		
		result = num1 & num2;           //&�� ��ƮAND������                0100 => 4 
		System.out.println("result: "+result);
		
		bResult = bool1 & bool2;  //&�� ��AND������    �ǿ����ڰ� ������ ��ƮAND������,   
		System.out.println("bResult: "+bResult);
		*/
		
		
		
		result = num1 | num2;           //|�� ��ƮOR������                0110 => 6
		System.out.println("result: "+result);
		
		bResult = bool1 | bool2;  //|�� ��AND������    �ǿ����ڰ� �����̸� ��ƮOR������,    �ǿ����ڰ� �����̸� ��AND������
		System.out.println("bResult: "+bResult);

	}

}
