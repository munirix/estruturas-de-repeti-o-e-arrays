package arrays;

import java.util.Scanner;

/**Consoantes:
* Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.
* @author munirix
 */
public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String consoantes = new String();
        int numeroDeConsoantes=0;
        System.out.println("Use apenas letras.");
        for(int i=0; i<6; i++){
            System.out.println("letra: ");
            String letra = scan.next();
            if(!(letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u"))){
                numeroDeConsoantes++;
                consoantes+=letra;
            }
        }

        System.out.println("Numero de Consoantes = "+numeroDeConsoantes);
        System.out.println("As consoantes = "+consoantes);
        scan.close();
        /*
Como limitar o tamanho de uma string em Java?
String texto = "osso"; String textoLimitado = texto. lenght <= 4 ? texto : texto. substring(0, 4);
         */
    }
}
