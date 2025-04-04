
public class StudentObj {

	public static void main(String[] args) {
		Student st1=new Student();
		st1.studentId=1;
		st1.studentName="neethu";
		System.out.println(st1.studentId +"\n"+st1.studentName);
		st1.read();
		st1.write();
		
	}

}
