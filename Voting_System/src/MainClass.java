import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Program execution start from this MainClass
 */
public class MainClass {
    public static void main(String[] args) {
        // Display welcome message
        System.out.println("===============");
        System.out.println("Welcome to EVM");
        System.out.println("===============");

        VoterList voterList = new VoterList();
        VoterRelatedOperation voterRelatedOperation = new VoterRelatedOperation();
        Set<Voter> voted = new HashSet<>();
        List<Integer> count = new ArrayList<>();

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Press 1 for Registration");
            System.out.println("Press 2 for vote");
            System.out.println("Press 0 for exit");
            int choice = scan.nextInt();

            if (choice == 1) {
                voterRelatedOperation.registration(voterList);
            } else if (choice == 2) {
                voterRelatedOperation.takeVote(voterList, voted, count);
            } else if (choice == 0) {
                System.out.println("Thank you, Application is shutting down...\n");
                break;
            } else {
                System.out.println("Please enter a valid choice.\n");
            }

        }

    }

}