package Observer;

import java.util.ArrayList;

public class Emisor {
    private ArrayList<Receptor> receptors = new ArrayList();

    public void addReceptor(Receptor receptor){
        this.receptors.add(receptor);
    }

    public void notifyReceptor(){
        for(Receptor receptor: receptors){
            receptor.receive();
        }
    }
}
