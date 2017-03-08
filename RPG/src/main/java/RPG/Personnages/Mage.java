package RPG.Personnages;

import RPG.Armes.AContondante;
import RPG.Armes.ArmeContondante;
import RPG.Personnages.Comportement.Marcher;
import RPG.Sorts.Element;
import RPG.Sorts.Sort;
import RPG.Sorts.Type;

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
                new Sort(Type.ECLAT, Element.FEU)
        );
    }
}
