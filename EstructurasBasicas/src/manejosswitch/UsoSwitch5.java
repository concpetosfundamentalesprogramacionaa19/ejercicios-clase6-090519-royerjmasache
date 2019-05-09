/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;

import java.util.Scanner;

/**
 *
 * @author royerjmasache
 */
public class UsoSwitch5 {
    /* Desarrollar una aplicación que me permita ingresar placas de carros. Se
    asume que las placas ingresadas pertenencen a la región Costa del Ecuador;
    en base a la placa nuestro programa determinará y presentará la placa con
    la provincia a la que pertenece
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaración de variables
        String placa = "";
        // Ingreso de datos
        System.out.println("Por favor ingrese la placa de su vehículo");
        placa = entrada.nextLine();
        // Toma de la primera incial de la placa
        char letra = placa.charAt(0);
        // Creación de estructura Switch
        switch(letra){
            case 'E':
                System.out.printf("Placa: %s, perteneciente a la provincia de"
                        + "Esmeraldas", placa);
                break;
            case 'M':
                System.out.printf("Placa: %s, perteneciente a la provincia de"
                        + " GBMManabí", placa);
                break;
            case 'J':
                System.out.printf("Placa: %s, perteneciente a la provincia de"
                        + " Santo Domingo de los Tsáchilas", 
                        placa);
                break;
            case 'R':
                System.out.printf("Placa: %s, perteneciente a la provincia de"
                        + "Los Ríos", placa);
                break;
            case 'G':
                System.out.printf("Placa: %s, perteneciente a la provincia de"
                        + " Guayas", placa);
                break;
            case 'Y':
                System.out.printf("Placa: %s, perteneciente a la provincia de"
                        + " Santa Elena", placa);
                break;
            case 'O':
                    System.out.printf("Placa: %s, perteneciente a la provincia"
                            + "de El Oro", placa);
                break;
            default:
                System.out.println("No pertenece a"
                        + "ninguna provincia de la Costa");
        }
    }
}
