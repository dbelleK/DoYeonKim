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
	  
      //���� ������ �ְ� 
	  Frame f = new Frame("���� ����");
	  //System.out.println(f.getBounds().getWidth());
	 // System.out.println(f.getBounds().getHeight());

		f.setBackground(Color.PINK);
		f.setVisible(true);
		
		f.setBounds(300, 30 , 600, 720);//â��ġ
		f.setLayout( new FlowLayout());
      //-----------------------------------------------------------------------
	  
	  imadata d = new imadata(); //imadataŬ���� �����ڷκ��� ȣ��
      int i = new Random().nextInt(d.makeList().size());
    //  d.makeList().get(i).getCategoryName(); 
     
     //textarea���ҷ�����
      
  
     
     setLayout(null);
	 setSize(600,800);
		
	  JTextArea jt = new JTextArea ( " �� ���� �̸� : " + d.makeList().get(i).getPlaceName() + "\n �� ī�װ� : " +  d.makeList().get(i).getCategoryName()  + " > " + d.makeList().get(i).getCategoryDetail() 
		                          + "\n �� �ּ� : " + d.makeList().get(i).getRoadAddressName() + "\n �� ��ǥ �޴� : " + d.makeList().get(i).getPlaceBest() + "\n �� ���� ����ó : " + d.makeList().get(i).getPhone() 
		                          + "\n �� ��ũ :  " + d.makeList().get(i).getPlaceUrl() + "\n"); //�� �̹��� : " + d.makeList().get(i).getPthoto() + "\n
		
		
		jt.setSize(200,600);
		jt.setLocation(0,0);
		jt.setBackground(Color.pink);
		jt.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));
		f.add(jt);
		jt.setLayout( new FlowLayout());
		
		//----------------------------------------------------------------
		
		JLabel imgLabel2 = new JLabel(Html.imgHtmlParser(d.makeList().get(i).getPthoto()));
        
        // �̹��� ����
        imgLabel2.setBounds(10, 300 , 50, 20);
        imgLabel2.setVisible(true);
        f.add(imgLabel2);
        imgLabel2.setLayout( new FlowLayout());
        
		//-------------------------------------------------------

	
     
     //���̴��Լ� ����
       jt.setVisible(true);
   	 
       
      //��ư
       Button btnOK = new Button("ó������");
		btnOK.setBounds(70, 100, 1000, 500);
		btnOK.setBackground(Color.yellow);
		btnOK.setFont(new Font(Font.SANS_SERIF, Font.BOLD,22));
		
		Button btnClose = new Button("�����ϱ�");
		btnClose.setBounds(btnOK.getBounds());//btnOK�� ���� Bounds�� ���� => �ι�ư�� ������
		btnClose.setLocation(btnOK.getX()+btnOK.getWidth()+100, btnOK.getY()); //��ġ
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
	
		
		
     // ����
    	f.addWindowListener(new WindowAdapter() {
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
			
		}
	});

}
}