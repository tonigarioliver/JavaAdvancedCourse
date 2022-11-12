package State;

public class TakePictureState extends State{
    public TakePictureState(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return null;
    }

    @Override
    public String abrirCamara() {
        return null;
    }

    @Override
    public String hacerFoto() {
        return null;
    }
}
