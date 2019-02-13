/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

public class Vanne extends Composant {
	
	protected Composant in;
	
	public void setIn(Composant comp) {
		
		in = comp;
		
	}
	
	public String description(){
		if(in!=null){
			return this.getId() +" in: " +in.getId(); 
		}else{
			return this.getId() + "  in: non connecte"; 
		}
		
	}
	
}
