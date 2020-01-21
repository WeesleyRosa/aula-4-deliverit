package testes;

import main.Calculadora;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTeste {

    Calculadora calculadora = new Calculadora();

    @Test(expected=IllegalArgumentException.class)
    public void dadoQueNumerosInteirosNaoPodemSerNulos(){
        Double a = null;
        Double b = null;

        calculadora.nulo(a,b);
    }

    @Test(expected=IllegalArgumentException.class)
    public void dadoQueSomaDePrimeiroNuloeSegundoPositivoRetornaErro(){
        Double a = null;
        Double b = 1.0;

        calculadora.nulo(a,b);
    }

    @Test(expected=IllegalArgumentException.class)
    public void dadoQueSomaDePrimeiroPositivoeSegundoNuloRetornaErro() {
        Double a = 1.0;
        Double b = null;

        calculadora.nulo(a, b);
    }

    @Test
    public void dadoQueTemosDoisNumerosPositivosRetornaASoma(){
        Double a = 1.0;
        Double b = 1.0;

        Double somador = calculadora.soma(a,b);

        Assert.assertEquals(Double.valueOf(2.0), somador);
    }

    @Test
    public void dadoQueTemosDoisNumerosNegativosRetornaASoma(){
        Double a = -1.0;
        Double b = -1.0;

        Double somador = calculadora.soma(a,b);

        Assert.assertEquals(Double.valueOf(-2.0), somador);
    }

    @Test
    public void dadoQueTemosDoisNumerosPrimeiroNegativoSegundoPositivoRetornaASoma(){
        Double a = -1.0;
        Double b = 1.0;

        Double somador = calculadora.soma(a,b);

        Assert.assertEquals(Double.valueOf(0.0), somador);
    }

    @Test
    public void dadoQueTemosDoisNumerosPrimeiroPositivoSegundoNegativoRetornaASoma(){
        Double a = 1.0;
        Double b = -1.0;

        Double somador = calculadora.soma(a,b);

        Assert.assertEquals(Double.valueOf(0.0), somador);
    }


}
