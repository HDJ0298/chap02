package chap03;
import java.util.Scanner;

/*
  ����ڿ��� �ϳ��� �Ǽ��� �Է� �޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
  ������1-
  �ϳ��� �Ǽ��� �Է��ϼ���> 3.64
  ����: 3
  �ݿø�: 4
  
  ������2-
  �ϳ��� �Ǽ��� �Է��ϼ���: 6.2364
  ����: 6
  �ݿø�:6
 */
public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner sc = new Scanner(System.in);
		
		float i=0;
		int result1;
		
		System.out.print("�ϳ��� �Ǽ��� �Է��ϼ���: ");
		i = sc.nextFloat();
		
			
		result1 = (int)i;
		System.out.println("����: "+result1);
		System.out.printf("�ݿø�: %.0f", i);
		
		
		sc.close();
		*/
		
		/*
		 * 
		 Scanner sc = new Scanner(System.in);
		 double num;
		 
		 System.out.print("\n\t�ϳ��� �Ǽ��� �Է��ϼ���: ");
		 num = sc.nextDouble();
		 
		 System.out.print("����: "+(int)num);
		 System.out.print("�ݿø�: "+(int)(num+0.5));
		 
		 sc.close();
		 
		  */
		
		
		
		Scanner sc = new Scanner(System.in);
		double num;
		
		System.out.print("�Ǽ��� �Է��ϼ���: ");
		num=sc.nextDouble();
		
		System.out.println("����: "+(int)num);
		System.out.println("�ݿø�: "+(int)(num+0.5));
		

	}

}
