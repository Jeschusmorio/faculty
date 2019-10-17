package faculty;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class facultyMain {

	public static void main(String[] args) {
		//for (int i = 1; i <= 20; i++) {
			int faculty_index = input();
			int solution = calculateFaculty(faculty_index);
			System.out.println("Faculty : " + faculty_index + "! = " + solution);
		//}
	}
	
	static Random r = new Random();
	
	public static int input() {
		int faculty = 0;
		boolean input;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Insert a number for a faculty: ");
			try {
				faculty = sc.nextInt();
				input = true;
				if (faculty < 1) {
					System.out.println("ERROR: Number has to be higher than 0!\n");
					input = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Cannot form a faculty of a text!\n");
				input = false;
			}
		} while (!input);
		return faculty;
	}
	
	public static int calculateFaculty(int value) {
		if (value == 1) {
			return 1;
		}
		return value * calculateFaculty(value - 1);
	}

}
