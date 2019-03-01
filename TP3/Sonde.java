import java.util.Scanner;

public class Sonde extends Composant{


    protected Composant composant;
    protected String entree; 

    public Sonde (Composant pComposant, String pEntree){
	composant = pComposant;
	entree	= pEntree;

    }

    public boolean getEtat(){

        Scanner keyboard = new Scanner(System.in);
        boolean state;
     	System.out.println(entree + " de " + composant+ ", true or false?" );
     	
     	
    	state = keyboard.nextBoolean();
    	
    	return state;
    }
    
    
    public String description(){
    	return this.getId()+ " connectée à l'entrée " + entree + " du composant " + composant; 
    }
}
