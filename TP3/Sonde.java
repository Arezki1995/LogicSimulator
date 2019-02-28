import java.util.Scanner;

public class Sonde extends{


    protected Composant composant;
    protected String entree; 

    public Sonde (Composant pComposant, String entree){

    }

    public getEtat(){

        Scanner keyboard = new Scanner(System.in);
        String state;
        do{
            System.out.println(entree + " de " + composant+ ", true or false?" );
            String state = keyboard.nextString();
            if(state=="true" || state =="false"){
                System.out.println("Je force: "+ state);
            }
        }while(state!="true" || state !="false");
    }

}