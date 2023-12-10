
/**
 * Make a e-voting system for the people's Republic of Bangladesh. The system
 * has the capabilities to take vote but not more than one and can calculate the
 * results of individual candidate. Make at least 3 candidates for this system.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    private Candidate[] candidates;
    private Voter[] voters;

    // constructor for main class that initialize the candidates and voters
    public MainClass(Candidate[] candidates, Voter[] voters) {
        this.candidates = candidates;
        this.voters = voters;
    }

    // take vote If voters not voted
    public void vote(int voterIndex, int candidateIndex) {
        if (!voters[voterIndex].hasVoted()) {
            candidates[candidateIndex].addVote();
            voters[voterIndex].vote();
            System.out.println("Vote recorded successfully!");
        } else {
            System.out.println("Error: Voter has already voted.");
        }
    }

    // display the election result when user type "exit"
    public void displayResults() {
        System.out.println("Election Results:");
        for (Candidate candidate : candidates) {
            System.out.println(candidate.getName() + ": " + candidate.getVotes() + " votes");
        }
    }

    public static void main(String[] args) {
        Candidate[] candidates = {
                new Candidate("0.Mr Jamal"),
                new Candidate("1.Mr Kamal"),
                new Candidate("2.Mr Damal")
        };

        Voter[] voters = new Voter[101]; // assume that there are 100 voters in this case i ignore the 0th index
        for (int i = 0; i < voters.length; i++) {
            voters[i] = new Voter();
        }

        MainClass electionSystem = new MainClass(candidates, voters);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "Enter voter NID Number Between (1-100) and candidate Number (0-2) to vote, or 'exit' to end");
            System.out.println("Format: Voter NID space Candidate Number");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                electionSystem.displayResults();
                break;
            }

            String[] inputs = input.split(" ");
            if (inputs.length == 2) {
                try {
                    int voterIndex = Integer.parseInt(inputs[0]);
                    int candidateIndex = Integer.parseInt(inputs[1]);

                    if (voterIndex >= 0 && voterIndex < 100 && candidateIndex >= 0 && candidateIndex < 3) {
                        electionSystem.vote(voterIndex, candidateIndex);
                    } else {
                        System.out.println("Invalid input. Please enter valid indices.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input format. Please enter numeric values.");
                }
            } else {
                System.out.println("Invalid input format. Please enter two indices separated by a space.");
            }
        }

        scanner.close();
    }
}
