package RPG.Sorts;

import RPG.Sorts.Comportement.Feu;

/**
 * Created by Morgan on 1/03/17.
 */
public enum Sort {
    AURA("Aura", 4, 2),
    VAGUE("Vague", 3, 3),
    ECLAT("Eclat", 1, 5);


    protected String sortNom;
    protected int sortDegat;
    protected int sortVitesse;

    Sort(String nom, int degat, int vitesse){
        this.sortNom = nom;
        this.sortDegat = degat;
        this.sortVitesse = vitesse;
    }

    // Getters
    public String getNom(){ return this.sortNom; }
    public int getDegat(){ return this.sortDegat; }
    public int getVitesse(){ return this.sortVitesse; }
}
