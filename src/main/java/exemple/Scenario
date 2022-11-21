import bandeau.Bandeau;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Scenario {

    private ArrayList<Enchainement> listeEffets = new ArrayList<Enchainement>();

    public Scenario () {    };

    public void ajouterEffet (Effet effet, int nbRepetition) {
        listeEffets.add(new EffetRepetition(effet, nbRepetition)) ;
    }



    public void deroulerAnimation(Bandeau bandeau){

        for (EffetRepetition effetRepetition : listeEffets) {

            for(int i=0; i<effetRepetition.getRepetition(); i++)

            {
            effetRepetition.getEffet().animationSurBandeau(bandeau);
                bandeau.sleep(500);
            }
            bandeau.sleep(500);

        }
    }




}
