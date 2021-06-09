public class EmployeePresentAbsent {
	public static void main(String args[]){
		int empPresent = 1;
		int empCheck = (int)(Math.floor(Math.random() * 10)) % 2;
		System.out.println(empCheck);
		if (empCheck == empPresent)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}
}