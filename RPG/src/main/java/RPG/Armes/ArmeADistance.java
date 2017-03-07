package RPG.Armes;

/**
 * Created by MPO on 01-Mar-17.
 */
public class ArmeADistance extends Arme {
    public ArmeADistance (ADistance arme){
        super(arme.getNom(), arme.getDegat(), arme.getVitesse(), arme.getMagic());
    }
}
