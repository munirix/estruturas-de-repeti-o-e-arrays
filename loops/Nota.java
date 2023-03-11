package loops;

import java.util.Scanner;
/**Nota:
* Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
* @author munirix
 */
public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Insira uma nota entre 0 e 10: ");
        nota = scan.nextInt();
        
        while (nota<0 || nota>10) {
            System.out.println("Nota inválida. Digite novamente... ");
            nota = scan.nextInt();
        }
        
        scan.close();
        System.out.println("Fim do programa");
    }
    
}
