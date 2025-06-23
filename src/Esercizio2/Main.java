package Esercizio2;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Inserisci i km che percorrerà la tua auto (inserisci solo valori interi e non decimali) mi raccomando: ");
                int km = Integer.parseInt(scanner.nextLine());

                System.out.print("Inserisci i litri che la tua macchina consuma per km: ");
                int litri = Integer.parseInt(scanner.nextLine());


                int kmPerLitro = km / litri;

                System.out.println("Hai percorso " + kmPerLitro + " km per litro.");
            } catch (ArithmeticException | NumberFormatException e) {
                System.out.println("la tua macchina non puo consumare 0 ma soprattutto non puoi divide un numero per 0 (capra!), oppure hai inserito valori decimali (sai leggere?).");
            }

            scanner.close();
        }
    }

