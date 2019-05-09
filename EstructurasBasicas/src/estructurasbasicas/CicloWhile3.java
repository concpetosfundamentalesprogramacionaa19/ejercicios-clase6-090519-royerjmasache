/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class CicloWhile3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de Scanner
        Scanner entrada = new Scanner(System.in);
        // Declaración e inicialización de variables
        String mensajeFinal = "";
        String nombre = "";
        String apellido = "";
        String profesion = "";
        String option = "";
        boolean bandera = true;
        int contador = 1;
        // Acumulación de cadenas (String.format)
        mensajeFinal = String.format("%s%s%s",
                "Informe de la ciudad de Loja\n\n", "Listado de personas\n\n",
                mensajeFinal);
        // Estructurar Ciclo While
        while(bandera == true){
            // Ingreso de datos
            System.out.println("Ingrese su nombre:");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su apellido:");
            apellido = entrada.nextLine();
            System.out.println("Ingrese su profesión:");
            profesion = entrada.nextLine();
            // Acumulación de cadenas (String.format)
            mensajeFinal = String.format("%sPersona %d: %s %s - %s\n",
                    mensajeFinal, contador, nombre, apellido, profesion);
            // Incremento del contador para eviar ciclo infinito
            contador = contador + 1;
            System.out.println("Digite 1 para salir del ingreso de datos");
            option = entrada.nextLine();
            if(option.equals("1")){
                bandera = false;
            }
        System.out.printf("%s", mensajeFinal);
        }
    }
}