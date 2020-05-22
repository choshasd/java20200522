import javax.swing.JOptionPane;

class A{
	private int a = 10;
	
}
class B extends A{
	private int b = 20;
}
public class Ex05 {
	
	Ex05(){
		try {
		int[] arr = {1,2,3};
		
		for(int i = 0; i <4; i++) {
			System.out.println("arr[i] = "+arr[i]); // IndexOutofBoundsException
			A a = new A();
			B b = (B) a;  // ClasscastException
		}	
		
		
		String c = null;
		System.out.println(c.length()); // NullPointerException
		}catch(ArrayIndexOutOfBoundsException e){  // 지역변수이기때문에 e는 이 catch안에서만 유효
			System.out.println("배열범위 벗어남");
		}catch(ClassCastException e) {
			System.out.println("클래스 형변환 실패");
		}catch(NullPointerException e) {
			System.out.println("클래스 형변환 실패");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("정상종료");
		
		String test = JOptionPane.showInputDialog("입력하세요");
		System.out.println("test = "+test);
		
		int inputTest = 0;
		try {
			if(( inputTest = Integer.parseInt(test)) == 1) {
				System.out.println("1을 입력하였습니다");
			}
		}catch(Exception e) {
			System.out.println("만약에 문자열 입력하면 무조건 0");
		}
		
	}
	public static void main(String[] args) {
		new Ex05();
	}
}
