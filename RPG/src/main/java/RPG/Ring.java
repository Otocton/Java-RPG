package RPG;

import RPG.Personnages.*;

import java.util.*;

/**
 * Created by Morgan on 7/03/17.
 */
public class Ring {
    List<Personnage> joueurs = new ArrayList();

    public Ring(){}

    public List<Personnage> creerJoueur() {
        String strNom;
        String strClasse;

        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez votre nom : ");
        strNom = sc.nextLine();
        System.out.println("Bonjour " + strNom);
        //sc.nextLine(); //On vide la ligne avant d'en lire une autre

        System.out.println("Choisissez votre personnage : ");
        strClasse = sc.nextLine();
        System.out.println("Vous avez choisi un " + strClasse);
        //sc.nextLine(); //On vide la ligne avant d'en lire une autre

            /*
            String str = sc.nextLine();
            int i = sc.nextInt();
            double d = sc.nextDouble();
            long l = sc.nextLong();
            byte b = sc.nextByte();
            */


        strClasse = strClasse.toLowerCase();
        ListeClasse liste = ListeClasse.valueOf(strClasse);

        switch (liste) {
            case archer:
                joueurs.add(new Archer(strNom));
                break;
            case guerrier:
                joueurs.add(new Guerrier(strNom));
                break;
            case mage:
                joueurs.add(new Mage(strNom));
                break;
            default:
                System.out.println("Ceci n'est pas une classe valide!");
        }

        return joueurs;

    }

}
