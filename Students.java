package studentinfo;

public class Students {
	public void getStudentInfo(int id) {
		
		System.out.println("Student id is : " + " " + id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student id is : " + " " + id);
		System.out.println("Student Name is : " + " " + name);
	}
	
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student Email id is : " + " " + email);
		System.out.println("Student Phone number is : " + " " + phoneNumber);
	}

	public static void main(String[] args) {
		Students studentInfo = new Students();
		studentInfo.getStudentInfo(10010503);
		studentInfo.getStudentInfo(10010503, "Poongothai");
		studentInfo.getStudentInfo("poongothai.sathishn@gmail.com", 9842488949L);

	}


}
