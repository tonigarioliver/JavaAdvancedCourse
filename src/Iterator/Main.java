package Iterator;

public class Main {
    public static void main(String[] args){
        Users users = new Users();
        users.Create(new User("PEPE",2));
        users.Create(new User("Pepi",2));
        while(users.hasUsers()){
            User user = users.nextUser();
            System.out.println("User name is" +user.getName());
        }

    }
}
