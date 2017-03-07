package RPG.Armes;

/**
 * Created by MPO on 28-Feb-17.
 */
public enum ADistance {
    ARC("arc", 2, 2, false),
    ARBALETE("arbalète", 3, 1, false),
    FRONDE("fronde", 1, 3, false);

    protected final String nom;
    protected final int degat;
    protected final int vitesse;
    protected final boolean magic;

    ADistance(String nom, int degat, int vitesse, boolean magic){
        this.nom = nom;
        this.degat = degat;
        this.vitesse = vitesse;
        this.magic = magic;
    }

    // Getters
    public String getNom(){ return this.nom; }
    public int getDegat(){ return this.degat; }
    public int getVitesse(){ return this.vitesse; }
    public boolean getMagic(){ return this.magic; }

}
