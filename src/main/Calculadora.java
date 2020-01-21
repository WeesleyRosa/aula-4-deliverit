package main;

public class Calculadora {


    public Double soma(Double a, Double b){
        nulo(a,b);
        if(a != null && b != null) {
            return a + b;
        }
        return null;
    }

    public void nulo(Double a, Double b){
        if(a == null && b == null) {
            throw new IllegalArgumentException();
        }
        if((a == null && b >= 0) || (b == null && a >= 0)) {
            throw new IllegalArgumentException();
        }
    }

}
