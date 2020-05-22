
public interface InterPhone {
	public void recv();
//	public void send();
}
interface newPhone extends InterPhone{
	public void send();	
	
	static public void kakao() {
		System.out.println("kakaoTalk");
	};
	default public void internet() {
		System.out.println("Default를 쓰면서 몸체를 만들수 있다");
	};
}
