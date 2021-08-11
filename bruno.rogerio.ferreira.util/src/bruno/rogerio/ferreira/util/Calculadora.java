package bruno.rogerio.ferreira.util;

import bruno.rogerio.ferreira.util.interno.Divisao;
import bruno.rogerio.ferreira.util.interno.Multiplicacao;
import bruno.rogerio.ferreira.util.interno.Soma;
import bruno.rogerio.ferreira.util.interno.Subtracao;

public class Calculadora {

    //atributos
    private Soma soma;
    private Subtracao subtracao;
    private Multiplicacao multiplicacao;
    private Divisao divisao;

    //Constrautor
    public Calculadora() {
        soma = new Soma();
        subtracao = new Subtracao();
        multiplicacao = new Multiplicacao();
        divisao = new Divisao();
    }

    //métodos
    public int soma(int a, int b) {
        return soma.executar(a, b);
    }

    public int subtracao(int a, int b) {
        return subtracao.executar(a, b);
    }

    public int multiplicacao(int a, int b) {
        return multiplicacao.executar(a, b);
    }

    public int divisao(int a, int b) {
        return divisao.executar(a, b);
    }

}
