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
		//�ý��� ����(ȭ�� ũ�⸦ ��� ���� Toolkit)
		Toolkit tk = Toolkit.getDefaultToolkit();//�ػ�

		//------------------------------------------------
		JPanel jp = new JPanel();
		System.out.println(jp.getBounds().getWidth());
		System.out.println(jp.getBounds().getHeight());

		jp.setBackground(Color.PINK);
		jp.setBounds(300, 30 , 600, 720);//ȭ��ũ������
		jp.setLayout( new FlowLayout());
		jp.setVisible(true);
		jp.setLayout(null);
		
		//------------------------------------------------
		//�⺻ JFrame ����
		setTitle("�� �Ĵ��� ��õ�մϴ� !");
		setLayout(null);
		setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 70, 
				((int) tk.getScreenSize().getHeight()) / 2 - 520,
				600, 750);
		add(e);
		setBackground(Color.pink);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x��ư
	}//������

	//�̱��� : �ν��Ͻ��� �� �ϳ��� �����ϴ� ������ ����
	//�̱��� ����� ����Ϸ��� �Ѵ�
	public static void getInstance(JPanel e) {
			//static���� ���������Ƿ� �ش� �޼��尡 �����ں��ٵ� ���� ȣ��ȴ�
			instance = new FrameBase2(e);//�����ڸ� ���� �⺻ ������ ����
			
			instance.getContentPane().removeAll();
			instance.getContentPane().add(e);
			
			instance.revalidate(); //���̾ƿ� �����ڿ��� ���̾ƿ������� �ٽ� ����ϵ��� ����
			instance.repaint(); //���̾ƿ��� ���� �׸���
	}//getInstance()
}
