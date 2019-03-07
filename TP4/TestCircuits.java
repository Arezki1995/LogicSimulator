import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCircuits 
{
	static void printIds(Composant[] composants ){
	
		for(int i=0; i< composants.length; i++){
			System.out.println(composants[i].getId());
		}
	
	}


	static void traceEtats(Composant[] composants ) {
		
		for(int i=0; i< composants.length; i++){
			
			System.out.println(composants[i].traceEtat());
		}

	}

	static void test(Circuit circ){
		//test Nomenclature
		for (String  s: circ.nomenclature()) {
			System.out.println(s);
		}

		//test Description
		for (Interrupteur  sw: circ.getIns()) {
			System.out.println(sw.description());
		}

		for (Vanne v: circ.getOuts()) {
			System.out.println(v.description());
		}
		circ.traceEtats();
	}


	public static void main(String[] args) {
		//Construction
		
		Composant[] composants = new Composant[7];
		
		composants[0]= new Interrupteur();  //i 1
		composants[1]= new Interrupteur();  //i 2
		composants[2]= new Interrupteur();  //securite
		
		composants[3]= new Or();  	//or
		composants[4]= new Not();  //Not
		composants[5]= new And();  //And
		
		composants[6]= new Vanne(); // vanne
		//Connexions
		
			//Or
				//test de la sonde sur OR in1
				//((Or) composants[3]).setIn1(new LazySonde(composants[3],"in1"));
			((Or)composants[3]).setIn1(composants[0]);
			
			((Or)composants[3]).setIn2(composants[1]);
		
			//NOT
			((Not)composants[4]).setIn(composants[2]);
		
			//AND
			((And)composants[5]).setIn1(composants[3]);
			((And)composants[5]).setIn2(composants[4]);
		
			//Vanne
			((Vanne)composants[6]).setIn(composants[5]);

			System.out.println("CIRCUIT!");
			
			Circuit ckt= new Circuit("Amplifier",composants );
			test(ckt);

			
		
		
		//Affichage
		/*
		////////printIds(composants );
		////////test
		for(int i=0; i< composants.length; i++){
			System.out.println(composants[i].description());
		}
		*/

		//traceEtats(composants);
		
		
	
			

		
		System.out.println("Au revoir!");
	}
}
