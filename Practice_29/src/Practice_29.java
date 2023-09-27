
public class Practice_29 {

	public static void main(String[] args) {
		Student s1 = new Student("김동덕");
		Student s2 = new Student("홍길동", 20111234);
		Student s3 = new Student("성춘향", 20121357, "국문학");
		
		s1.setSid(20132468);
		s1.setMajor("컴퓨터학");
		s2.setMajor("컴퓨터학");

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		s1.setAge(22);
		s1.setAddress("서울시");
		s2.setAge(30);
		s2.setAddress("제주시");
		s3.setAge(16);
		s3.setAddress("남원시");
		
		System.out.println(s1.printSafely());
		System.out.println(s2.printSafely());
		System.out.println(s3.printSafely());
	}

}
