package day0701;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("1.è");
		System.out.println("2.��");
		System.out.print("ѡ��");
		int c = new Scanner(System.in).nextInt();
		System.out.print("������������֣�");
		String name = new Scanner(System.in).nextLine();
		//Cat cat = null;
		//Dog dog = null;
		Pet pet = null;
		
		if(c==1) {
			pet = new Cat(name);
		} else {
			pet = new Dog(name);
		}
		
		play(pet);
	}

	private static void play(Pet pet) {
		System.out.println("���س�����");
		while(true) {
			new Scanner(System.in).nextLine();
			int r = new Random().nextInt(3);
			switch(r) {
			case 0: pet.feed(); break;
			case 1: pet.play(); break;
			case 2: pet.punish(); break;
			}
		}
	}
}





