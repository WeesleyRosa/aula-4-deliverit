package testes;

import main.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTeste {

    @Test
    public void dadoQuedivisaoPorCINCOResultaZERO(){
        Integer numero = 5;

        FizzBuzz fizzBuzz= new FizzBuzz();

        String actual = fizzBuzz.doFizzBuzz(numero);

        Assert.assertEquals("buzz", actual);
    }

    @Test(expected = IllegalArgumentException.class)
        public void dadoQueNumeroMenorQueUMRetornaErro(){
        Integer limiteMenor = 0;

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.doFizzBuzz(limiteMenor);

    }

    @Test(expected = IllegalArgumentException.class)
    public void dadoQueNumeroMaiorQueCEMRetornaErro(){
        Integer limiteMaior = 101;

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.doFizzBuzz(limiteMaior);
    }

    @Test(expected = IllegalArgumentException.class)
    public void dadoQueValorInseridoComoStringRetornaErro(){
        Integer valor = 2;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.testString(valor);
    }
}