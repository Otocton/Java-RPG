package RPG.Sorts;

/**
 * Created by Morgan on 5/03/17.
 */
public enum Element {
    FEU("feu"),
    GLACE("glace"),
    SOIN("soin");

    protected final String type;

    Element(String type){
        this.type = type;
    }

    // Getters
    public String getNom(){ return this.type; }

}
