package chap03;

import java.util.Scanner;

/*
   [������ȯ ���α׷�]
   ������ ���� ����� ���� ���α׷��� �ۼ��ϼ���.
   
   ������=
   ����Ͻ� �ݾ��� �Է��ϼ���. 10000
   �����Ͻ� �ݾ��� �Է��ϼ���: 6234
   
   �Ž�����: 3766��
   500��¥�� ����: 7��
   100��¥�� ����: 2��
   50��¥�� ����:1��
   10��¥�� ����:1��
   ������ �Ž�����: 6��
   
   �ۼ�����:
   1.�������� ���� �̿��Ͽ� ������ �ذ��ϱ�.
   2.�ϳ��� ������ ����Ͽ� ������ �ذ��մϴ�.
 */

public class Exam2 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		int i=0, j=0;
		int result =0;
		int a,b,c,d,e;
		
		System.out.print("����Ͻ� �ݾ��� �Է��ϼ���: ");
		i=sc.nextInt();
		System.out.print("�����Ͻ� �ݾ��� �Է��ϼ���: ");
		j=sc.nextInt();
		
		result = i - j;
		System.out.println("�Ž�����: "+result+"��");
		
		a= result/500;
		System.out.println("500�� ¥�� ����: "+a+"��");
		
		b= (result-a*500)/100;
		System.out.println("100�� ¥�� ����: "+b+"��");
		
		c= (result-((a*500)+(b*100)))/50;
		System.out.println("50�� ¥�� ����: "+c+"��");
		
		d= (result-((a*500)+(b*100)+(c*50)))/10;
		System.out.println("10�� ¥�� ����: "+d+"��");
		
		e= (result-((a*500)+(b*100)+(c*50)+(d*10)))/1;
		System.out.println("������ �Ž�����: "+e+"��");
		
		sc.close();
		*/
		
		//���� �Ѱ��� ���� Ǯ��
		
		  Scanner sc = new Scanner(System.in);
		  
		  int money;
		 
		  System.out.print("\n\t����Ͻ� �ݾ��� �Է��ϼ���: ");
		  money=sc.nextInt();
		  
		  System.out.print("\t�����Ͻ� �ݾ��� �Է��ϼ���: ");
		  money -=sc.nextInt();   //money�ѹ��ۿ� �����ϱ� -=�Ἥ �Ž������� �����, ���մ��Կ�����
		  
		  sc.close();
		  
		  System.out.printf("\n\t�Ž�����: %d��",money);
		  System.out.printf("\n\t500�� ¥�� ����: %d��",money/500);
		  
		  money %=500;
		  System.out.printf("\n\t100�� ¥�� ����: %d��",money/100);
		  
		  money %=100;
		  System.out.printf("\n\t50�� ¥�� ����: %d��",money/50);
		  
		  money %=50;
		  System.out.printf("\n\t10�� ¥�� ����: %d��",money/10);
		  
		  money %=10;
		  System.out.printf("\n\t������ �Ž�����: %d��",money/1);
		 
		  
		 
		 
		
		
		
		

		
		
		
	}

}
