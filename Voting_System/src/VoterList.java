import java.util.ArrayList;

/**
 * VoterList
 */
public class VoterList {
    private ArrayList<Voter> voterList = new ArrayList<>();

    public ArrayList<Voter> getVoterList() {
        return voterList;
    }

    public void setVoterList(Voter voterList) {
        this.voterList.add(voterList);
    }

    public void totalVoter() {
        System.out.println("Total Voter: " + this.voterList.size());
    }

    public Voter findUser(String nid) {
        for (int i = 0; i < this.voterList.size(); i++) {
            Voter u = this.voterList.get(i);
            if (nid.compareToIgnoreCase(u.getNID()) == 0)
                return u;
        }
        return null;
    }

}