package ch2;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Project.frame.FrameBase1;
import Project.frame.FrameMovieConfirm;
import Project.frame.MyMovie;

public class ChoiceTest {

	public void ChoiceTest() {
		
		Frame f = new Frame("예약하기");
		System.out.println(f.getBounds().getWidth());
		System.out.println(f.getBounds().getHeight());

		f.setBackground(Color.PINK);
		f.setVisible(true);
		f.setBounds(300, 30 , 600, 720);//창위치
		f.setLayout( new FlowLayout());
		
		Choice day = new Choice();
		
		day.add("요일선택");
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");
		
		day.setSize(400,0);
		day.setLocation(50,100);
		day.setBackground(Color.white);
	//--------------------------------------------------------------
		Button b1 = new Button("처음으로");
		Button b2 = new Button("종료");

		//button 크기 변경
		b1.setPreferredSize(new Dimension(100,50));
		b2.setPreferredSize(new Dimension(100,50));
		
		b1.setBackground(Color.yellow);
		b2.setBackground(Color.yellow);
		
		
		b1.setFont(new Font("굴림", Font.BOLD, 20));
		b2.setFont(new Font("굴림", Font.BOLD, 20));

		f.add(b1);
		f.add(b2);

		f.setVisible(true);
		f.setLayout(null);
	//----------------------------------------------------------------------------
		

		/*
		//---------------------------------------------
		String[] seatn = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		for (int i = 0; i < seatn.length; i++) {
			
			if (i == 1) {
				JOptionPane.showMessageDialog(
						null, "일요일 예약되셨습니다");
				break;
			} else if (i == 2) {
				JOptionPane.showMessageDialog(
						null, "월요일 예약되셨습니다");
				break;
			} else if (i == 3) {
				JOptionPane.showMessageDialog(
						null, "화요일 예약되셨습니다");
				break;
			} else if (i == 4) {
				JOptionPane.showMessageDialog(
						null, "수요일 예약되셨습니다");
				break;
	    	} else if (i == 5) {
			    JOptionPane.showMessageDialog(
				     	null, "목요일 예약되셨습니다");
			    break;
	       } else if (i == 6) {
		        JOptionPane.showMessageDialog(
				       null, "금요일 예약되셨습니다");
		        break;
           } else if (i == 7) {
	            JOptionPane.showMessageDialog(
			         null, "토요일 예약되셨습니다");
	            break;
           
	     	}
		
		//--------------------------------------------
		 */
		
		f.add(day);
		f.setVisible(true);
		 
         day.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				JOptionPane.showMessageDialog(null, "예약이 완료되었습니다");
				String indexName = day.getSelectedItem();
				//label.setText(indexName);
			}
		});

         
        
         
         //------------------------------------------------------------------
         b1.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				Firstmm1 button24=new Firstmm1();
 			      button24.	Firstmm1();
 				}
 			});
         
         
         
         //-----------------------------------------------------------------
         b2.addActionListener(new ActionListener() {
				
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


