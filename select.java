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
import javax.swing.JLabel;
import javax.swing.JPanel;

public class select extends JPanel{
	

	public  select (RestaurantDto e) {


		setLayout(null);
		setSize(600,1000);
		setBackground(Color.PINK);
		

		
		TextArea ta = new TextArea(" �� ���� �̸� : " + e.getPlaceName() + "\n \n �� ī�װ� : " + e.getCategoryName() + " > " + e.getCategoryDetail() 
		                          + "\n\n �� �ּ� : " + e. getRoadAddressName() + "\n\n �� ��ǥ �޴� : " + e.getPlaceBest() + "\n\n �� ���� ����ó : " + e.getPhone() 
		                          + "\n\n �� ��ũ :  " + e.getPlaceUrl() + "\n\n "); //�� �̹��� : " + e.getPthoto() + "\n
		
		
		ta.setSize(600,400);
		ta.setLocation(0,0);
		ta.setBackground(Color.PINK);
		ta.setFont(new Font(Font.SANS_SERIF, Font.BOLD,22));
		add(ta);
		
		

		
		
		//------------------------------------------------------
		JLabel imgLabel2 = new JLabel(Html.imgHtmlParser(e.getPthoto()));
        
      
        // �̹��� ����
        
        imgLabel2.setBounds(10, 400 , 400, 300);
        //imgLabel2.setBackground(Color.pink);
        add(imgLabel2);
		//-------------------------------------------------------
		
		 
		//JLabel lblImage = new JLabel();
	//	lblImage.setBounds(93, 10, 256, 256);
		
	
				
				Frame f = new Frame("���࿩��");
				f.setBounds(300, 30 , 600, 720);
				f.setBackground(Color.pink);
				
				f.setLayout(null);//�ڵ���ġ�� ����
				Button btnOK = new Button("�����ϱ�");
				btnOK.setBounds(70, 100, 200, 100);
				btnOK.setBackground(Color.yellow);
				btnOK.setFont(new Font(Font.SANS_SERIF, Font.BOLD,23));
				
				Button btnClose = new Button("�ٽ� ����ޱ�");
				btnClose.setBounds(btnOK.getBounds());//btnOK�� ���� Bounds�� ���� => �ι�ư�� ������
				btnClose.setLocation(btnOK.getX()+btnOK.getWidth()+60, btnOK.getY()); //��ġ
				btnClose.setBackground(Color.yellow);
				btnClose.setFont(new Font(Font.SANS_SERIF, Font.BOLD,23));
		
				
				f.add(btnOK);
				f.add(btnClose);
		
				
				f.setVisible(true);
				
				
				//-----------------------------------------------------------------------
				JLabel imgLabel = new JLabel();
		        ImageIcon bgImg = new ImageIcon("ee.png");

		        // �̹��� ����
		        imgLabel.setIcon(bgImg);
		        imgLabel.setBounds(0,250, 600, 400);
		        imgLabel.setHorizontalAlignment(JLabel.CENTER);
		        
		        f.add(imgLabel);
				//------------------------------------------------------------------------
				 
				 
				btnOK.addActionListener(new ActionListener() {
				
					 @Override
					 public void actionPerformed(ActionEvent e) {
				  
						 ChoiceTest button25=new ChoiceTest();
					      button25.	ChoiceTest();
					      
					      
						
					      }
					
					});
			
				
				btnClose.addActionListener(new ActionListener() {
					
					 @Override
					 public void actionPerformed(ActionEvent e) {
						 
						 FrameButton button23=new FrameButton();
					      button23.FrameButton();
					    
						
					      }
					
					});
				
				
				
				//�����ư ����
						f.addWindowListener(new WindowAdapter() {
						@Override
							public void windowClosing(WindowEvent e) {
								System.exit(0);
							}
						});
		
		
		
		
}
}
