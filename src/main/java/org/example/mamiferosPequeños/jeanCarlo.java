package org.example.mamiferosPequeños;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class jeanCarlo {
    static void main() {
        Scanner pedirDato = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> mamiferosPequeños = new ArrayList<>();

        String decision = "entrar";
        while (!decision.equals("SALIR")) {
            System.out.println("Escribe 'SALIR' si deseas terminar");
            decision = pedirDato.nextLine();
            System.out.println("Digitaste: " + decision);

            if (decision.equals("SALIR")) {
                break;
            }

            HashMap<String, Object> mamifero = new HashMap<>();
            System.out.print("Digita el nombre del felino: ");
            mamifero.put("Nombre", pedirDato.nextLine());

            System.out.print("Digita la fecha de entrada (ej. 2025-11-19): ");
            mamifero.put("FechaEntrada", pedirDato.nextLine());

            System.out.print("Digita los alimentos preferidos: ");
            mamifero.put("Alimentos", pedirDato.nextLine());

            System.out.print("Digita la edad del felino: ");
            mamifero.put("Edad", pedirDato.nextInt());

            System.out.print("Digita el ID del felino: ");
            mamifero.put("ID", pedirDato.nextInt());


            mamiferosPequeños.add(mamifero);

            // Mostrar la lista de felinos
            System.out.println(mamiferosPequeños);
        }

        pedirDato.close();


    }
}
