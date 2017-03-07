package RPG.Personnages;

import RPG.Armes.Arme;
import RPG.Personnages.Comportement.iDeplacement;
import RPG.Personnages.Comportement.Marcher;
import RPG.Sorts.Comportement.Feu;
import RPG.Sorts.Comportement.Glace;
import RPG.Sorts.Comportement.Soin;
import RPG.Sorts.Magie;
import RPG.Sorts.Sort;
import RPG.Sorts.iMagie;

/**
 * Created by MPO on 28-Feb-17.
 */
public abstract class Personnage implements iMagie{
    protected String nom;
    protected int vie;
    protected iDeplacement deplacement = new Marcher();
    protected Arme arme;
    protected Magie magie;

    public Personnage(String nom, int vie, iDeplacement deplacement, Arme arme, Magie magie){
        this.nom = nom;
        this.vie = vie;
        this.deplacement = deplacement;
        this.arme = arme;
        this.magie = magie;
    }

    // Combat
    public void attaquer(){
        this.arme.attaquer();
    }
    public void upgradeArme(){this.arme.upgrade(); }

    // Magie
    public String isMagic(String sort, String type){
        String str = "";
        if(this.arme.getMagic()) {
            str = "je lance un sort "+ sort + " de " + type;
        }else{
            str = "Désolé, je n'ai pas de pouvoir magique";
        }
        return str;
    }

    public String lancerSort(){
        String sort = this.magie.getSort().getNom();
        String type = this.magie.getType().getNom();
        return isMagic(sort, type);
    }

    // Custom
    public String deplacer(){
        return this.deplacement.deplacer();
    }

    // Getters
    public String getNom(){ return this.nom; }
    public int getVie(){ return this.vie; }
    public iDeplacement getDeplacement(){ return this.deplacement; }
    public Arme getArme(){ return this.arme; }
    public Magie getMagie(){ return this.magie; }


    // Setters
    public void setDeplacement(iDeplacement deplacement){
        this.deplacement = deplacement;
    }
    public Arme setArme(Arme arme){ return this.arme = arme; }
    public Magie setSortFeu(){ return this.magie = new Feu(Sort.ECLAT); }
    public Magie setSortGlace() { return this.magie = new Glace(Sort.AURA); }
    public Magie setSortSoin(){ return this.magie = new Soin(Sort.VAGUE); }

    // Default
    public String toString(){
        return "Je m'appelle " + this.nom + " et je me bats avec un(e) " + this.arme.getNom();
    }

}
