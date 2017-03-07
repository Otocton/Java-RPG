package RPG.Sorts.Comportement;

/**
 * Created by Morgan on 5/03/17.
 */
public enum Type {
    FEU("feu"),
    GLACE("glace"),
    SOIN("soin");

    protected final String type;

    Type(String type){
        this.type = type;
    }

    // Getters
    public String getNom(){ return this.type; }

}
