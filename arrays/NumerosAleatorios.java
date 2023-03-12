package arrays;

import java.util.Random;

/**Números aleatórios:
* Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor. Ao final, mostre os números e seus sucessores.
* @author munirix
 */
public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[20];
        for(int i=0; i<vetor.length; i++){
            int numero = random.nextInt(100);
            vetor[i] = numero;
        }
        System.out.println("\n\nNumeros do vetor:\n");
        for (int i : vetor) {
            System.out.print((i) + " ");
        }
        System.out.println("\n\nSucessores:\n");
        for (int i : vetor) {
            System.out.print((i+1) + " ");
        }
    }
}
