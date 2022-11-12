package State;

abstract public class State {
    public Telefono telefono;

    public State(Telefono telefono){
        this.telefono = telefono;
    }
    abstract public String desbloquear();
    abstract public String abrirCamara();
    abstract public String hacerFoto();
}
