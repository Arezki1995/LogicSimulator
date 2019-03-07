import java.util.*;


public class Circuit {
 	protected String nom;
 	protected List<Composant> composants = new ArrayList<Composant>();
 	
 	public Circuit(String pNom, Composant[] cps){
		 nom = pNom;
		for(Composant c : cps){
			composants.add(c);
		} 
		
 		Collections.sort(composants);
 		
 	}

	public List<String> nomenclature(){

		List<String> nomen = new ArrayList<String>();
		for(Composant c : composants){
			nomen.add(c.getId());
		}	
		return nomen;
	}
	
	public void description(){
		System.out.println("CIRCUIT: "+ nom);
		for(Composant c : composants){
		
			System.out.println(c.description());
		}	
	}
	
	public void traceEtats(){
		System.out.println("CIRCUIT: "+ nom);
		for(Composant c : composants){
		
			System.out.println(c.traceEtat());
		}	
	}


	public List<Interrupteur> getIns(){
		List<Interrupteur> list_interrupteur = new ArrayList<Interrupteur>();
		for (Composant var : composants) {
			if(var instanceof Interrupteur) {
				list_interrupteur.add((Interrupteur)var);
			}
		}
		return list_interrupteur;
	}

	public List<Vanne> getOuts(){
		List<Vanne> list_vannes = new ArrayList<Vanne>();
		for (Composant var : composants) {
			if(var instanceof Vanne) {
				list_vannes.add((Vanne)var);
			}
		}
		return list_vannes;
	}

}
