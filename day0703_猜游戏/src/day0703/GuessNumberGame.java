package day0703;

import java.util.Random;

public class GuessNumberGame extends GuessGame {
	@Override
	public String suiJi() {
		int r = 1 + new Random().nextInt(1000);
		//������������ַ�������
		return String.valueOf(r);
	}
	@Override
	public void tiShi() {
		System.out.println(
		 "�Ѿ����������һ��[1,1001)��Χ������");
		System.out.println("���������Ǽ�");
	}
	@Override
	public String biJiao(String c, String r) {
		//�ַ���������int
		int cc = Integer.parseInt(c);
		int rr = Integer.parseInt(r);
		if(cc>rr) {
			return "��";
		} else if(cc<rr) {
			return "С";
		} else {
			return "��";
		}
	}
	@Override
	public boolean caiDui(String result) {
		return "��".equals(result);
	}
}



