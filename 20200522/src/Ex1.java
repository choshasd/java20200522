interface myInter{
	public void doA();
}

public class Ex1 implements myInter {
	Ex1(){
		doA();
	}
	@Override
	public void doA() {
		System.out.println("�������̽� ȣ��");
	}
	public static void main(String[] args) {
		new Ex1();
	}
}
