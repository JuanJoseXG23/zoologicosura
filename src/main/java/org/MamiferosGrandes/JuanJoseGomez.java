package MamiferosGrandes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JuanJoseGomez {

    public static void main(String[] args) {

        Scanner pedirDato = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> mamiferosGrandes = new ArrayList<>();

        String decision = "entrar";

        while (!decision.equals("SALIR")) {
            System.out.println("\nEscribe 'SALIR' si deseas terminar, si desas continuar digita enter");
            System.out.print("→ ");
            decision = pedirDato.nextLine();

            if (decision.equals("SALIR")) {
                break;
            }

            HashMap<String, Object> mamifero = new HashMap<>();

            System.out.print("Digita el nombre del mamífero: ");
            mamifero.put("Nombre", pedirDato.nextLine());

            System.out.print("Digita la fecha de entrada: ");
            mamifero.put("FechaEntrada", pedirDato.nextLine());

            System.out.print("Digita los alimentos preferidos: ");
            mamifero.put("Alimentos", pedirDato.nextLine());

            System.out.print("Digita el ID del mamífero: ");
            mamifero.put("ID", pedirDato.nextInt());

            System.out.print("Digita la edad del mamífero: ");
            mamifero.put("Edad", pedirDato.nextInt());

            mamiferosGrandes.add(mamifero);

            System.out.println("\nRegistro guardado:");
            System.out.println(mamifero);
        }

        System.out.println("\n=== Lista completa de mamíferos ===");
        System.out.println(mamiferosGrandes);

    }
}
