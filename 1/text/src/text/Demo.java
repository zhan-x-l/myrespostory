package text;

public class Demo {
	public static void main(String[] args) {
		int a=2;
		Demo d=new Demo();	
		d.test(a);
		
	}
	
	public void test(int i) {
		switch (i) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default:
			break;
		}

	}
}
