package ExerciseSingleton;

public class Main {
    public static void main(String[] args) {
        ServerConnexion mysqlconnexion = ServerConnexion.getInstance();
        System.out.println(mysqlconnexion.getIdHandler());
        ServerConnexion mysqlconnexion2 = ServerConnexion.getInstance();
        System.out.println(mysqlconnexion2.getIdHandler());
    }
}
