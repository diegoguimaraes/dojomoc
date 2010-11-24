
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Herberth
 */
public class PrecoCatope {

    int[] livros;
    private final double PRECO_LIVRO = 8;

    public PrecoCatope(int[] livros) {
        this.livros = livros;
    }

    public double pegarPreco() {
        double soma = 0;

        if (livros.length == 1) {
            return PRECO_LIVRO;
        }

        if (livros.length == 2) {
            if (livros[0] == livros[1]) {
                return PRECO_LIVRO * 2;
            } else {
                return PRECO_LIVRO * 2 * 0.95;
            }
        }

        int bag[] = new int[]{0,0,0,0,0};

        if (livros.length > 2) {
            for (int i = 0; i < livros.length; i++) {
                bag[livros[i]-1]++;
            }
        }
        
        switch (numeroDiferentes) {
            case 1:
                soma += PRECO_LIVRO * livros.length;
                break;
            case 2:
                soma += (PRECO_LIVRO * 2 * 0.95) + (PRECO_LIVRO * (livros.length-2));
                break;
            case 3:
                soma += PRECO_LIVRO * 3 * 0.90;
                break;
        }

        return soma;
    }
}
