package RPG;

import RPG.Personnages.Archer;
import RPG.Personnages.Guerrier;
import RPG.Personnages.Mage;
import RPG.Personnages.Personnage;
import RPG.Sorts.Comportement.Feu;
import RPG.Sorts.Comportement.Glace;
import RPG.Sorts.Comportement.Soin;
import RPG.Sorts.Magie;
import RPG.Sorts.Sort;
import RPG.Sorts.iMagie;

/**
 * Created by MPO on 28-Feb-17.
 */
public class Main {
    public static void main(String[] args){
        //Contenu de votre classe

        Personnage robin = new Archer("Robin");
        Personnage aragorn = new Guerrier("Aragorn");
        Personnage harry = new Mage("Harry");

        System.out.println(harry.getMagie().getType());

    }
}
