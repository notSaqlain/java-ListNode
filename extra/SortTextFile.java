package extra;
import java.util.Scanner;

import LinkedList.ListaOrdinata;

public class SortTextFile {
    // usa treenode: leggi il file di testo, lo ordini salvando in una lista ordinata e lo stampi
    // use Tree.java and TreeNode.java

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaOrdinata<String> lista = new ListaOrdinata<>();
        Tree<String> tree = new Tree<>();

        System.out.println("Inserisci le parole (digita 'fine' per terminare):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("fine")) {
                break;
            }
            lista.addHead(input);
            tree.add(input);
        }

        System.out.println("Lista ordinata:");
        System.out.println(lista);

        System.out.println("Albero ordinato:");
        // tree.printTree(); // Implementa un metodo di stampa per l'albero se necessario

        scanner.close();
    }
}
