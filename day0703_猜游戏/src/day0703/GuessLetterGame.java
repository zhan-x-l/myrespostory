package day0703;

public class GuessLetterGame extends GuessGame {
	@Override
	public String suiJi() {
		// TODO: �Ժ������
		return "ABCDE";
	}
	@Override
	public void tiShi() {
		System.out.println("�Ѿ�������5�����ظ��Ĵ�д��ĸ");
		System.out.println("�����5����ĸ");
	}
	@Override
	public String biJiao(String c, String r) {
		// TODO: �Ժ������
		return "2A2B";
	}
	@Override
	public boolean caiDui(String result) {
		return "5A0B".equals(result);
	}
}



