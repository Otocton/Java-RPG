package RPG.Armes;

/**
 * Created by MPO on 28-Feb-17.
 */

public abstract class Arme implements iArme{
    protected String nom;
    protected int degat;
    protected int vitesse;
    protected boolean magic;

    public Arme(String nom, int degat, int vitesse, boolean magic){
        this.nom = nom;
        this.degat = degat;
        this.vitesse = vitesse;
        this.magic = magic;
    }

    // Custom
    public String attaquer(){
        return "j'attaque avec : "+ this.nom;
    }
    public String upgrade(){ return "j'upgrade : "+ this.nom; }

    // Getters
    public String getNom(){ return this.nom; }
    public int getDegat(){ return this.degat; }
    public int getVitesse(){ return this.vitesse; }
    public boolean getMagic(){ return this.magic; }
}
