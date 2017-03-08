package RPG;

import RPG.Armes.ADistance;
import RPG.Armes.ArmeADistance;
import RPG.Personnages.*;
import RPG.Sorts.Element;
import RPG.Sorts.Type;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static RPG.Personnages.ListeClasse.archer;

/**
 * Created by MPO on 28-Feb-17.
 */
public class Main {
    public static void main(String[] args) {

        Ring ring = new Ring();

        ring.creerJoueur();
        Personnage j1 = ring.joueurs.get(0);
        System.out.println();

        ring.creerJoueur();
        Personnage j2 = ring.joueurs.get(1);
        System.out.println();

        while(j1.getVie()>0 && j2.getVie()>0){
            j1.attaquer(j2);
            System.out.println(j1.getNom()+" attaque "+j2.getNom()+" à qui il reste "+j2.getVie());

            if(j2.getVie()>0) {
                j2.attaquer(j1);
                System.out.println(j2.getNom() + " attaque " + j1.getNom() + " à qui il reste " + j1.getVie());
            }
        }

    }

}
