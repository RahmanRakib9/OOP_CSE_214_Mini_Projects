import java.util.Scanner;

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

}