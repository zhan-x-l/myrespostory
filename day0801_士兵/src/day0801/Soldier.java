package day0801;

import java.util.Random;

/*
 * ��װ
 * ��ʿ����ص��������ݣ����߼����㷽����
 * ��װ��һ�����ࡱ���
 */
public class Soldier {
	/*
	 * ���Ա���
	 * ��Ա����
	 */
	int id; //Ĭ��ֵ0
	int blood = 100;
	
	//��̬ʿ����������
	static int count;
	
	//���췽��
	public Soldier() {
		System.out.println("Soldier������");
		Soldier.count++;
	}
	
	/*
	 * ��Ա����
	 */
	public void go() {
		System.out.println(id+"��ʿ��ǰ��");
	}
	
	public void attack() {
		if(blood == 0) {
			System.out.println("����"+id+"��ʿ����ʬ��");
			return;
		}
		System.out.println(id+"��ʿ������");
		//����ļ�Ѫ��
		int d = new Random().nextInt(10);
		//��Ѫ
		blood -= d;
		if(blood<0) {
			blood = 0;
		}
		System.out.println("Ѫ����"+blood);
		//Ѫ����0������
		if(blood == 0) {
			System.out.println(id+"��ʿ������");
			Soldier.count--;
		}
	}
}














