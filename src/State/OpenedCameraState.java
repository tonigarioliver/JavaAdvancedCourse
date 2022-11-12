package State;

public class OpenedCameraState extends State{
    public OpenedCameraState(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "mobile already unblocked";
    }

    @Override
    public String abrirCamara() {
        telefono.nextState(new TakePictureState(telefono));
        return "Camera opened" ;
    }

    @Override
    public String hacerFoto() {
        return "Puedes hacer foto";
    }
}
