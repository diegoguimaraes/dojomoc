/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kata;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import kata.*;
/**
 *
 * @author Herberth
 */
public class BuscaBinariaTest {

    @Test public void quando_ProcurarPosicao_Em_Lista_Vazia_Retorna_Menos_Um(){
        int posicaoVetor = BuscaBinaria.procurar(new int[]{}, 1);
        assertEquals(-1, posicaoVetor);
    }

    @Test public void quando_ProcurarPosicao_Em_Lista_Com_1_Elemento_Retorna_O_Mesmo(){
        int posicaoVetor = BuscaBinaria.procurar(new int[]{1}, 1);

        assertEquals(0, posicaoVetor);
    }

    @Test public void quando_ProcurarPosicao_Em_Lista_Com_1_Elemento_Que_Nao_Existe_Retorna_Menos_1(){
        int posicaoVetor = BuscaBinaria.procurar(new int[]{1}, 2);

        assertEquals(-1, posicaoVetor);
    }

    @Test public void quando_ProcurarPosicao_Em_Lista_Com_1_Elemento_Quem_Tem_O_Valor_Procurado(){
        int posicaoVetor = BuscaBinaria.procurar(new int[]{2}, 2);

        assertEquals(0, posicaoVetor);
    }

    @Test public void quando_ProcurarPosicao_Em_Lista_Com_2_Nao_Tenha_Valor_Procurado(){
        int posicaoVetor = BuscaBinaria.procurar(new int[]{2, 3}, 4);

        assertEquals(-1, posicaoVetor);
    }

    @Test public void quando_Procurar_Posicao_Em_Lista_Com_Dois_Valores_Iguais_E_Nao_Encontra(){
        int posicaoVetor = BuscaBinaria.procurar(new int[]{3, 3}, 4);

        assertEquals(-1, posicaoVetor);
    }

    @Test public void quandoPassarVetorComQuatroValoresIguaisRetornaPosicao1(){
        int posicaoVetor = BuscaBinaria.procurar(new int[]{3,3,3,3}, 3);

        assertEquals(1, posicaoVetor);
    }

    @Test public void quandoPassarVetorComCincoValoresIguaisRetornaPosicao2(){
        int posicaoVetor = BuscaBinaria.procurar(new int[]{3,3,3,3,3}, 3);
        assertEquals(2, posicaoVetor);
        //int[] teste = new int[]{1,2,3};
    }
}
