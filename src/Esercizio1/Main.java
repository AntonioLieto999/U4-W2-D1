package Esercizio1;

import java.util.Random;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int[] array = new int[5];

    public static void main(String[] args) {
        Random random = new Random();


        for (int i = 0; i < array.length; i++) {   //controllo del ciclo con l'insetto
            array[i] = random.nextInt(10) + 1;  //(lo chiamo cosi perchè fa ridere)
        }

        System.out.println("Array iniziale:");
        printArray();


        funzioneArray();
    }

    public static void funzioneArray() {


        int position;                      //da qui in poi utilizzo l'insetto per praticamente ogni riga di
                                           //codice per controllare il corretto funzionamento del programma
                                           //richiamo tutte le riga per capire bene dove il nostro insetto
                                           //si ferma concretamente
        try {
            position = Integer.parseInt(scanner.nextLine());

            if (position == -1) {
                System.out.println("Uscita dal programma.");
                return;
            }

            if (position < 0 || position >= array.length) {
                System.out.println("Errore: posizione non valida.");
                funzioneArray();
                return;
            }

            System.out.print("Inserisci il valore da inserire (0 per uscire): ");
            int valore = Integer.parseInt(scanner.nextLine());

            if (valore == 0) {
                System.out.println("Uscita dal programma.");
                return;
            }

            array[position] = valore;
            System.out.println("Array aggiornato:");
            printArray();

        } catch (NumberFormatException e) {
            System.out.println("Errore: input non valido.");
        }


        funzioneArray();
    }

    public static void printArray() {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
