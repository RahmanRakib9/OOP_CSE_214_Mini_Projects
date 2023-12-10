// Voter Class
public class Voter {
    private boolean hasVoted;

    public Voter() {
        this.hasVoted = false; // initially by default false
    }

    public boolean hasVoted() {
        return hasVoted;
    }

    public void vote() {
        hasVoted = true;
    }
}
