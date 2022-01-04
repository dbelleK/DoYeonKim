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
		
		
	
		
		Frame f = new Frame("맛집이");
		f.setBackground(Color.PINK);
		f.setBounds(300, 30 , 600, 720);//화면크기조정
		f.setLayout( new FlowLayout());
		//setLayout으로 frame의 레이아웃을 FlowLayout으로 정함
		//setPreferredSize();는 FlowLayout()의 컴포넌트 조정가능(setSize()는 안됨)
		
		//-----------------------------------------------------
			//	System.out.println(f.getBounds().getWidth());
			//	System.out.println(f.getBounds().getHeight());

				
				// 이미지 설정
				JLabel imgLabel = new JLabel(); //JLabel : 라벨 객체 (텍스트 박스) 를 생성합니다
		        ImageIcon bgImg = new ImageIcon("ss.png"); // 가지고 있는 이미지
		     
		        imgLabel.setIcon(bgImg);
		        imgLabel.setBounds(50, 50 , 370, 300);
		        f.add(imgLabel);
		        
		       // imgLabel.setHorizontalAlignment(JLabel.CENTER);
		 
		       //-------------------------------------------
				
				
				
				Button b1 = new Button("랜덤으로 추천 해드릴게요 !");
				Button b2 = new Button("카테고리별로 추천 해드릴게요 !");
				Button b3 = new Button("종료");
			
				
				//button 크기 변경
				//setPreferredSize(); Dimension객체를 인자로 받으면서 해당 콤포넌트의 '기본크기'를 결정
				//setPreferredSize();는 FlowLayout()의 컴포넌트 조정가능(setSize()는 안됨)
				b1.setPreferredSize(new Dimension(400,100));
				b2.setPreferredSize(new Dimension(400,100));
				b3.setPreferredSize(new Dimension(400,100));
				
				//--------------------------------------------------
				
				//button 색깔
				b1.setBackground(Color.yellow);
				b2.setBackground(Color.yellow);
				b3.setBackground(Color.yellow);
				
				//button 색깔
				b1.setFont(new Font("굴림", Font.BOLD, 22));
				b2.setFont(new Font("굴림", Font.BOLD, 22));
				b3.setFont(new Font("굴림", Font.BOLD, 22));

			
				//-----------------------------------------------
			    //frame에 버튼 추가
				f.add(b1);
				f.add(b2);
				f.add(b3);

				//frame 보여주기
				f.setVisible(true);
				
				//컴포넌트를 이리저리 자유롭게 하기위해 컨테이너 레이아웃 해제
				//f.setBounds(); 를 해줘야한다
				f.setLayout(null);
				
				
				//=============================================================
				
				b1.addActionListener(new ActionListener() { //버튼객체에 이벤트 생성
					
					
					 @Override
					 public void actionPerformed(ActionEvent e) {//버튼 클릭시 자동호출되는 메소드
				  
								aa a = new aa(); //aa클래스 생성자로부터 호출
								a.ab(); //생성된 a 참조변수가 ab메소드 호출
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


