import java.time.LocalDate;

/**
 * This User class is responsible for create a new user based on some properties
 * like name,mobile,address etc.
 */
public class User {
    private String name;
    private String mobile;
    private String address;
    private LocalDate dob;
    private LocalDate lastBloodDonation;
    private float weight;
    private String blood;

    public User(String name, String mobile, String address, LocalDate dob, LocalDate lastBloodDonation, float weight,
            String blood) {
        super();
        this.name = name;
        this.mobile = mobile;
        this.address = address;
        this.dob = dob;
        this.lastBloodDonation = lastBloodDonation;
        this.weight = weight;
        this.blood = blood;
    }

    // name getter method
    public String getName() {
        return name;
    }

    // name setter method
    public void setName(String name) {
        this.name = name;
    }

    // mobile number getter method
    public String getMobile() {
        return mobile;
    }

    // mobile number setter method
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    // address getter method
    public String getAddress() {
        return address;
    }

    // address setter method
    public void setAddress(String address) {
        this.address = address;
    }

    // date of birth getter method
    public LocalDate getDob() {
        return dob;
    }

    // date of birth setter method
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    // last blood donation getter method
    public LocalDate getLastBloodDonation() {
        return lastBloodDonation;
    }

    // last blood donation setter method
    public void setLastBloodDonation(LocalDate lastBloodDonation) {
        this.lastBloodDonation = lastBloodDonation;
    }

    // weight getter method
    public float getWeight() {
        return weight;
    }

    // weight setter method
    public void setWeight(float weight) {
        this.weight = weight;
    }

    // blood getter method
    public String getBlood() {
        return blood;
    }

    // blood setter method
    public void setBlood(String blood) {
        this.blood = blood;
    }

}