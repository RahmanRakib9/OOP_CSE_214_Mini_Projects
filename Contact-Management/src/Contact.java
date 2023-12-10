/**
 * Contact
 */
public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // name getter method
    public String getName() {
        return name;
    }

    // name setter method
    public void setName(String name) {
        this.name = name;
    }

    // phone-number getter method
    public String getPhoneNumber() {
        return name;
    }

    // phone number setter method
    public void setPhoneNumber(String name) {
        this.name = name;
    }

    /*
     * The purpose of this toString method is to create a string that represents the
     * state of the Contact object. It concatenates the values of the name and
     * phone-number
     * instance variables into a single string.
     * 
     */
    @Override
    public String toString() {
        return "Contact{name='" + name + "', phoneNumber='" + phoneNumber + "'}";
    }

}