package day0801;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		/*
		 * ����һ��ʿ������
		 * ѭ��һ��һ�ֵĽ�����
		 * ֱ������ʿ������
		 */
		//�½� Soldier[] ����
		Soldier[] a = new Soldier[5];
		//�������飬����5��ʿ�����󣬴�������
		for(int i=0;i<a.length;i++) {
			a[i] = new Soldier();
			a[i].id = i+1;
		}		
		System.out.println(
		 "�Ѿ�����"+Soldier.count+"��ʿ��");
		System.out.println("���س�����");		
		//�����д���ʿ��
		while(Soldier.count != 0) {
			//��������
			new Scanner(System.in).nextLine();       
			for(int i=0;i<a.length;i++) {
				a[i].attack();
			}
			System.out.println(
			 "---------ʿ��������"+Soldier.count);
		}
		
		
	}
}





