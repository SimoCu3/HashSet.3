/*
CONSEGNA:
Scrivere una funzione che restituisca un hashset riempito
Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
Svuotare l'hashset, verificarlo e stampare il risultato
*/

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        //Copio la lista
        HashSet<String> silverware1 = setSilverware();

        //Stampo lista
        System.out.println(" Lista: " + silverware1 + "\n");

        //Oggetto da cercare
        String findSilverware = "Spoon";

        //Verifico presenza dell'oggetto
        if (silverware1.contains(findSilverware)) {
            System.out.println("L'elemento \"" + findSilverware + "\" è presente nel set.");
            silverware1.remove(findSilverware);
            System.out.println("Elemento \"" + findSilverware + "\" è stato rimosso.");
        } else {
            System.out.println("L'elemento \"" + findSilverware + "\" non è presente nel set.");
        }

        //Stampo lista aggiornata
        System.out.println("\n Lista aggiornata: " + silverware1);

    }


    public static HashSet<String> setSilverware(){

        HashSet<String> silverware = new HashSet<>();

        silverware.add("Fork");
        silverware.add("Knife");
        silverware.add("Spoon");

        return silverware;
    }
}

/*
CORREZIONE:

*/