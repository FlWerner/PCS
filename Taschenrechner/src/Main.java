import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        while(true) {
            double ergebnis=0;
            int option = 5;


            Scanner scanner = new Scanner(System.in);



            System.out.println("Hallo, das ist der Taschenrechner von der DT ISP. Wir passen das Programm der Firmen mentalität an.");
            System.out.println("Folgende Optionen stehen zur auswahl: \n" +
                    "Adddieren: 1 \n" +
                    "Subtrahieren: 2 \n" +
                    "Multiplizieren: 3 \n" +
                    "Dividieren: 4 \n" +
                    "Beenden: 5");


            System.out.println("Optionen auswählen: ");

            try {
                option = scanner.nextInt();
            }
            catch (InputMismatchException ex){
                System.out.println("Falsche Auswahl der Option");

            }

            if(option >= 5){
                System.out.println("Programm wird beendet");
                System.exit(0);
            }
            boolean loop = true;
            ArrayList<Double> liste = new ArrayList<>();

            while(loop) {
                System.out.println("Gebe sie die Zahl ein oder drücken sie X zum beenden: ");
                 String input= scanner.next();
                 if (!input.equals("X")){
                     try {
                         liste.add(Double.parseDouble(input));
                     }
                     catch (Exception ex){
                         System.out.println("Eingabefehler, geben sie nur Ganze zahlen ein");
                     }
                 } else if (input.equals("X")) {
                     loop = false;
                 }


            }

            switch (option) {
                case 1:
                    for(int i = 0; i < liste.size(); i++){
                        ergebnis = ergebnis + liste.get(i);
                    }
                    break;
                case 2:
                    ergebnis = liste.get(0);
                    for(int i = 1; i < liste.size(); i++){
                        ergebnis = ergebnis - liste.get(i);
                    }
                    break;
                case 3:
                    ergebnis = liste.get(0);
                    for(int i = 1; i < liste.size(); i++){
                        ergebnis = ergebnis * liste.get(i);
                    }
                    break;
                case 4:
                    ergebnis = liste.get(0);
                    for(int i = 1; i < liste.size(); i++){
                        ergebnis = ergebnis / liste.get(i);
                    }
                    break;
                default:
                    System.out.println("Falsche eingabe - Fehler");

            }
            System.out.println("Das ergebnis ist: " + ergebnis);

        }
    }
}
