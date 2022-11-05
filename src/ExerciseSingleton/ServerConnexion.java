package ExerciseSingleton;

import static java.sql.Types.NULL;

public class ServerConnexion {
    private static ServerConnexion serverConnexion;
    private int idHandler = NULL;

    public int getIdHandler() {
        return idHandler;
    }

    public void setIdHandler(int idHandler) {
        this.idHandler = idHandler;
    }
    private ServerConnexion(){};

    public static ServerConnexion getInstance(){
        if(serverConnexion == null){
            serverConnexion = new ServerConnexion();
        }
        return serverConnexion;
    }

}
