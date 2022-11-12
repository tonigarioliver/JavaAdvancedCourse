package State;

public class BlockState extends State{
    public BlockState(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono.nextState(new UnblockedState(telefono));
        return "Phone unblocked";
    }

    @Override
    public String abrirCamara() {
        return "The camera is blocked, first unblock mobile";
    }

    @Override
    public String hacerFoto() {
        return "The camera is blocked, open camera first";
    }
}
