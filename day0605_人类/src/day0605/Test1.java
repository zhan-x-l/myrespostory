package day0605;

public class Test1 {
	public static void main(String[] args) {
		Person p = new Person("����","��",22);               
		Student s = new Student();
		Employee e = new Employee();
		s.name = "����";
		s.gender = "Ů";
		 s.age = 21;
		s.school = "ţ����ѧ";
		
		e.name = "����"; 
		e.gender = "Ů";
		e.age = 23;
		e.salary = 9000;
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
		
	}
}
