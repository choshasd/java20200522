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
		System.out.println(MyVari.DBURL); // ���� interface������ public static final�� ������ ������
		
		System.out.println(MyInterface.AA);
		System.out.println(MyInterface.BB);
		
//		MyInterface.AA = 30; // public static final �̱� ������ ���� �����Ҽ�����
	
		MyInterface mf = new MyInterface() {
			@Override
			public void doMyInterface() {     	// public ����������� �ڵ����� ��
				System.out.println("�׽�Ʈ");
			}
		};
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}
