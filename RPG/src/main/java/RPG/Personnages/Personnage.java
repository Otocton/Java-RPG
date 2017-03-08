package RPG.Personnages;

import RPG.Armes.*;
import RPG.Personnages.Comportement.iDeplacement;
import RPG.Personnages.Comportement.Marcher;
import RPG.Sorts.*;

/**
 * Created by MPO on 28-Feb-17.
 */
public abstract class Personnage implements iMagie{
    protected String nom;
    protected int vie;
    protected iDeplacement deplacement = new Marcher();
    protected Arme arme;
    protected Sort sort;

    public Personnage(String nom, int vie, iDeplacement deplacement, Arme arme, Sort sort){
        this.nom = nom;
        this.vie = vie;
        this.deplacement = deplacement;
        this.arme = arme;
        this.sort = sort;
    }

    // Combat
    public void attaquer(Personnage ennemi){
        ennemi.setVie(this.arme);
    }
    public void upgradeArme(){this.arme.upgrade(); }

    // Magie
    public String isMagic(Sort sort){
        String str = "";
        if(this.arme.getMagic()) {
            str = "je lance un sort "+ sort.getType().getNom() + " de " + sort.getElement().getNom();
        }else{
            str = "Désolé, je n'ai pas de pouvoir magique";
        }
        return str;
    }

    public String lancerSort(){
        return isMagic(this.sort);
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
    public Sort getSort(){ return this.sort; }


    // Setters
    public void setDeplacement(iDeplacement deplacement){
        this.deplacement = deplacement;
    }

    public Arme setArme(Arme arme){ return this.arme = arme; }
    public Arme setArmeADistance(ADistance arme){ return this.arme = new ArmeADistance(arme);}
    public Arme setArmeBlanche(ABlanche arme){ return this.arme = new ArmeBlanche(arme);}
    public Arme setArmeContondante(AContondante arme){ return this.arme = new ArmeContondante(arme);}

    public Sort setSort(Type type, Element element){ return this.sort = new Sort(type, element); }
    public Sort setSortFeu(){ return this.sort = new Sort(Type.ECLAT, Element.FEU); }
    public Sort setSortGlace() { return this.sort = new Sort(Type.AURA, Element.GLACE); }
    public Sort setSortSoin(){ return this.sort = new Sort(Type.VAGUE, Element.SOIN); }

    public void setVie(Arme arme) {
        this.vie -= arme.getDegat();
    }

    // Default
    public String toString(){
        return "Je m'appelle " + this.nom + " et je me bats avec un(e) " + this.arme.getNom();
    }

}
