package br.com.alura.screenmatch.screenmatch.calculadora;

import br.com.alura.screenmatch.screenmatach.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo t){
        this.tempoTotal += t.getDuracaoEmMinutos();
    }

}
