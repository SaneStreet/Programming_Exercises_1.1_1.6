import javax.swing.*;

public class ProgrammingExercises_1 {
    public static void main(String[] args) {
        System.out.println("Opgave 1.1");
        //udskriver tekster og skifter linje
        System.out.println("Welcome to Java.");
        System.out.println("Learning Java Now.");
        System.out.println("Programming is fun.");

        System.out.println("Opgave 1.2");
        //for "løkke" der udskriver tekst så længe int (i) er under 5, og skifter linje.
        for (int i = 0; i < 5; i++) {
            System.out.println("I love Java");
        }

        System.out.println("Opgave 1.4");
        //udskriver tabellen og skfiter linje
        System.out.println("a   a^2   a^3   a^4");
        System.out.println("1   1     1     1");
        System.out.println("2   4     8     16");
        System.out.println("3   9     27    81");
        System.out.println("4   16    64    256");

        System.out.println("Opgave 1.5");
        //udregner variablen resultat, og udskriver resultat og skifter linje
        double resultat;
        resultat = (7.5 * 6.5 - 4.5 * 3)/(47.5 - 5.5);
        System.out.println("Resultatet er:" + resultat);

        System.out.println("Opgave 1.6");
        //udregner variablen resultatTo, og udskriver resultatet + skifter linje
        double resultatTo;
        resultatTo = (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
        System.out.println("Resultatet er :" + resultatTo);


    }
}
