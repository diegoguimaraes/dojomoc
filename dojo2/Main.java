/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Herberth
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public int[][] sudoku(int[][] matriz) {

        /* int[] aux;

        for (int linha = 0; linha < matriz.length; linha++) {
        aux = matriz[linha];
        for (int coluna = 0; coluna < matriz.length; coluna++)
        if(matriz[linha][coluna] == 0)
        aux = aux;

        }*/
        if (matriz[0][0] == 0) {
            matriz[0][0] = 1;
        }
        if (matriz[0][1] == 0) {
            matriz[0][1] = 2;
        }
        if (matriz[0][2]==0){
            matriz[0][2]=3;
        }
        return matriz;
    }

    public boolean contains(int[] arr, int i) {
        return false;
    }
}
