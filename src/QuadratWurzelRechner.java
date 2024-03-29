import java.util.Scanner;
import java.lang.Math;
public class QuadratWurzelRechner {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double eingeleseneZahlInDouble;
        eingeleseneZahlInDouble = QuadratWurzelRechner.quadratwurzelBerechnen();
        System.out.println("naechste Primzahl ist: " + eingeleseneZahlInDouble);

    }
    public static double quadratwurzelBerechnen(){
        Scanner sc = new Scanner(System.in);
        double eingeleseneZahlDouble;
        int teiler;
        boolean primzahl;
        //Wert für Zahl einlesen (ist vlt der Zähler)
        System.out.println("Bitte Zahl eingeben: ");
        eingeleseneZahlDouble = sc.nextDouble();
        //Berechnung startet
        double quadratWurzel = 0;

/*
        System.out.println(quadratWurzel);
*/
        if(eingeleseneZahlDouble > 2) {

            do {
                eingeleseneZahlDouble += 1.0;
/*
                System.out.println("EingeleseneZahl + 1 = " + eingeleseneZahlDouble);
*/
                teiler = 2;
                primzahl  = true;
                do {
/*
                    System.out.println("eingegebeneZahlDoubl % teiler: " + eingeleseneZahlDouble%teiler);
*/
                    if(eingeleseneZahlDouble % teiler == 0.0){
                        primzahl = false;
                    }
                    teiler += 1;
/*
                    System.out.println("teiler in DO-While: " + teiler);
*/
                    quadratWurzel = Math.sqrt(eingeleseneZahlDouble);
                } while (primzahl == true && teiler <= (int)quadratWurzel);
/*
                System.out.println(quadratWurzel);
*/
            }while(!primzahl);
/*
            System.out.println("ERgebnis beider SChleifen: " + eingeleseneZahlDouble);
*/
        }else{
            if(eingeleseneZahlDouble == 2){
                primzahl = true;
            }else{
                primzahl = false;
            }
        }
        return eingeleseneZahlDouble;
    }
}