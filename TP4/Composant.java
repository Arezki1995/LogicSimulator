

public abstract class Composant implements Comparable<Composant>{
	//...
		public String getId()
	{
		
		return super.toString(); // class@numero renvoye par Object
		
	}
	
	abstract public String description();
	
	
	public abstract boolean getEtat() throws NonConnecteException;
	
	public String traceEtat() {
			
		try{
			return this.getId() + " ETAT: " + this.getEtat();
		}catch(NonConnecteException e){
			return this.getId() + " ETAT: COMPOSANT NON CONNECTE !" ;	
		}	
		
			
	}
	
	public int compareTo(Composant comp){
		return this.getId().compareTo(comp.getId());
	}
	
}
