package loops;

import java.util.Scanner;
/**Par e Ímpar:
* Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e a quantidade de números impares.
* @author munirix
 */
public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidade de numeros a serem entrados: ");
        int N = scan.nextInt();
        int par=0, impar=0, aux;
        do {
            System.out.println("Numero: ");
            aux = scan.nextInt();
            if(aux%2==0) par ++; 
            else impar ++;

            N--;
        } while (N>0);
        System.out.println("\nPares: "+par);
        System.out.println("Impar: "+impar);
        scan.close();
    }
}
