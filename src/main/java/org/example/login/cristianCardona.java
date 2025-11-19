package org.example.login;

import java.util.Scanner;

public class cristianCardona {

    static void main() {

        String usuario;
        String usuarioBaseDatos= "usuario123";

        String correo;
        String correoBaseDatos="correo@ejemplo.com";

        String contraseña;
        String contraseñaBaseDatos="123";

        Scanner leerTeclado = new Scanner(System.in);

        Integer numeroIntentos=1;
        Integer intentosRestantes=4;
        while(numeroIntentos<=4){

            System.out.print("Digita tu usuario: ");
            usuario=leerTeclado.nextLine();

            System.out.print("Digita tu correo: ");
            correo=leerTeclado.nextLine();

            System.out.print("Digita tu contraseña: ");
            contraseña=leerTeclado.nextLine();

            if (correo.equals(correoBaseDatos) && contraseña.equals(contraseñaBaseDatos) && usuario.equals(usuarioBaseDatos)){
                System.out.println("Bienvenido! 🐵");
                break;
            }else{
                if (intentosRestantes>=2) {
                    intentosRestantes = intentosRestantes - 1;
                    System.out.println("Inténtalo de nuevo! Te quedan " + intentosRestantes + " intentos");
                } else {
                    System.out.println("Lo siento, no pudiste ingresar 😿");
                }
                numeroIntentos++;            }

        }
        }
}
