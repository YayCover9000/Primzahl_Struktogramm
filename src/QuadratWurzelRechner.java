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
        double a;
        //Wert für Methode SQRT einlesen
        System.out.println("Bitte zu Wurzelnde Zahl eingeben: ");
        a = sc.nextDouble();
        //Wert für Zahl einlesen (ist vlt der Zähler)
        System.out.println("Bitte Zahl eingeben: ");
        eingeleseneZahlDouble = sc.nextDouble();
        System.out.println("EingeleseneZahl: " + eingeleseneZahlDouble);

        //Berechnung startet

        System.out.println("EingeleseneZahl + 1 = " + eingeleseneZahlDouble);
        double quadratWurzel;
        quadratWurzel = Math.sqrt(a);
        System.out.println(Math.sqrt(a));
        System.out.println(quadratWurzel);
        do {
            eingeleseneZahlDouble += 1.0;
            teiler = 2;
            primzahl  = true;
            do {
                eingeleseneZahlDouble = (eingeleseneZahlDouble / teiler);
                System.out.println("Eingelesene Zahl nach Mod Teiler: " + eingeleseneZahlDouble);
                    primzahl = false;
                    teiler += 1;
                    System.out.println("teiler in DO-While: " + teiler);
            } while (primzahl == false || teiler > quadratWurzel);
        }while(primzahl == true);
        System.out.println("ERgebnis beider SChleifen: " + eingeleseneZahlDouble);
    return eingeleseneZahlDouble;
    }
}