package day0605;

public class Test1 {
	public static void main(String[] args) {
		Person p = new Person("张三","男",22);               
		Student s = new Student();
		Employee e = new Employee();
		s.name = "李四";
		s.gender = "女";
		 s.age = 21;
		s.school = "牛蹄筋大学";
		
		e.name = "王五"; 
		e.gender = "女";
		e.age = 23;
		e.salary = 9000;
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
		
	}
}
