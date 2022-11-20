package Ejercicio14;

public class Usuario {
    private String nombreUsuario;
    private String nombre;
    private String apellidos;
    private String email = "";
    private int nivelAcceso;
    public String[] UserFeatures={"nombreUsuario","nombre","apellidos","email","nivelAcceso"};

    protected  void parseStringToUser(String usertoParse){
        String []parts = usertoParse.split(",");
        for(int i=0; i<parts.length;i++){
            this.buildUsuario(this.UserFeatures[i],parts[i]);
        }
    }
    protected String userParseToString(){
        String userparse = this.nombreUsuario+","+this.nombre+","+this.apellidos+","+this.email+","+Integer.toString(this.nivelAcceso);
        return userparse;
    }

    protected void buildUsuario(String UserFeatures, String feature){
        switch(UserFeatures){
            case "nombreUsuario":
                this.nombreUsuario = feature;
                break;
            case "nombre":
                this.nombre = feature;
                break;
            case "apellidos":
                this.apellidos = feature;
                break;
            case "email":
                this.email = feature;
                break;
            case "nivelAcceso":
                this.nivelAcceso = Integer.parseInt(feature);
                break;
            default:
                throw new RuntimeException("No existe ” + caracteristica");
        }
    }
    protected String getNombreUsuario() {
        return nombreUsuario;
    }
}
