class SLPhone implements newPhone{
	@Override
	public void recv() {
		System.out.println("전화 받음");
	}
	@Override
	public void send() {
		System.out.println("전화 건다");
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
		
		newPhone.kakao(); // interface에서 static으로 선얼 할 경우
		
		slp.internet();
	}
	public static void main(String[] args) {
		new Phone();
	}
}
