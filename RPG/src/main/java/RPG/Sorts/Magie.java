package RPG.Sorts;

/**
 * Created by Morgan on 1/03/17.
 */
public abstract class Magie {
    protected int degat;
    protected int vitesse;
    protected Type type;
    protected Element element;

    public Magie(Type type, Element element){
        this.degat = type.sortDegat;
        this.vitesse = type.sortVitesse;
        this.type = type;
        this.element = element;
    }

    // Getters
    public int getDegat(){
        return this.degat;
    }

    public int getVitesse(){
        return  this.vitesse;
    }

    public Type getType(){
        return this.type;
    }

    public Element getElement(){
        return this.element;
    }

    // Setters
    public int setDegat(int degat){
        return this.degat = degat;
    }

    public int setVitesse(int vitesse){
        return this.vitesse = vitesse;
    }

    public Type setType(Type type){
        return this.type = type;
    }

    public Element setElement(Element element){
        return this.element = element;
    }
}
