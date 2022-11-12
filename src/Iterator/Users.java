package Iterator;

import java.util.ArrayList;

public class Users implements UsersIterator{
    private ArrayList<User> users = new ArrayList();
    private int position = 0;

    public void Create(User user){
        users.add(user);
    }

    @Override
    public void reset() {
        position = 0;
    }

    @Override
    public boolean hasUsers() {
        return position < users.size();
    }

    @Override
    public User nextUser() {
        User user = users.get(position);
        position++;
        return user;
    }
}
