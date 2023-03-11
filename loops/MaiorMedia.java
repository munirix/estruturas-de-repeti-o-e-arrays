package loops;

import java.util.Scanner;
/**Maior e Média:
* Faça um programa que leia 5 números e informe o maior número e a média desses números.
* @author munirix
 */
public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int media=0, maior=0, numero, i=0 ;
        System.out.println("Insira 5 numeros para ter a Media e o Maior valor: ");
        do {
            numero = scan.nextInt();
            media +=numero;
            if(numero>maior)
                maior=numero;
            i++;
        } while (i<5);
        media/=i;
        System.out.println("Maior numero: "+maior);
        System.out.println("Media: "+media);
        scan.close();
    }
}
