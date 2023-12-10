import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * This VoterRelatedOperation class is responsible for create voter related
 * functionalities like
 * Register a voter,Take votes
 */
public class VoterRelatedOperation {

    public void registration(VoterList voterList) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = scan.nextLine();

        System.out.println("Please enter your NID number");
        String nid = scan.next();
        scan.nextLine();

        System.out.println("Please enter your address");
        String address = scan.nextLine();

        Voter voter = new Voter(name, nid, address);

        System.out.println(voter);

        voterList.setVoterList(voter);
        voterList.totalVoter();
        System.out.println();
    }

    public void takeVote(VoterList voterList, Set<Voter> voted, List count) {
        System.out.println("Please enter your NID number");
        Scanner scan = new Scanner(System.in);
        String mobile = scan.next();

        Voter user = voterList.findUser(mobile);
        if (user == null) {
            System.out.println("Please Register first Then Try again\n");
            return;
        }

        int prevSize = voted.size();
        voted.add(user);
        if (prevSize == voted.size()) {
            System.out.println("You have taken, try next year\n");
            return;
        }
        System.out.println("Give Your Valuable vote by Entering Candidate Number");
        System.out.println("Enter 1 for Vote Karim");
        System.out.println("Enter 2 for vote Jamal");
        System.out.println("Enter 3 for vote Rasel");
        // System.out.println(user);
        int v = scan.nextInt();
        count.add(v);
    }

}