package Math;

import java.util.LinkedList;

public class UserService {
    private LinkedList<String> users = new LinkedList<String>();

    public UserService(String[] names){

        for (String name: names){
            this.users.add(name);
        }
    }


    public boolean isUser(String user) {
        return users.contains(user);
    }
}
