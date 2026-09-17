import java.util.ArrayList;
import java.util.Scanner;

public class navegacioMenus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> usuaris = new ArrayList<>();

        while (true){
            System.out.println("Benvingut al Menu Principal");
            System.out.println("Escull una opció:");
            System.out.println("1. Submenu d'usuaris");
            System.out.println("2. Comprobar l'estat del sistema");
            System.out.println("0. Sortir");

            switch (sc.nextInt()){
                case 1 -> usuaris = subMenu(sc, usuaris);
                case 2 -> System.out.println(usuaris.isEmpty() ? "No hi han usuaris" : "Hi han " + usuaris.size() + " usuaris");
                case 0 -> {
                    return;
                }
                default -> System.out.println("Has d'escollir una opció valida");
            }



        }
    }

    public static ArrayList<String> subMenu(Scanner sc, ArrayList<String> usuaris){
        while (true){
            System.out.println("Escull una opcio del submenu:");
            System.out.println("1. Llistar usuaris");
            System.out.println("2. Afegir usuari");
            System.out.println("0. Tornar al menu principal");

            switch (sc.nextInt()){
                case 1 -> {
                    if (usuaris.isEmpty()) System.out.println("No hi han usuaris");
                    else {
                        for (int i = 0; i < usuaris.size(); i++) {
                            System.out.println(i+1 + " " + usuaris.get(i));
                        }
                    }
                }

                case 2 -> {
                    System.out.println("Quin usuari vols afegir?");
                    sc.nextLine();
                    usuaris.addLast(sc.nextLine());
                    System.out.println("S'ha creat correctament l'usuari " + usuaris.getLast());
                }

                case 0 -> {
                    return usuaris;
                }
            }

        }
    }
}
