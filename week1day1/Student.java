package week1day1;

public class Student {
	String studentName="Keerthana Rathi Varna";
	String rollNo="16BO46";
	String collegeName="Thiagarajar college of engineering";
	String markScored="77%";
	float cgpa=8.08f;
	public static void main(String[] args) {
		System.out.println("Class Report");
		Student report=new Student();
		System.out.println("Name: " +report.studentName);
		System.out.println("Roll No: "+report.rollNo);
		System.out.println("college: "+report.collegeName);
		System.out.println("mark scored : "+report.markScored);
		System.out.println("cgpa: "+report.cgpa);
		
		
	}
}
