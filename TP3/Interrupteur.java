/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */


public class Interrupteur extends Composant {
	//...
	
	protected boolean etat;
	
	
	
	
	public String description(){
		return this.getId() + " Interrupteur n a pas d entree"; 
		
	}
	
	
	public void on() {
		
		etat = true;
		
	}    
	
	public void off() {
		
		etat = false;
		
	}
	
	public boolean getEtat() throws NonConnecteException {
		
		return etat;
		
	}
	
	
}
