package exception1;

public class Ch08_6 {

	public static void main(String[] args) throws Exception {
		Student s1 = new Student();
		s1.setName("Charlie");
		s1.setAge(23);
		//s1.printInfo();
		System.out.println(s1.getName()+" : "+s1.getAge());
		
		System.out.println("=================");
		
		Student s2 = new Student();
		s2.setName("Amy");
		s2.setAge(10);	//年齡錯誤
		System.out.println(s2.getName()+" : "+s2.getAge());
		
		System.out.println("=================");
		
		Student s3 = new Student();
		s3.setName("Nana");
		s3.setAge(-50);
		s3.printInfo();
		
		System.out.println("=================");
		
		Student s4 = new Student();
		s4.setName("");
		s4.setAge(30);
		s4.printInfo();
	}

}
