package ch2;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class aa extends JPanel {
	
   
   public aa() {
	
   }
   
   
   public void ab() {
	  
      //설정 스윙값 넣고 
	  Frame f = new Frame("랜덤 맛집");
	  //System.out.println(f.getBounds().getWidth());
	 // System.out.println(f.getBounds().getHeight());

		f.setBackground(Color.PINK);
		f.setVisible(true);
		
		f.setBounds(300, 30 , 600, 720);//창위치
		f.setLayout( new FlowLayout());
      //-----------------------------------------------------------------------
	  
	  imadata d = new imadata(); //imadata클래스 생성자로부터 호출
      int i = new Random().nextInt(d.makeList().size());
    //  d.makeList().get(i).getCategoryName(); 
     
     //textarea값불러오기
      
  
     
     setLayout(null);
	 setSize(600,800);
		
	  JTextArea jt = new JTextArea ( " ♡ 매장 이름 : " + d.makeList().get(i).getPlaceName() + "\n ♡ 카테고리 : " +  d.makeList().get(i).getCategoryName()  + " > " + d.makeList().get(i).getCategoryDetail() 
		                          + "\n ♡ 주소 : " + d.makeList().get(i).getRoadAddressName() + "\n ♡ 대표 메뉴 : " + d.makeList().get(i).getPlaceBest() + "\n ♡ 매장 연락처 : " + d.makeList().get(i).getPhone() 
		                          + "\n ♡ 링크 :  " + d.makeList().get(i).getPlaceUrl() + "\n"); //♡ 이미지 : " + d.makeList().get(i).getPthoto() + "\n
		
		
		jt.setSize(200,600);
		jt.setLocation(0,0);
		jt.setBackground(Color.pink);
		jt.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));
		f.add(jt);
		jt.setLayout( new FlowLayout());
		
		//----------------------------------------------------------------
		
		JLabel imgLabel2 = new JLabel(Html.imgHtmlParser(d.makeList().get(i).getPthoto()));
        
        // 이미지 설정
        imgLabel2.setBounds(10, 300 , 50, 20);
        imgLabel2.setVisible(true);
        f.add(imgLabel2);
        imgLabel2.setLayout( new FlowLayout());
        
		//-------------------------------------------------------

	
     
     //보이는함수 쓰기
       jt.setVisible(true);
   	 
       
      //버튼
       Button btnOK = new Button("처음으로");
		btnOK.setBounds(70, 100, 1000, 500);
		btnOK.setBackground(Color.yellow);
		btnOK.setFont(new Font(Font.SANS_SERIF, Font.BOLD,22));
		
		Button btnClose = new Button("예약하기");
		btnClose.setBounds(btnOK.getBounds());//btnOK와 같은 Bounds로 만듬 => 두버튼이 겹쳐짐
		btnClose.setLocation(btnOK.getX()+btnOK.getWidth()+100, btnOK.getY()); //위치
		btnClose.setBackground(Color.yellow);
		btnClose.setFont(new Font(Font.SANS_SERIF, Font.BOLD,22));
		
		f.add(btnOK);
		f.add(btnClose);
		
		f.setVisible(true);
		
	//---------------------------------------------------------------------------------
		btnOK.addActionListener(new ActionListener() {
			
			 @Override
			 public void actionPerformed(ActionEvent e) {
		  
				 Firstmm1 button23=new Firstmm1();
			      button23.	Firstmm1();
				
			      }
			
			});
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ChoiceTest button13=new ChoiceTest ();
				button13.ChoiceTest ();
				
			}
			
		});
	
		
		
     // 종료
    	f.addWindowListener(new WindowAdapter() {
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
			
		}
	});

}
}