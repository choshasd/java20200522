class SLPhone implements newPhone{
	@Override
	public void recv() {
		System.out.println("��ȭ ����");
	}
	@Override
	public void send() {
		System.out.println("��ȭ �Ǵ�");
	}
}
public class Phone {
	Phone(){
		SamsungPhone sp = new SamsungPhone();
		sp.recv();
		LgPhone lp = new LgPhone();
		lp.recv();
		
		SLPhone slp = new SLPhone();
		slp.send();
		slp.recv();
		
		newPhone.kakao(); // interface���� static���� ���� �� ���
		
		slp.internet();
	}
	public static void main(String[] args) {
		new Phone();
	}
}
