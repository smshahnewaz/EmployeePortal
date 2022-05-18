import java.util.*;
class emp {
	String empname;
	String empdept;
	int empid;
	int rate1 = 45;
	int rate2 = 35;
	int hours;
	float empsal;
	static Scanner sc = new Scanner(System.in);
	static String comName = "INSIGHT GLOBAL Inc";

	static {
		System.out.println("=====Welcome to Employee Portal=====");
		System.out.println("         " + comName);
	}

	public void addEmp() {
		System.out.println("Employee Name   :");
		empname = sc.next();

		System.out.println("Employee id   :");
		empid = sc.nextInt();

		System.out.println("Employee Dept   :");
		empdept = sc.next();
	}

	public void viewEmp() {
		System.out.println("====Employee Record=====\n");
		System.out.println("Name      : " + empname);
		System.out.println("Emp Id    : " + empid);
		System.out.println("Emp Dept  : " + empdept);
	}

	public void empSal() {
		System.out.println("====Employee Payroll=====");
		System.out.println("Pick Deptarmet    : ");
		System.out.println("1. IT");
		System.out.println("2. DEVELOPER");
		System.out.println("3. SALES");
		System.out.println("4. MARKETTING");
		System.out.println("5. HUMAN RESOURCE");
		int pick = sc.nextInt();

		switch (pick) {
		case 1:
			System.out.println(empname + ", your Rate is : $" + rate1 + "/hour");
			break;
		case 2:
			System.out.println(empname + ", your hourly rate is : $" + rate1 + "/hour");
			break;
		case 3:
			System.out.println(empname + "your hourly rate is : $" + rate2 + "/hour");
			break;
		case 4:
			System.out.println(empname + ", your rate is : $" + rate2 + "/hour");
			break;
		case 5:
			System.out.println("Rate is : $" + rate2 + "/hour");
			break;
		default:
			System.out.println("Pick 1-5 Only!");
		}
	}
}

public class EmployeeApp {

	public static void main(String[] args) {
		emp obj = new emp();
		System.out.println("1. Add Emp");
		System.out.println("2. Emp Payroll");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			obj.addEmp();
			obj.viewEmp();
			obj.empSal();
			break;
		case 2:
			obj.empSal();
			break;

		default:
			System.out.println("Invalid Choice!");
		}
	}
}
