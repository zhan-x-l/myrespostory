package day0606;

import javax.swing.JFrame;

public class Test1 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		//�Դ��ڵ����Խ�������
		f.setSize(300,200);//�ߴ�
		f.setTitle("���ڱ���");//����������
		f.setResizable(false);//���ɸı��С
		f.setDefaultCloseOperation(
		  JFrame.EXIT_ON_CLOSE);  
		//֪ͨ���ڷ����������Ļ�ϻ��ƴ���                      
		f.setVisible(true);
		
		//�ڶ�������
		JFrame f2 = new JFrame();
		f2.setSize(200,300);//�ߴ�
		f2.setTitle("�ڶ�������");//����������
		f2.setVisible(true);
		
	}
}
