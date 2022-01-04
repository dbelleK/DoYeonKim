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
		

		
		TextArea ta = new TextArea(" ♡ 매장 이름 : " + e.getPlaceName() + "\n \n ♡ 카테고리 : " + e.getCategoryName() + " > " + e.getCategoryDetail() 
		                          + "\n\n ♡ 주소 : " + e. getRoadAddressName() + "\n\n ♡ 대표 메뉴 : " + e.getPlaceBest() + "\n\n ♡ 매장 연락처 : " + e.getPhone() 
		                          + "\n\n ♡ 링크 :  " + e.getPlaceUrl() + "\n\n "); //♡ 이미지 : " + e.getPthoto() + "\n
		
		
		ta.setSize(600,400);
		ta.setLocation(0,0);
		ta.setBackground(Color.PINK);
		ta.setFont(new Font(Font.SANS_SERIF, Font.BOLD,22));
		add(ta);
		
		

		
		
		//------------------------------------------------------
		JLabel imgLabel2 = new JLabel(Html.imgHtmlParser(e.getPthoto()));
        
      
        // 이미지 설정
        
        imgLabel2.setBounds(10, 400 , 400, 300);
        //imgLabel2.setBackground(Color.pink);
        add(imgLabel2);
		//-------------------------------------------------------
		
		 
		//JLabel lblImage = new JLabel();
	//	lblImage.setBounds(93, 10, 256, 256);
		
	
				
				Frame f = new Frame("예약여부");
				f.setBounds(300, 30 , 600, 720);
				f.setBackground(Color.pink);
				
				f.setLayout(null);//자동배치를 끈다
				Button btnOK = new Button("예약하기");
				btnOK.setBounds(70, 100, 200, 100);
				btnOK.setBackground(Color.yellow);
				btnOK.setFont(new Font(Font.SANS_SERIF, Font.BOLD,23));
				
				Button btnClose = new Button("다시 추출받기");
				btnClose.setBounds(btnOK.getBounds());//btnOK와 같은 Bounds로 만듬 => 두버튼이 겹쳐짐
				btnClose.setLocation(btnOK.getX()+btnOK.getWidth()+60, btnOK.getY()); //위치
				btnClose.setBackground(Color.yellow);
				btnClose.setFont(new Font(Font.SANS_SERIF, Font.BOLD,23));
		
				
				f.add(btnOK);
				f.add(btnClose);
		
				
				f.setVisible(true);
				
				
				//-----------------------------------------------------------------------
				JLabel imgLabel = new JLabel();
		        ImageIcon bgImg = new ImageIcon("ee.png");

		        // 이미지 설정
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
				
				
				
				//종료버튼 감지
						f.addWindowListener(new WindowAdapter() {
						@Override
							public void windowClosing(WindowEvent e) {
								System.exit(0);
							}
						});
		
		
		
		
}
}
