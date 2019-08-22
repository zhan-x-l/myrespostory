package day0605;
 
public class Student extends Person {
	String school;
	
	public String toString() {
		//super 
		//在子类对象中，
		//对父类对象的特殊引用
		return super.toString()+", "+school;
	}
}
