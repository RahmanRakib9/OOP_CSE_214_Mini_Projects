/**
 * This Voter class is responsible for create a new voter by voter name,NID and
 * address
 */
public class Voter {
    private String name;
    private String NID;
    private String address;

    public Voter(String name, String NID, String address) {
        this.name = name;
        this.NID = NID;
        this.address = address;
    }

    // name getter method
    public String getName() {
        return name;
    }

    // name setter method
    public void setName(String name) {
        this.name = name;
    }

    // NID getter method
    public String getNID() {
        return NID;
    }

    // NID setter method
    public void setNID() {
        this.NID = NID;
    }

    // address getter method
    public String getAddress() {
        return address;
    }

    // address setter method
    public void setAddress(String address) {
        this.address = address;
    }

    /*
     * The purpose of this toString method is to create a string that represents the
     * state of the User object. It concatenates the values of the name, NID, and
     * address instance variables into a single string.
     * 
     */
    @Override
    public String toString() {
        return "Voter [name=" + name + ", NID=" + NID + ", address=" + address + "]";
    }

}