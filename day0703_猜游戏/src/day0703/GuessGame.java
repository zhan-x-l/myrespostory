package day0703;

import java.util.Scanner;

public abstract class GuessGame {
	public void start() {
		//两种游戏的通用流程
		//产生随机值
		String r = suiJi();
		//显示提示
		tiShi();
		while(true) {
			System.out.print("猜：");
			String c = new Scanner(System.in).nextLine();
			//比较c和r，并得到比较的结果
			String result = biJiao(c, r);
			System.out.println(result);
			//result是否是猜对的结果
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




