package day0605;
 
public class Student extends Person {
	String school;
	
	public String toString() {
		//super 
		//����������У�
		//�Ը���������������
		return super.toString()+", "+school;
	}
}
