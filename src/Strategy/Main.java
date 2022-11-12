package Strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        UsuariosMemoria usuariosMemoria = new UsuariosMemoria();
        usuariosMemoria.crear("Pepe");
        usuariosMemoria.crear("Manu");

        for(String current : usuariosMemoria.listar()){
            System.out.println(current);
        }

        UsuariosFichero usuariosfichero = new UsuariosFichero();
        usuariosfichero.crear("Pepe");
        usuariosfichero.crear("Manu");

        for(String current : usuariosfichero.listar()){
            System.out.println(current);
        }

        UsuariosFichero usuariosinterface = new UsuariosFichero();
        crear(usuariosinterface,"Pepe");
        crear(usuariosinterface,"Manu");

        for(String current : listar(usuariosinterface)){
            System.out.println(current);
        }

    }

    public static void crear(Usuarios usuarios,String nombre){
        usuarios.crear(nombre);
    }

    public static ArrayList<String>listar(Usuarios usuarios){
        return usuarios.listar();
    }
}
