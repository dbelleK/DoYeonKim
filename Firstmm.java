package ch2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Firstmm extends JPanel{

	public static void main(String[] args) {
		
		
	
		
		Frame f = new Frame("������");
		f.setBackground(Color.PINK);
		f.setBounds(300, 30 , 600, 720);//ȭ��ũ������
		f.setLayout( new FlowLayout());
		//setLayout���� frame�� ���̾ƿ��� FlowLayout���� ����
		//setPreferredSize();�� FlowLayout()�� ������Ʈ ��������(setSize()�� �ȵ�)
		
		//-----------------------------------------------------
			//	System.out.println(f.getBounds().getWidth());
			//	System.out.println(f.getBounds().getHeight());

				
				// �̹��� ����
				JLabel imgLabel = new JLabel(); //JLabel : �� ��ü (�ؽ�Ʈ �ڽ�) �� �����մϴ�
		        ImageIcon bgImg = new ImageIcon("ss.png"); // ������ �ִ� �̹���
		     
		        imgLabel.setIcon(bgImg);
		        imgLabel.setBounds(50, 50 , 370, 300);
		        f.add(imgLabel);
		        
		       // imgLabel.setHorizontalAlignment(JLabel.CENTER);
		 
		       //-------------------------------------------
				
				
				
				Button b1 = new Button("�������� ��õ �ص帱�Կ� !");
				Button b2 = new Button("ī�װ����� ��õ �ص帱�Կ� !");
				Button b3 = new Button("����");
			
				
				//button ũ�� ����
				//setPreferredSize(); Dimension��ü�� ���ڷ� �����鼭 �ش� ������Ʈ�� '�⺻ũ��'�� ����
				//setPreferredSize();�� FlowLayout()�� ������Ʈ ��������(setSize()�� �ȵ�)
				b1.setPreferredSize(new Dimension(400,100));
				b2.setPreferredSize(new Dimension(400,100));
				b3.setPreferredSize(new Dimension(400,100));
				
				//--------------------------------------------------
				
				//button ����
				b1.setBackground(Color.yellow);
				b2.setBackground(Color.yellow);
				b3.setBackground(Color.yellow);
				
				//button ����
				b1.setFont(new Font("����", Font.BOLD, 22));
				b2.setFont(new Font("����", Font.BOLD, 22));
				b3.setFont(new Font("����", Font.BOLD, 22));

			
				//-----------------------------------------------
			    //frame�� ��ư �߰�
				f.add(b1);
				f.add(b2);
				f.add(b3);

				//frame �����ֱ�
				f.setVisible(true);
				
				//������Ʈ�� �̸����� �����Ӱ� �ϱ����� �����̳� ���̾ƿ� ����
				//f.setBounds(); �� ������Ѵ�
				f.setLayout(null);
				
				
				//=============================================================
				
				b1.addActionListener(new ActionListener() { //��ư��ü�� �̺�Ʈ ����
					
					
					 @Override
					 public void actionPerformed(ActionEvent e) {//��ư Ŭ���� �ڵ�ȣ��Ǵ� �޼ҵ�
				  
								aa a = new aa(); //aaŬ���� �����ڷκ��� ȣ��
								a.ab(); //������ a ���������� ab�޼ҵ� ȣ��
					 }
					});
				
				
		
			
				
				b2.addActionListener(new ActionListener() {
			
						
				 @Override
				 public void actionPerformed(ActionEvent e) {
			  
					 FrameButton button2=new FrameButton();
				      button2.FrameButton();
				      }
				
				});
				
			
				//==============================================================	
				b3.addActionListener(new ActionListener() {
						
					@Override
					public void actionPerformed(ActionEvent e) {
							System.exit(0);
							
						}
					});
				
				f.addWindowListener(new WindowAdapter() {
					
					@Override
					public void windowClosing(WindowEvent e) {
						System.exit(0);
						
					}
				});
				
	

}

}


