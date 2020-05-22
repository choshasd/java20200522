
public class Ex02 {
	Ex02(){
		myInter mi = new myInter() { 
			@Override
			public void doA() {
				System.out.println("mi 인터페이스");
			}
		};
		doUseMyInter(new myInter() {
			@Override
			public void doA() {
				System.out.println("익명인터페이스");
				
			}
			
		});
		doUseMyInter(mi);
		// 최근에나온 자바함수
		doUseMyInter(()->{System.out.println("람다 인터페이스");});
	}
	public void doUseMyInter(myInter myinter) {
		myinter.doA();
	}
	public static void main(String[] args) {
		new Ex02();
	}
}
