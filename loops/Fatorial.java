package loops;

import java.util.Scanner;
/**Fatorial:
* Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
* @author munirix
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um numero inteiro para ter seu fatorial ");
        int numero = scan.nextInt();
        int resultado=1;
        for(int i=1; i<=numero; i++){
            resultado *= i;
        }
        System.out.println("Fatorial: "+resultado);
        scan.close();
    }
}
