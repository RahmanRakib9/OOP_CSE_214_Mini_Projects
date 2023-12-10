
/**
 * UserList
 */

import java.util.ArrayList;
import java.util.List;

public class UserList {
    private ArrayList<User> userList = new ArrayList<>();

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(User user) {
        this.userList.add(user);
    }

    public void setUserArray(List uList) {
        this.userList = (ArrayList<User>) uList;
    }

}