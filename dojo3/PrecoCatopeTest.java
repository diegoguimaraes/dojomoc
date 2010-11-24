/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Herberth
 */
public class PrecoCatopeTest {

    public PrecoCatopeTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void calcular_semLivros_retornaZero() {
        executaTestePadrao(new int[]{}, 0);
    }

    @Test
    public void calcular_umLivro_retornaOito() {

        executaTestePadrao(new int[]{1}, 8);
    }

    @Test
    public void calcular_doisLivrosIguais_retornaDezesseis() {

        executaTestePadrao(new int[]{1, 1}, 16);
    }

    @Test
    public void calcular_doisLivrosDiferentes_retorna15e20() {

        executaTestePadrao(new int[]{1, 2}, 15.2);
    }

    @Test
    public void calcular_doisLivrosIguaisEUmDiferente_retorna23e20() {

        executaTestePadrao(new int[]{1, 2, 2}, 23.2);
    }

    @Test
    public void calcular_tresLivrosIguais_Retorna24() {
        executaTestePadrao(new int[]{1, 1, 1}, 24);
    }

    @Test
    public void calcular_tresLivrosDiferentes_Retorna21e6() {
        executaTestePadrao(new int[]{1, 2, 3}, 21.6);
    }

    @Test
    public void calcular_quatroLivrosIguais_Retorna32() {
        executaTestePadrao(new int[]{1, 1, 1, 1}, 32);
    }

    @Test
    public void calcular_compraQuatroLivrosDoisTiposDeLivroIguais_Retorna_Retorna30e4(){
        executaTestePadrao(new int[]{1, 1, 2, 2}, 30.4);
    }

    private void executaTestePadrao(int[] cesta, double expectedValue) {
        PrecoCatope precoCatope = new PrecoCatope(cesta);
        double resultado = precoCatope.pegarPreco();
        assertEquals(expectedValue, resultado, 0);
    }
}
