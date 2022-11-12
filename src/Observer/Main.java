package Observer;

public class Main {
    public static void main(String[] args) {
        Emisor emisor = new Emisor();
        ReceptorSatelite receptorstatelite = new ReceptorSatelite();
        ReceptorRadio receptorradio = new ReceptorRadio();
        emisor.addReceptor(receptorstatelite);
        emisor.addReceptor(receptorradio);
        emisor.notifyReceptor();
    }
}
