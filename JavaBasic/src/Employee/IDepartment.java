package Employee;

public interface IDepartment {
	default void getDepartName(String...dname) {
		System.out.println("Department Name");
		for(String str:dname) {
			System.out.println(str);
		}
	}
}
