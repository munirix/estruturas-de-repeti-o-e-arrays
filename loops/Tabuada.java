package loops;

import java.util.Scanner;
/**Tabuada:
* Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
* Tabuada de 5: 5 X 1 = 5 5 X 2 = 10 ... 5 X 10 = 50
* @author munirix
 */
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um numero de 1 a 10 para gerar a tabuada: ");
        int numero = scan.nextInt();
        while(numero>10 || numero<0){
            numero = scan.nextInt();
        }
        String tabuada ="Tabuada de "+numero+":\n";
        for(int i=0;i<=10;i++){
            tabuada += numero +" X " + i + " = " + numero*i + "\n";
        }
        System.out.println(tabuada);
        scan.close();
    }
}
