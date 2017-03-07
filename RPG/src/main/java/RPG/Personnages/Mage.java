package RPG.Personnages;

import RPG.Armes.AContondante;
import RPG.Armes.ArmeContondante;
import RPG.Personnages.Comportement.Marcher;
import RPG.Sorts.Comportement.Feu;
import RPG.Sorts.Comportement.Soin;
import RPG.Sorts.Comportement.Glace;
import RPG.Sorts.Sort;

/**
 * Created by MPO on 28-Feb-17.
 */
public class Mage extends Personnage{

    public Mage(String nom){
        super(
                nom,
                10,
                new Marcher(),
                new ArmeContondante(AContondante.SCEPTRE),
                new Feu(Sort.ECLAT)
        );
    }
}
