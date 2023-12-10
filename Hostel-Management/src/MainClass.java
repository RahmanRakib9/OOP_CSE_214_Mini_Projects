
/**
 *This MainClass is an entry point of this project,Program execution will start from this file
 */

import java.util.Scanner;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("===============");
        System.out.println("Welcome to hostel management system");
        System.out.println("===============");

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        HostelOperation operation = new HostelOperation();
        int choice;

        while (true) {
            System.out.println("1 for student registration");
            System.out.println("2 for student serch by id");
            System.out.println("3 for remove student by id");
            System.out.println("4 for serch student by year");
            System.out.println("0 for exit the system");

            choice = scanner.nextInt();

            if (choice == 1) {
                operation.registration(students);
            } else if (choice == 2) {
                operation.searchById(students);
            } else if (choice == 3) {
                operation.delete(students);
            } else if (choice == 4) {
                operation.searchByYear(students);
            } else if (choice == 0)
                break;
            {

            }
        }
    }
}