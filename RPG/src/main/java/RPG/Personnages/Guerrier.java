package RPG.Personnages;

import RPG.Armes.ABlanche;
import RPG.Armes.ArmeBlanche;
import RPG.Personnages.Comportement.Marcher;

/**
 * Created by MPO on 28-Feb-17.
 */
public class Guerrier extends Personnage {

    public Guerrier(String nom){
        super(
                nom,
                20,
                new Marcher(),
                new ArmeBlanche(ABlanche.EPEE),
                null
        );
    }
}
