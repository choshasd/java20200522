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
		}catch(ArrayIndexOutOfBoundsException e){  // ���������̱⶧���� e�� �� catch�ȿ����� ��ȿ
			System.out.println("�迭���� ���");
		}catch(ClassCastException e) {
			System.out.println("Ŭ���� ����ȯ ����");
		}catch(NullPointerException e) {
			System.out.println("Ŭ���� ����ȯ ����");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("��������");
		
		String test = JOptionPane.showInputDialog("�Է��ϼ���");
		System.out.println("test = "+test);
		
		int inputTest = 0;
		try {
			if(( inputTest = Integer.parseInt(test)) == 1) {
				System.out.println("1�� �Է��Ͽ����ϴ�");
			}
		}catch(Exception e) {
			System.out.println("���࿡ ���ڿ� �Է��ϸ� ������ 0");
		}
		
	}
	public static void main(String[] args) {
		new Ex05();
	}
}
