package Mediator;

public class ColegaConcreto1 extends Colega{
    @Override
    void recive() {
        System.out.println("He recibido un msj");
    }

    @Override
    void envia() {
        System.out.println("Voy a enviar mensaje colega 1");
        mediator.reenvia(this);
    }
}
