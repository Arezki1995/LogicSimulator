

import java.io.*;
import java.util.Scanner;

public class TestRectangle{
	static Rectangle creerRectangle(){
		double ox,oy,cx,cy;
		
    		Scanner scan = new Scanner( System.in );
 
		System.out.print("Enter Origin X:");
    		ox = scan.nextDouble();
		
		System.out.print("Enter Origin Y:");
    		oy = scan.nextDouble();

		System.out.print("Enter Corner X:");
    		cx = scan.nextDouble();

		System.out.print("Enter Corner Y:");
    		cy = scan.nextDouble();
		
		Rectangle rect = new Rectangle(ox,oy,cx,cy);	

		return rect;
	}
	
		
	static Rectangle lireRectangle(String[] args){
		
		System.out.println("READING PARAM FROM CLI:");

		
		Rectangle rect = new Rectangle(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2]),Double.parseDouble(args[3]));	

		return rect;
	}
	
	

	static void creerTableau(){
		
		System.out.println("TAILLE DU TABLEAU:");
		Scanner scan = new Scanner( System.in );
		int taille ;
		taille= scan.nextInt();
		
		Rectangle[] tableau;
		tableau = new Rectangle[taille];
		
		for(int i=0; i < taille ; i++){
			System.out.println("PARAMETRES RECTANGLE:"+ (i+1));
			tableau[i] = creerRectangle();
			System.out.println("--------------------------");
		}

		for(int i=0; i< taille; i++){
			System.out.println("AFFICHAGE RECTANGLE:"+ (i+1));
			System.out.println(tableau[i].toString());	
		}
		
		System.out.println("LE PLUS GRAND:");

		System.out.println(max(tableau));

	}


	static Rectangle max(Rectangle[] t){
		double maxSurf =0;
		int index=0;
	
		for(int i=0; i<t.length; i++){

			if(t[i].surface() > maxSurf){
				maxSurf = t[i].surface();				
				index= i;
			}	
		}
		
		return t[index];
	}

	public static void main(String[] args){
		
		
			
		
			//rectangle par le clavier
		//Rectangle r = creerRectangle();

			//rectangle par CLI
		//Rectangle r = lireRectangle(args);		

		creerTableau();
				
	
		//System.out.println( "LE RECTANGLE:" + r);
		//System.out.println( "LARGEUR:" + r.largeur());
		//System.out.println( "LONGEUR:" + r.longeur());
		//System.out.println( "SURFACE:" + r.surface());
		//System.out.println( "PERIMETRE:" + r.perimetre());
	}



}
