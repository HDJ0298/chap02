package chap03;

public class Ex3 {

	public static void main(String[] args) {
		byte b1 = 10, b2= 20, result;
		result = (byte) (b1 + b2);   //int프로모션  앞에 byte넣어주기
		
		System.out.println("result: " + result);   
		
		//byte + short -> int+int = int
		//char + int -> int+int = int
		//float + int -> float+float = float
		//long+float -> float+float = float
		//double + float
		

	}

}
