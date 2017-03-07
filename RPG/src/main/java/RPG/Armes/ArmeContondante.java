package RPG.Armes;

/**
 * Created by MPO on 01-Mar-17.
 */
public class ArmeContondante extends Arme{
    public ArmeContondante (AContondante arme){
        super(arme.getNom(), arme.getDegat(), arme.getVitesse(), arme.getMagic());
    }
}
