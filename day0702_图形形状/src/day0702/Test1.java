package day0702;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("���س�ִ��");
		while(true) {
			new Scanner(System.in).nextLine();
			
			int r = new Random().nextInt(4);
			switch(r) {
			case 0: 
				System.out.println("�����಻�ܴ�������");
				break;
			case 1: f(new Line()); break;
			case 2: f(new Square()); break;
			case 3: f(new Circle()); break;
			}
		}
	}
	private static void f(Shape shape) {
		shape.draw();
		//����ת�ͺ�ֻ�ܵ��ø��ඨ���ͨ�ó�Ա
		//�������еĳ�Ա���ܵ���
		//shape.length();
		
		//shape�����õĶ���
		//��ʵ������Line����
		if(shape instanceof Line) {
			//��Line����Ҫ�������⴦��
			//����ת�������ٴ���
			Line line = (Line) shape;
			line.length();
		}
		
		new Scanner(System.in).nextLine();
		shape.clear();
	}
}



