/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

public class Not extends Porte {
	
	

	
	
	protected Composant in;
	
	public void setIn(Composant comp) {
		in = comp;
	 	
	}
	
	public String description(){
		if(in!=null){
			return this.getId() + in.getId(); 
		}else{
			return this.getId() + "  in: non connecte"; 
		}
		
	}
	
}
