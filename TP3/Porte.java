/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

public abstract class Porte extends Composant {

	public abstract boolean getEtat() throws NonConnecteException;

}
