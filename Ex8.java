package chap03;
import java.util.Scanner;


/*
 1.����ڿ��� ����� ���� ������ �Է����� �޾� �ΰ��� ��� 80�� �̻��̸� true �ƴϸ� false ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
 
 	    int math = 0,eng = 0;
		boolean result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���������� ���������� �Է��ϼ���: ");
		
		eng = sc.nextInt();
		math = sc.nextInt();
		sc.close();
		
		result = eng>=80 && math>=80;
		System.out.println("result: "+result);
 
  */

/*
 2.����ڿ��� ����� ���������� �Է����� �޾� �� ������ �� �����̶� 80�� �̸��� ������ ������ true, �ƴϸ� false���� ����ϴ� �ڵ带 �ۼ��ϼ���.
 
 
 	   int math = 0,eng = 0;
		boolean result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���������� ���������� �Է��ϼ���: ");
		
		eng = sc.nextInt();
		math = sc.nextInt();
		sc.close();
		
		result = eng<80 || math<80;
		System.out.println("result: "+result);
  */


/*
   3. ����ڿ��� ����� ���������� �Է����� �޾� �� ������ ��� 80�� �̻��̸� true, �ƴϸ� false���� ����ϴ� �ڵ带 �ۼ��ϼ���.
    �� and������ ���x
 */
public class Ex8 {

	public static void main(String[] args) {
		
		int math = 0,eng = 0;
		boolean result;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���������� ���������� �Է��ϼ���: ");
		
		eng = sc.nextInt();
		math = sc.nextInt();
		sc.close();
		
		
		result = !(eng <80 || math <80); 
		
		System.out.println("result: "+ result);
		
		
		
		
		

	}

}
