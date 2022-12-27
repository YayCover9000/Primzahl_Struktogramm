import java.util.Scanner;
import java.lang.Math;
public class QuadratWurzelRechner {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int ergebnis = QuadratWurzelRechner.quadratwurzelBerechnen();

    }
    public static int quadratwurzelBerechnen(){
        Scanner sc = new Scanner(System.in);
        int eingeleseneZahl = 0;
        int teiler;
        boolean primzahl;
        double a;
        //Wert für Methode SQRT einlesen
        System.out.println("Bitte zu Wurzelnde Zahl eingeben: ");
        a = sc.nextDouble();
        //Wert für Zahl einlesen (ist vlt der Zähler)
        System.out.println("Bitte zu Zahl eingeben: ");
        eingeleseneZahl = sc.nextInt();
        System.out.println("EingeleseneZahl: " + eingeleseneZahl);

        //Berechnung startet
        eingeleseneZahl += 1;
        teiler = 2;
        primzahl  = true;
        System.out.println("EingeleseneZahl: " + eingeleseneZahl);
        System.out.println(Math.sqrt(a));
        //do{

       // }while(primzahl == false || teiler>)
        return 0;
    }
}