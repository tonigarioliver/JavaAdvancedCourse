package Mediator;

public class ColegaConcreto2 extends Colega{
    @Override
    void recive() {
        System.out.println("He recibido un msj 2");
    }

    @Override
    void envia() {
        System.out.println("Voy a enviar mensaje colega 2");
        mediator.reenvia(this);
    }
}
