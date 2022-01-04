import java.util.Scanner;

public class ImportToday {

	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name,age and salary");
        String name=s.nextLine();
        int age=s.nextInt();
        double salary=s.nextDouble();
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
	}

}
