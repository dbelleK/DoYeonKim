package ch2;         

import java.awt.BorderLayout;
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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Project.frame.FrameBase1;
import Project.frame.FrameReserve;



	public class FrameButton {
		
    public void FrameButton() {
		
		
		Randoms rs = new Randoms();
		imadata data = new imadata();

		
        Frame f = new Frame("맛집선택");
        
        //---------------------------------------------프레임 색
		//f.setBounds(800,100,400,300);
		
		//System.out.println(f.getBounds().getWidth());
		//System.out.println(f.getBounds().getHeight());

		f.setBackground(Color.PINK);
		f.setVisible(true);
		//-------------------------------------------------
		
		   //JButton : 이미지 버튼
		   ImageIcon b1= new ImageIcon("a4.png");
	       JButton btn1 = new JButton(b1);
	       
	       //JTextField : 한 줄의 문자열을 입력받는 창(텍스트 필드)를 만들 수 있습니다
	       JTextField jr = new JTextField();
	       //setText : 텍스트필드 창에 text 출력
	       btn1.setText("한식");
	     
		
	       ImageIcon b2= new ImageIcon("b4.png");
	       JButton btn2 = new JButton(b2);
	       JTextField jr2 = new JTextField();
	       btn2.setText("중식");
	       
	       ImageIcon b3= new ImageIcon("c4.png");
	       JButton btn3 = new JButton(b3);
	       JTextField jr3 = new JTextField();
	       btn3.setText("일식");
	       
	       ImageIcon b4= new ImageIcon("d4.png");
	       JButton btn4 = new JButton(b4);
	       JTextField jr4 = new JTextField();
	       btn4.setText("양식");
	     
	       ImageIcon b5= new ImageIcon("b.png");
	       JButton btn5 = new JButton(b5);
	       JTextField jr5 = new JTextField();
	       btn4.setText("종료");
	       
	       ImageIcon b6= new ImageIcon("c.png");
	       JButton btn6 = new JButton(b6);
	       JTextField jr6 = new JTextField();
	       btn4.setText("처음으로");
	       
	
	  //-------------------------------------------------
		f.setBounds(300, 30 , 600, 720);//창위치
		f.setLayout( new FlowLayout());
		
		//Button btn1 = new Button("한식");
		//Button btn2 = new Button("중식");
		///Button btn3 = new Button("일식");
		//Button btn4 = new Button("양식");
		//Button btn5 = new Button("종료");
		//Button btn6 = new Button("돌아가기");
		
		//button 크기 변경
		btn1.setPreferredSize(new Dimension(220,220));
		btn2.setPreferredSize(new Dimension(220,220));
		btn3.setPreferredSize(new Dimension(220,220));
		btn4.setPreferredSize(new Dimension(220,220));
		btn5.setPreferredSize(new Dimension(220,220));
		btn6.setPreferredSize(new Dimension(220,220));
	
		//----------------------------------------------------
		//색깔
		btn1.setBackground(Color.yellow);
		btn2.setBackground(Color.yellow);
		btn3.setBackground(Color.yellow);
		btn4.setBackground(Color.yellow);
		btn5.setBackground(Color.yellow);
		btn6.setBackground(Color.yellow);

		btn1.setSize(300, 150); //setSize(컴포넌트 크기 결정, 단 Layout에 따라 setSize 사용 못 할수 있다
		btn1.setLocation(
				((int) btn1.getSize().getWidth() / 2) - 310, 
				(int) btn1.getLocation().getY() / 2 + 610);
		btn1.setFont(new Font("굴림", Font.BOLD, 22));
		
		btn2.setSize(300, 150);
		btn2.setLocation(
				(int) btn1.getLocation().getX() + 300, 
				(int) btn1.getLocation().getY());
		btn2.setFont(new Font("굴림", Font.BOLD, 22));
		
		btn3.setSize(300, 150);
		btn3.setLocation(
				(int) btn1.getLocation().getX() + 300, 
				(int) btn1.getLocation().getY());
		btn3.setFont(new Font("굴림", Font.BOLD, 22));
		
		btn4.setSize(300, 150);
		btn4.setLocation(
				(int) btn1.getLocation().getX() + 300, 
				(int) btn1.getLocation().getY());
		btn4.setFont(new Font("굴림", Font.BOLD, 22));
		
		btn5.setSize(300, 150);
		btn5.setLocation(
				(int) btn1.getLocation().getX() + 300, 
				(int) btn1.getLocation().getY());
		btn5.setFont(new Font("굴림", Font.BOLD, 22));
		
		btn6.setSize(300, 150);
		btn6.setLocation(
				(int) btn1.getLocation().getX() + 300, 
				(int) btn1.getLocation().getY());
		btn6.setFont(new Font("굴림", Font.BOLD, 22));
		//----------------------------------------------

		
		//----------------------------------------------
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		f.add(btn6);
		
		//f.pack();// 프레임에 내용물이 있으면 필요한 영역만큼 공간 확보
		f.setVisible(true); //나타내기
		f.setLayout(null); //자동배치 안되게
		
		

		
		btn1.addActionListener(new ActionListener() {
	
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//한식으로 정리 랜덤값 한식이야
				RestaurantDto dto = rs.getRandomRestaurantByCategory2(data,"한식");
				FrameBase2.getInstance(new select(dto));
				
				
			}
		});
		
	
		btn2.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//한식으로 정리 랜덤값 한식이야
				RestaurantDto dto = rs.getRandomRestaurantByCategory2(data,"중식" );
				FrameBase2.getInstance(new select(dto));
				
			}
		});
		
		
		btn3.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//한식으로 정리 랜덤값 한식이야
				RestaurantDto dto = rs.getRandomRestaurantByCategory2(data,"일식" );
				FrameBase2.getInstance(new select(dto));
				
				
			}
		});
		
		
		btn4.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//한식으로 정리 랜덤값 한식이야
				RestaurantDto dto = rs.getRandomRestaurantByCategory2(data,"양식");
				FrameBase2.getInstance(new select(dto));
				
				
			}
		});
		
		
		//==============================================================	
		btn5.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent e) {
					System.exit(0);
					
				}
			});
	//=====================================================================
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
		});
	//============================================================================

		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Firstmm1 button24=new Firstmm1();
			      button24.	Firstmm1();
				}
			});
}
	}
	
	
