package RPG.Armes;

/**
 * Created by MPO on 01-Mar-17.
 */
public class ArmeBlanche extends Arme {
    public ArmeBlanche (ABlanche arme){
        super(arme.getNom(), arme.getDegat(), arme.getVitesse(), arme.getMagic());
    }
}
