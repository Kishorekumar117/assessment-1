package StudentBase;

public class MainStudent {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setfName("Kishore");
		s1.setlName("Kumar");
		s1.setMjava(75);
		s1.setmWeb(63);
		s1.setmDataBase(81);

		System.out.println("=====================================");
		System.out.println("Full Name : "+s1.getFullName());
		System.out.println("=====================================");
		System.out.println("  Java Mark     :  "+s1.getMjava());
		System.out.println("  webTec Mark   :  "+s1.getmWeb());
		System.out.println("  DataBase Mark :  "+s1.getmDataBase());
		System.out.println("  Total Mark    :  "+s1.totalMarks());
		System.out.println("  Persentage    :  "+s1.percentage());
		System.out.println("=====================================");
		System.out.println("||  Batch         : "+s1.batch()+"  ||");
		System.out.println("=====================================");
	}
}
