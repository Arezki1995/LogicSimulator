public abstract class Porte2Entrees extends Porte
{
	protected Composant in1;
	protected Composant in2;
	
	public void setIn1(Composant comp)
	{
		in1 = comp;	
	}
	
	public void setIn2(Composant comp)
	{	
		in2 = comp;
	}
	
	
	
	public String description(){
		if(in1!=null){
			if(in2!=null){
				return this.getId() + "in1: "+in1.getId() + "   in2: "+in2.getId();
			}else{
				return this.getId() + "in1: "+in1.getId() + "   in2: non connecte";
			}
			 
		}else{
			if(in2!=null){
				return this.getId() + "  in1: non connecte  " + "in2: "+in2.getId();
			}else{
				return this.getId() + "  in1: non connecte" + "  in2: non connecte";
			} 
		}
		
	}
	
	public boolean getEtat() throws NonConnecteException {
		
		if (in1 == null) {
			
			throw new NonConnecteException();
			
		}
		else if (in2 == null) {
			
			throw new NonConnecteException();
			
		} else {
			
			return this.eval();
			
		}
	}
	
	abstract public boolean eval() throws NonConnecteException;
}
