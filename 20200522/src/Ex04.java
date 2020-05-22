import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
	Ex04(){
		try {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù ��° �� �Է� : ");
		int a = scan.nextInt();
		System.out.print("�� ��° �� �Է� :");
		int b = scan.nextInt();
		System.out.println("a/b = "+a/b);
		System.out.println("------- ���� ��� -------");
		scan.close();
		}catch(ArithmeticException ae) {
			System.out.println("-------- ���� ��Ȳ --------");
			ae.printStackTrace(); // ���� ���
		}catch(InputMismatchException ie) {
			System.out.println("���ڿ� �Է��������� ���� ��Ȳ");
			ie.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Ex04();
	}
}
