
import java.util.Scanner;
public class LazySonde extends Sonde{
	protected boolean lazy;
	protected boolean state;

	public LazySonde(Composant pComposant, String pEntree){
		super(pComposant, pEntree);
		lazy = false;
	}

    public boolean getEtat(){
    
		if(lazy == false){
			Scanner keyboard = new Scanner(System.in);
        
		 	System.out.println(entree + " de " + composant+ ", true or false?" );
		 	
			state = keyboard.nextBoolean();
			lazy = true;
			
		}
		return state;
		

    }
    
    public void reset(){
    	lazy = false;
    }

}
