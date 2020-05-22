import aa.bb.MyInterface;

class MyConstant{
	
	public static final String DBUrl = "192.168.0.198";
	public static final String DBUser = "seongho";
	public static final String DBpass = "1234";	
}
interface MyVari{
	String DBURL = "192.168.0.198";
}

public class Ex03 {
	Ex03(){
		System.out.println(MyConstant.DBUrl);
		System.out.println(MyVari.DBURL); // 위에 interface에서는 public static final이 생략된 상태임
		
		System.out.println(MyInterface.AA);
		System.out.println(MyInterface.BB);
		
//		MyInterface.AA = 30; // public static final 이기 때문에 값을 변경할수없다
	
		MyInterface mf = new MyInterface() {
			@Override
			public void doMyInterface() {     	// public 선언안했지만 자동으로 들어감
				System.out.println("테스트");
			}
		};
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}
