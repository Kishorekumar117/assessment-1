package EmployeeTask;

public class MainOfEmployee {
	public static void main(String[] args) {
		Employee e1=new HourlyEmployee("Kishore Kumar","Software Developer","Changepond","IT",1000,15);
		e1.empDetials();
		e1.calcPay();
		
		System.out.println("=================================\n");
		e1=new WeeklyEmployee("Dola","Tester","changepond","IT",15000,4);
		e1.empDetials();
		e1.calcPay();
		
	}
}
