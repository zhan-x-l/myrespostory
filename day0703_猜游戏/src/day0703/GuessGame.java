package day0703;

import java.util.Scanner;

public abstract class GuessGame {
	public void start() {
		//������Ϸ��ͨ������
		//�������ֵ
		String r = suiJi();
		//��ʾ��ʾ
		tiShi();
		while(true) {
			System.out.print("�£�");
			String c = new Scanner(System.in).nextLine();
			//�Ƚ�c��r�����õ��ȽϵĽ��
			String result = biJiao(c, r);
			System.out.println(result);
			//result�Ƿ��ǲ¶ԵĽ��
			if(caiDui(result)) {
				break;
			}
		}
		
	}

	public abstract String suiJi();
	public abstract void tiShi();
	public abstract String biJiao(String c, String r);
	public abstract boolean caiDui(String result);
}




