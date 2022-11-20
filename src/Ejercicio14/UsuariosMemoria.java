package Ejercicio14;


import java.util.ArrayList;

public class UsuariosMemoria {
    ArrayList<Usuario> usuarios = new ArrayList();

    public ArrayList<Usuario> listarUsuarios() {
        return usuarios;
    }

    public Usuario obtenerUsuario(String username) {
        for (Usuario usuario : this.usuarios) {
            if (usuario.getNombreUsuario().equalsIgnoreCase(username.toLowerCase())) {
                return usuario;
            }
        }
        return null;
    }

    public void crearUsuario(Usuario usuario) {
        for (Usuario usuarioActual : this.usuarios) {
            if (usuarioActual.getNombreUsuario().toLowerCase().equals(usuario.getNombreUsuario().toLowerCase())) {
                return;
            }
        }
        usuarios.add(usuario);
    }

    public void borrarUsuario(String username) {
        for (int i = 0; i < this.usuarios.size(); i++) {
            Usuario usuario = this.usuarios.get(i);
            if (usuario.getNombreUsuario().equalsIgnoreCase(username.toLowerCase())) {
                this.usuarios.remove(i);
            }
        }
    }
}
