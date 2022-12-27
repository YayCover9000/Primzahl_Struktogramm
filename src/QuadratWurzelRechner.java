import java.util.Scanner;
import java.lang.Math;
public class QuadratWurzelRechner {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double eingeleseneZahlDouble = 0;
        eingeleseneZahlDouble = QuadratWurzelRechner.quadratwurzelBerechnen(eingeleseneZahlDouble);
        System.out.println("naechste Primzahl ist: " + eingeleseneZahlDouble);

    }
    public static double quadratwurzelBerechnen(double eingeleseneZahlDouble){
        Scanner sc = new Scanner(System.in);
        //double eingeleseneZahlDouble = 0.0;
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
        eingeleseneZahlDouble += 1.0;
        teiler = 2;
        primzahl  = true;
        System.out.println("EingeleseneZahl + 1 = " + eingeleseneZahlDouble);
        double quadratWurzel;
        quadratWurzel = Math.sqrt(a);

        System.out.println(Math.sqrt(a));
            do{
                eingeleseneZahlDouble = eingeleseneZahlDouble % teiler;
                System.out.println("Eingelesene Zahl nach Mod Teiler: " + eingeleseneZahlDouble);
                if(eingeleseneZahlDouble == 0.0){
                    primzahl = true;
                    teiler += 1;
                }else{
                    return eingeleseneZahlDouble;
                }

            }while(primzahl == false || teiler > quadratWurzel);
        return 0;
    }
}