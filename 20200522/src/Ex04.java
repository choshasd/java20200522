import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
	Ex04(){
		try {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 수 입력 : ");
		int a = scan.nextInt();
		System.out.print("두 번째 수 입력 :");
		int b = scan.nextInt();
		System.out.println("a/b = "+a/b);
		System.out.println("------- 정상 출력 -------");
		scan.close();
		}catch(ArithmeticException ae) {
			System.out.println("-------- 예외 상황 --------");
			ae.printStackTrace(); // 오류 출력
		}catch(InputMismatchException ie) {
			System.out.println("문자열 입력으로인한 예외 상황");
			ie.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Ex04();
	}
}
