/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

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
public class MainTest {

    int[][] matriz_entrada;
    int[][] matriz_esperada;
    Main main;

    public MainTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        matriz_entrada = new int[][]{{1, 2, 3},
                    {2, 3, 1},
                    {3, 1, 2}};
        matriz_esperada = new int[][]{{1, 2, 3},
                    {2, 3, 1},
                    {3, 1, 2}};
        main = new Main();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of sudoku method, of class Main.
     */
    @Test
    public void quandoPassamosSudokuResolvidoRetornamosSudokuResolvidoIgualAoPassado() {
        int[][] retorno = main.sudoku(matriz_entrada);
        assertArrayEquals(matriz_esperada, retorno);
    }

    @Test
    public void Sudoku_QuandoEstiverFaltandoUmElementoNaPrimeiraLinhaPrimeiraColuna_RetornaSudokuResolvido() {
        matriz_entrada[0][0] = 0;
        int[][] retorno = main.sudoku(matriz_entrada);
        assertArrayEquals(matriz_esperada, retorno);
    }

    @Test public void Sudoku_QuandoEstiverFaltandoElementoNaPrimeiraLinhaSegundaColuna(){
        matriz_entrada[0][1] = 0;
        int[][] retorno = main.sudoku(matriz_entrada);
        assertArrayEquals(matriz_esperada, retorno);
    }

    @Test public void Sudku_QuandoEstiverFaltandoElementoNaPrimeiraLinhaTerceiraColuna(){
        matriz_entrada[0][2]=0;
        int[][] retorno=main.sudoku(matriz_entrada);
        assertArrayEquals(matriz_esperada, retorno);
    }

}
