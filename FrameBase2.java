package ch2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameBase2 extends JFrame{

	private static FrameBase2 instance;

	private FrameBase2(JPanel e) {
		//시스템 정보(화면 크기를 얻기 위한 Toolkit)
		Toolkit tk = Toolkit.getDefaultToolkit();//해상도

		//------------------------------------------------
		JPanel jp = new JPanel();
		System.out.println(jp.getBounds().getWidth());
		System.out.println(jp.getBounds().getHeight());

		jp.setBackground(Color.PINK);
		jp.setBounds(300, 30 , 600, 720);//화면크기조정
		jp.setLayout( new FlowLayout());
		jp.setVisible(true);
		jp.setLayout(null);
		
		//------------------------------------------------
		//기본 JFrame 구조
		setTitle("이 식당을 추천합니다 !");
		setLayout(null);
		setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 70, 
				((int) tk.getScreenSize().getHeight()) / 2 - 520,
				600, 750);
		add(e);
		setBackground(Color.pink);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼
	}//생성자

	//싱글톤 : 인스턴스를 단 하나만 생성하는 디자인 패턴
	//싱글톤 기법을 사용하려고 한다
	public static void getInstance(JPanel e) {
			//static으로 선언했으므로 해당 메서드가 생성자보다도 먼저 호출된다
			instance = new FrameBase2(e);//생성자를 통해 기본 프레임 정의
			
			instance.getContentPane().removeAll();
			instance.getContentPane().add(e);
			
			instance.revalidate(); //레이아웃 관리자에게 레이아웃정보를 다시 계산하도록 지시
			instance.repaint(); //레이아웃을 새로 그린다
	}//getInstance()
}
