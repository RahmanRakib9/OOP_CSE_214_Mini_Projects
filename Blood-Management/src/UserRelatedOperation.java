import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

/**
 * This UserRelatedOperation class is responsible for create a new user based on
 * necessary info like user name,mobile,blood group,last blood donation date
 * etc.Here mobile number is considered as user unique id
 */
public class UserRelatedOperation {

    public void insert(UserList userList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        System.out.println("Please enter your mobile");
        String mobile = scan.next();
        scan.nextLine();
        System.out.println("Please enter your address");
        String address = scan.nextLine();
        System.out.println("Please enter your Date of birth in YYYY-MM-DD format");
        String birthDate = scan.next();
        System.out.println("Please enter your last blood donation in YYYY-MM-DD format");
        String bloodDonateDate = scan.next();
        System.out.println("Please enter your weight");
        float weight = scan.nextFloat();
        System.out.println("Please enter your blood group");
        String blood = scan.next();
        LocalDate dob = LocalDate.parse(birthDate);
        LocalDate lastBloodDonation = LocalDate.parse(bloodDonateDate);
        User user = new User(name, mobile, address, dob, lastBloodDonation, weight, blood);
        userList.setUserList(user);
        System.out.println("Total user: " + userList.getUserList().size() + "\n");
    }

    public void changeDate(UserList userList) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your mobile number");
        String mobile = scan.next();

        List uList = userList.getUserList();
        User userFound = null;

        for (int i = 0; i < uList.size(); i++) {
            User tempUser = (User) uList.get(i);
            if (tempUser.getMobile().compareToIgnoreCase(mobile) == 0) {
                userFound = tempUser;
                break;
            }
        }
        if (userFound == null) {
            System.out.println("User not found");
            return;
        }

        uList.remove(userFound);
        System.out.println("Please enter your last blood donation in YYYY-MM-DD format");
        String bloodDonateDate = scan.next();
        LocalDate lastBloodDonation = LocalDate.parse(bloodDonateDate);
        userFound.setLastBloodDonation(lastBloodDonation);
        uList.add(userFound);
        userList.setUserArray(uList);

    }

}