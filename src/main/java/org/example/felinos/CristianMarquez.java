package org.example.felinos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CristianMarquez {
    public static void main(String[] args) {

        Scanner pedirDato = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> felinos = new ArrayList<>();

        String decision = "entrar";
        while (!decision.equals("SALIR")) {
            System.out.println("Escribe 'SALIR' si deseas terminar");
            System.out.print("Escribe cualquier cosa para agregar el felino: ");
            decision = pedirDato.nextLine();
            System.out.println("Digitaste: " + decision);

            if (decision.equals("SALIR")) {
                break;
            }

            HashMap<String, Object> felino = new HashMap<>();
            System.out.print("Digita el nombre del felino: ");
            felino.put("Nombre", pedirDato.nextLine());

            System.out.print("Digita la fecha de entrada (ej. 2025-11-19): ");
            felino.put("FechaEntrada", pedirDato.nextLine());

            System.out.print("Digita los alimentos preferidos: ");
            felino.put("Alimentos", pedirDato.nextLine());

            System.out.print("Digita el ID del felino: ");
            felino.put("ID", pedirDato.nextInt());

            System.out.print("Digita la edad del felino: ");
            felino.put("Edad", pedirDato.nextInt());
            felinos.add(felino);


            System.out.println(felinos);
        }

        pedirDato.close();
    }
}
