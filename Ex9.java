package chap03;

import java.util.Scanner;

/*
 1.����ڿ��� ����� ���� ������ �Է����� �޾� �ΰ��� ��� 80�� �̻��̸� "�հ��Դϴ�" �ƴϸ� "���հ��Դϴ�" ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
 2.����ڿ��� ����� ���� ������ �Է����� �޾� �� ������ �� �����̶� 80�� �̸��� ������ ������ "������ ������ �����մϴ�", �ƴϸ� "�����ΰ����� �����ϴ�"
   ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
 3. ����ڿ��� ����� ���������� �Է����� �޾� �� ������ ��� 80�� �̻��̸� "�հ��Դϴ�" �ƴϸ� "���հ��Դϴ�"���� ����ϴ� �ڵ带 �ۼ��ϼ���.
    �� and������ ���x 
 
  */

public class Ex9 {

	public static void main(String[] args) {
		int math = 0,eng = 0;
		boolean result;
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���������� ���������� �Է��ϼ���: ");
		
		eng = sc.nextInt();
		math = sc.nextInt();
		sc.close();
		
		
		/* 1��
		result = math >= 80 && eng>=80;
		
		System.out.println("result: "+ (result ? "�հ��Դϴ�" :"���հ��Դϴ�"));
		*/
		
		/* 2��
		result = math <80 || eng<80;
		
		System.out.println("result: "+ (result ? "������ ������ �����մϴ�." :"������ ������ �����ϴ�."));
		*/
		
		
		result = !(eng <80 || math <80); 
		
		System.out.println("result: "+ (result ? "�հ��Դϴ�" :"���հ��Դϴ�"));

	}

}
