/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kata;

/**
 *
 * @author Herberth
 */
public class BuscaBinaria {
    public static int procurar(int[] vetor, int valorProcurado){

        if (vetor.length==0)
            return -1;
        
        int pivot = (vetor.length-1)/2;
        
        
        if (vetor[pivot]==valorProcurado)
            return pivot;
        
        for(int posicao=0;posicao<vetor.length;posicao++){
            if(vetor[posicao] == valorProcurado)
               return posicao;
        }
        
        return -1;
    }
}