package arrays;

import java.util.Random;

/**Array Multidimensional:
* Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso determine o menor número da matriz e a sua posição(linha, coluna).
* @author munirix
 */
public class ArrayMultidimensional {
    public static void main(String[] args) {
        int [][] matriz = new int [4][4];
        int menorNumero=10;
        String posicaoMenorNumeo = "";
        Random random = new Random();
        for(int i=0; i<(matriz.length); i++){
            for(int j=0; j<(matriz.length); j++){
                int numero = random.nextInt(9);
                matriz[i][j] = numero;
                if(menorNumero>matriz[i][j]){
                    menorNumero=matriz[i][j];
                }
            }
        }
        for(int i=0; i<(matriz.length); i++){
            for(int j=0; j<(matriz.length); j++){
                System.out.print(matriz[i][j]+" ");
                if(menorNumero==matriz[i][j]){
                    posicaoMenorNumeo+="Linha: "+i+"\tColuna: "+j+"\n";
                }
            }
            System.out.println();
        }
        System.out.println("Menor numero = "+menorNumero+"\nPosição:\n"+posicaoMenorNumeo);
    }
}
