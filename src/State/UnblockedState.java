package State;

public class UnblockedState extends State{
    public UnblockedState(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "Phone unblocked";
    }

    @Override
    public String abrirCamara() {

        telefono.nextState(new OpenedCameraState(telefono));
        return "Camera opened" ;
    }

    @Override
    public String hacerFoto() {
        return "First open camera";
    }
}
