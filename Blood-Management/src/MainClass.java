import java.util.Scanner;

/**
 * intro
 */
public class MainClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UserList userList = new UserList();
        while (true) {
            System.out.println("1 for user registration");
            System.out.println("2 for change blood donation date");
            System.out.println("3 for donate blood ");
            int choice = scan.nextInt();
            UserRelatedOperation userOperation = new UserRelatedOperation();

            switch (choice) {
                case 1:
                    userOperation.insert(userList);
                    break;
                case 2:
                    userOperation.changeDate(userList);
                    break;
                case 3:
                    BloodDonation bloodDonation = new BloodDonation();
                    bloodDonation.takeBlood(userList);
            }
        }

    }
}