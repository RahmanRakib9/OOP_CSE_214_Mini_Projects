/*
 * This file is responsible for user related operation like register a new user,display existing users
 * and find user by their name
 */

import java.util.ArrayList;
import java.util.Scanner;

public class UserRelatedOperation {

    // register a new user by name and mobile phone
    public User register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter mobile");
        String mobile = scanner.next();

        User user = new User(name, mobile);
        return user;
    }

    // display all users
    public void show(ArrayList<User> users) {
        for (User u : users) {
            System.out.println("Name: " + u.getName() + " Mobile: " + u.getMobile());
        }
    }

    // find user by their exact contact number
    public User find(ArrayList<User> users) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mobile number");
        String mobile = scanner.next();

        for (int i = 0; i < users.size(); i++) {
            User u = users.get(i);
            if (u.getMobile().equalsIgnoreCase(mobile) == true) {
                System.out.println("Name: " + u.getName() + " Mobile: " + u.getMobile());
                return u;
            }

        }
        System.out.println("User not found");
        return null;
    }

}
