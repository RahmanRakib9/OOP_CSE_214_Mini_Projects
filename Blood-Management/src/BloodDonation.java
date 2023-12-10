
/**
 *This BloodDonation class is responsible for handle the blood donation functionalities
 For blood donation donner's weight have to 50+ and age should be above 18
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;

public class BloodDonation {
    public void takeBlood(UserList userList) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your mobile number");
        String mobile = scan.next();

        List uList = userList.getUserList();
        User userFound = null; // initially set it to null

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

        LocalDate currentDate = LocalDate.now();
        if ((int) userFound.getWeight() >= 50) {
            int age = Period.between(userFound.getDob(), currentDate).getYears();
            System.out.println("age: " + age);
            if (age >= 18) {
                System.out.println("You can donate blood");
            } else
                System.out.println("Your age is not correct");
        } else {
            System.out.println("You are underweight");
        }

    }
}