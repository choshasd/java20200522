
public class Ex02 {
	Ex02(){
		myInter mi = new myInter() { 
			@Override
			public void doA() {
				System.out.println("mi �������̽�");
			}
		};
		doUseMyInter(new myInter() {
			@Override
			public void doA() {
				System.out.println("�͸��������̽�");
				
			}
			
		});
		doUseMyInter(mi);
		// �ֱٿ����� �ڹ��Լ�
		doUseMyInter(()->{System.out.println("���� �������̽�");});
	}
	public void doUseMyInter(myInter myinter) {
		myinter.doA();
	}
	public static void main(String[] args) {
		new Ex02();
	}
}
