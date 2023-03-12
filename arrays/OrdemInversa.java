package arrays;

import java.util.Scanner;

/**Ordem Inversa:
* Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
* @author munirix
 */
public class OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int[] vetor = new int[5];
        for(int i=0; i<vetor.length; i++){
            System.out.println("Insira o valor na posição "+i+": ");
            vetor[i]=scan.nextInt();
        }
        System.out.print("\nOrdem Inversa: ");
        for(int i=vetor.length-1; i>=0; i--){
            System.out.print(vetor[i]+" ");
        }
        scan.close();
    }
}
