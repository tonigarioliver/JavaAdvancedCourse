package Ejercicio14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Usuarios {
    public String ficheroDatos = "usuarios.txt";
    private String filename = "";
    public boolean fileLoadinMemory=false;
    private ArrayList<Usuario> listUsers = new ArrayList();
    public ArrayList<Usuario> listarUsuarios() {
        return this.listUsers;
    }

    public Usuarios(String path,boolean newBuiltFile){
        this.filename=path;
        try {
            this.listUsers = usertxtToArrayList();
            this.fileLoadinMemory=true;
        }catch(FileNotFoundException e){
            if(newBuiltFile== true){
                this.fileLoadinMemory=true;
                ArrayListToTxt(this.listUsers);
            }else{
                this.filename = "";
                this.fileLoadinMemory=false;
                System.out.println("File not found");
            }
        }
    }
    public Usuario obtenerUsuario(String username) throws RuntimeException{
        for (Usuario usuario : this.listUsers) {
            if (usuario.getNombreUsuario().equalsIgnoreCase(username)) {
                return usuario;
            }
        }
        throw new RuntimeException("Usuario no existe");
    }

    public void crearUsuario(Usuario usuario) {
        try {
            obtenerUsuario(usuario.getNombreUsuario());
        } catch (RuntimeException e) {
            this.listUsers.add(usuario);
            ArrayListToTxt(this.listUsers);
        }
    }

    public void borrarUsuario(String username) {
        try {
            Usuario user = obtenerUsuario(username);
            this.listUsers.remove(user);
            ArrayListToTxt(this.listUsers);
        } catch (RuntimeException e) {
            System.out.println("User do not exist");
        }
    }
    private ArrayList<Usuario> usertxtToArrayList() throws FileNotFoundException{

        Scanner scanner = new Scanner(new File(this.filename));
        while(scanner.hasNextLine()){
            String tempuser = scanner.nextLine();
            Usuario newUsario = new Usuario();
            newUsario.parseStringToUser(tempuser);
            this.listUsers.add(newUsario);
        }
        scanner.close();
        return this.listUsers;
    }

    private void ArrayListToTxt(ArrayList<Usuario>listUsers) {
        try {
            PrintStream printStream = new PrintStream(this.filename);
            for (Usuario usuarioExistente : this.listUsers) {
                printStream.println(usuarioExistente.userParseToString());
            }
            printStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
