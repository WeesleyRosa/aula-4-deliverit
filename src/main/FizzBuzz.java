package main;

public class FizzBuzz {

    public String doFizzBuzz(Integer numero){
        if(numero < 1 || numero > 100)
            throw new IllegalArgumentException();
        if(numero % 5 == 0)
            return "buzz";
        return null;
    }
    public String testString(Object valor){
        if(valor.getClass()==String.class) {
            throw new IllegalArgumentException();
        }
        if(valor.getClass() == Integer.class)
            throw new IllegalArgumentException();
        return null;
    }
}
