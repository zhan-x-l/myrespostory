package day0701;

public abstract class Pet {

String name;//null
	int full;//0
	int happy;//0
	
	public Pet(String name) {
		//��ͬ���ľֲ�����
		//������this.name�����ʳ�Ա����
		this.name = name;
		full = 50;
		happy = 50;
	}
	public Pet(String name,int full,int happy) {
		this.name = name;
		this.full = full;
		this.happy = happy;
	}
	
	public void feed() {
		if(full == 100) {
			System.out.println(name+"�Ѿ��Բ�����"); 
			return;
		}
		System.out.println("��"+name+"ιʳ");
		full += 10;
		System.out.println("��ʳ�ȣ�"+full);
	}
	
	public void play() {
		if(full == 0) {
			System.out.println(name+"�����治����");
			return;
		}
		System.out.println("��"+name+"��ˣ");
		happy += 10;
		full -= 10;
		System.out.println(
		 "��ʳ�ȣ�"+full+", ���ֶȣ�"+happy);
	}
	public void punish() {
		System.out.println(
		 "��"+name+"��pp��"+name+"�޽У�"+cry());
		happy -= 10;
		System.out.println("���ֶȣ�"+happy);
	}

	public abstract String cry();
	
}



