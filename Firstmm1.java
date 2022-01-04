package ch2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Firstmm1 extends JPanel{

		
		  public void Firstmm1() {
	
		
		Frame f = new Frame("맛집이");
		
		//---------------------------------------------프레임 색
				System.out.println(f.getBounds().getWidth());
				System.out.println(f.getBounds().getHeight());

				f.setBackground(Color.PINK);
				
				
		//------------------------------------------------
				
				JLabel imgLabel = new JLabel();
		        ImageIcon bgImg = new ImageIcon("ss.png");

		        // 이미지 설정
		        imgLabel.setIcon(bgImg);
		        imgLabel.setBounds(50, 50 , 370, 300);
		        imgLabel.setHorizontalAlignment(JLabel.CENTER);
		        
		        f.add(imgLabel);
		 
		        
		      //-------------------------------------------------
				
				f.setBounds(300, 30 , 600, 720);//화면크기조정
				f.setLayout( new FlowLayout());
				
				Button b1 = new Button("랜덤으로 추천 해드릴게요 !");
				Button b2 = new Button("카테고리별로 추천 해드릴게요 !");
				Button b3 = new Button("종료");
			
				
				//button 크기 변경
				b1.setPreferredSize(new Dimension(400,100));
				b2.setPreferredSize(new Dimension(400,100));
				b3.setPreferredSize(new Dimension(400,100));
				
				//--------------------------------------------------
				//폰트
				//Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
				b1.setBackground(Color.yellow);
				b2.setBackground(Color.yellow);
				b3.setBackground(Color.yellow);
				
				b1.setFont(new Font("굴림", Font.BOLD, 22));
				b2.setFont(new Font("굴림", Font.BOLD, 22));
				b3.setFont(new Font("굴림", Font.BOLD, 22));

			
				//-----------------------------------------------
			
				f.add(b1);
				f.add(b2);
				f.add(b3);

				
				f.setVisible(true);
				f.setLayout(null);
				
				
				//=============================================================
				
				b1.addActionListener(new ActionListener() {
					
					
					 @Override
					 public void actionPerformed(ActionEvent e) {
				  
						 aa a = new aa();
							a.ab();
						
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
