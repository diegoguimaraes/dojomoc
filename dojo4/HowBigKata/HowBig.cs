using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace HowBigKata
{
    public class HowBig
    {
        public int PegarQuantidadeDigitos(long valor)
        {
            if (valor == 0) return 1;
            int contador = 0;
            double resultadoFatoracao;
            do
            {
                resultadoFatoracao = Math.Pow(2, contador);
                contador++;
            } while (resultadoFatoracao <= valor);
            return --contador;
        }

    }
}
