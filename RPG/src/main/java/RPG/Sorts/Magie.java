package RPG.Sorts;

import RPG.Sorts.Comportement.Type;

/**
 * Created by Morgan on 1/03/17.
 */
public abstract class Magie {
    protected int degat;
    protected int vitesse;
    protected Sort sort;
    protected Type type;

    public Magie(Sort sort, Type type){
        this.degat = sort.sortDegat;
        this.vitesse = sort.sortVitesse;
        this.sort = sort;
        this.type = type;
    }

    // Getters
    public int getDegat(){
        return this.degat;
    }

    public int getVitesse(){
        return  this.vitesse;
    }

    public Sort getSort(){
        return this.sort;
    }

    public Type getType(){
        return this.type;
    }

    // Setters
    public int setDegat(int degat){
        return this.degat = degat;
    }

    public int setVitesse(int vitesse){
        return this.vitesse = vitesse;
    }

    public Sort setSort(Sort sort){
        return this.sort = sort;
    }

    public Type setType(Type type){
        return this.type = type;
    }
}
