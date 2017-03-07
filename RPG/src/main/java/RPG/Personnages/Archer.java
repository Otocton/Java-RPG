package RPG.Personnages;

import RPG.Armes.ADistance;
import RPG.Armes.ArmeADistance;
import RPG.Personnages.Comportement.Courir;


/**
 * Created by MPO on 28-Feb-17.
 */
public class Archer extends Personnage {

    public Archer(String nom){
        super(
                nom,
                15,
                new Courir(),
                new ArmeADistance(ADistance.ARC),
                null
        );
    }

}
