package Ejercicio14;


public class Main {
    public static void main(String []args) {
        String path ="C:\\Users\\tonie\\IdeaProjects\\JavaAdvancedCourse\\src\\Ejercicio14\\users.txt";
        Usuarios usuarios = new Usuarios(path,true);

        Usuario usuario = new Usuario();
        String usuariofeatures ="openbootcamp,Open,Bootcamp,ejemplos@open-bootcamp.com,10";
        usuario.parseStringToUser(usuariofeatures);
        usuarios.crearUsuario(usuario);

        Usuario usuario2 = new Usuario();
        String usuario2features ="openbootcamp2,Open,Bootcamp,ejemplos@open-bootcamp.com,10";
        usuario2.parseStringToUser(usuario2features);
        usuarios.crearUsuario(usuario2);

        Usuario openbootcamp = usuarios.obtenerUsuario("openbootcamp");
        System.out.println(openbootcamp.userParseToString());

        usuarios.borrarUsuario("openbootcamp");
        for (Usuario a : usuarios.listarUsuarios()) {
            System.out.println(a.userParseToString());
        }
    }
}
