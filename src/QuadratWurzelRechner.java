import java.util.Scanner;
import java.lang.Math;
public class QuadratWurzelRechner {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double eingeleseneZahlInDouble = 0;
        eingeleseneZahlInDouble = QuadratWurzelRechner.quadratwurzelBerechnen();
        System.out.println("naechste Primzahl ist: " + eingeleseneZahlInDouble);

    }
    public static double quadratwurzelBerechnen(){
        Scanner sc = new Scanner(System.in);
        double eingeleseneZahlDouble = 0.0;
        int teiler;
        boolean primzahl;
        //Wert für Zahl einlesen (ist vlt der Zähler)
        System.out.println("Bitte Zahl eingeben: ");
        eingeleseneZahlDouble = sc.nextDouble();
        System.out.println("EingeleseneZahl: " + eingeleseneZahlDouble);

        //Berechnung startet


        double quadratWurzel;
        quadratWurzel = Math.sqrt(eingeleseneZahlDouble);
        System.out.println(Math.sqrt(eingeleseneZahlDouble));
        System.out.println(quadratWurzel);
        do {
            eingeleseneZahlDouble += 1.0;
            System.out.println("EingeleseneZahl + 1 = " + eingeleseneZahlDouble);
            teiler = 2;
            primzahl  = true;
            do {
                    if(eingeleseneZahlDouble % teiler == 0.0){
                        primzahl = false;
                    }
                teiler += 1;
                System.out.println("teiler in DO-While: " + teiler);
            } while (primzahl == true && teiler <= (int)quadratWurzel);
        }while(!primzahl);
        System.out.println("ERgebnis beider SChleifen: " + eingeleseneZahlDouble);
    return eingeleseneZahlDouble;
    }
}