import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// ��ӵڿ� JFrame.00.00�ϸ� import �ȹ޾Ƶ� ��
public class FormEx1 extends JFrame {
	
		private JButton btn1 = new JButton("��ư");
		private JButton btn2 = new JButton("��ư");
	
		FormEx1(){
			super("����");
			initcomponent();
		}
		public void initcomponent() {
			this.setLayout(null);
			
			this.setSize(300, 500);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â���� �������
			this.add(btn1);
			this.add(btn2);
//			this.btn1.setLocation(50, 50); �ؿ��� �� ���� ����
			this.btn1.setBounds(10, 10, 120, 50);
			this.btn1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(1);
				}
			});
			this.btn2.setBounds(150, 10, 120, 50);
			this.btn2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(2);		
				}
			});
		}
		public static void main(String[] args) {
			new FormEx1();
		}
}
