package Student_View;

import java.util.Scanner;

import Student_Controller.Student_Controller;
import Student_Model.Student_Model;

public class Student_View {
	static Scanner sc = new Scanner(System.in);

	static Student_Controller c = new Student_Controller();

	private static Student_Model getStudentDatas() {
		Student_Model sm = new Student_Model();

		System.out.println("Enter id:");
		int id = sc.nextInt();
		sm.setId(id);

		sc.nextLine();

		System.out.println("Enter Name:");
		String Name = sc.nextLine();
		sm.setName(Name);

		System.out.println("Enter Email:");
		String Email = sc.nextLine();
		sm.setEmail(Email);

		System.out.println("Enter D.O.B:");
		String Dob = sc.nextLine();
		sm.setDob(Dob);

//		sc.nextLine();
		System.out.println("Enter age:");
		int age = sc.nextInt();
		sm.setAge(age);

		System.out.println("Enter MOB:");
		long mob = sc.nextLong();
		sm.setMob(mob);

		return sm;

	}

	public static void main(String[] args) {

		System.out.println("Welcome to Student Mangement System\n");

		// ALL CHOICES

		System.out.println("1. Add/Save Student Data");
		System.out.println("2. Fetch ALL  Student Data");
		System.out.println("3. Delete Student Data By Id");
		System.out.println("4. Update Student Data By Id");
		System.out.println("5. Delete All Datas...");
		System.out.println("6. Exit");

		while (true) {
			System.out.println("Enter your choices:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Student_Model s = getStudentDatas();
				c.saveStudentData(s);

				break;
			case 2:
				c.getAllDatas();
				break;
			case 3:
				System.out.println("Enter id:");
				int id = sc.nextInt();
				sc.nextLine();

				c.DeleteDatas(id);
				break;
			case 4:
				System.out.println("Enter id:");
				int id1 = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter name:");
				String name = sc.nextLine();

				c.updateById(id1, name);

				break;
			case 5:
				c.DeleteAllDatas();
				break;
			case 6:
				System.out.println("THANK YOU");
				return;

			default:
				System.out.println("Invalid choice ");
				break;
			}
		}
	}

}
